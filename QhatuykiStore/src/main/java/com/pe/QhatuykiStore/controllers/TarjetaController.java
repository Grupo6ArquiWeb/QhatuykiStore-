package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.entities.Tarjeta;
import org.modelmapper.ModelMapper;
import com.pe.QhatuykiStore.dtos.TarjetaDTO;
import com.pe.QhatuykiStore.servicesinterfaces.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tS;

    @PostMapping
    public void insertar(@RequestBody TarjetaDTO tarjetaDTO){
        ModelMapper m=new ModelMapper();
        Tarjeta c=m.map(tarjetaDTO, Tarjeta.class);
        tS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody TarjetaDTO tarjetaDTO){
        ModelMapper m=new ModelMapper();
        Tarjeta c=m.map(tarjetaDTO, Tarjeta.class);
        tS.insert(c);
    }

    @GetMapping
    public List<TarjetaDTO> listar(){
        return tS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
    	tS.delete(id);
    }

    @GetMapping("/tarjetaquery01")
    public List<TipoTarjetaMasUsadaDTO> tipoTarjetaMasUsada() {
        List<String[]> filaLista = tS.tipoTarjetaMasUsada();
        List<TipoTarjetaMasUsadaDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            TipoTarjetaMasUsadaDTO dto = new TipoTarjetaMasUsadaDTO();
            dto.setTipoTarjeta(columna[0]);
            dto.setCantidad(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }
    @GetMapping("/tarjetaquery02")
    public List<TarjetasMasProximasAVencerDTO> tarjetasMasProximasAVencer() {
        List<Object[]> filaLista = tS.tarjetasMasProximasAVencer();
        List<TarjetasMasProximasAVencerDTO> dtoLista = new ArrayList<>();

        for (Object[] columna : filaLista) {
            TarjetasMasProximasAVencerDTO dto = new TarjetasMasProximasAVencerDTO();
            dto.setNumeroTarjeta(columna[0].toString());
            dto.setFechaVencimiento((LocalDate) columna[1]);
            dto.setDiasRestantes(Integer.parseInt(columna[2].toString()));
            dtoLista.add(dto);
        }

        return dtoLista;
    }
}
