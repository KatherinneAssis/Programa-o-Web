package com.example.projeto05GerenciamentoCarros;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private List<Carro> listaCarros = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Carro>> getCarros(){
        if (listaCarros.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(listaCarros);
    }

    @PostMapping
    public ResponseEntity<Carro> cadastraCarro(@RequestBody @Valid Carro novoCarro){
        if (novoCarro.buscarPlaca(novoCarro, listaCarros)){
            return ResponseEntity.status(400).build();
        }
        return ResponseEntity.status(201).body(novoCarro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> consultaID(@PathVariable UUID id){
        var idEncontrado = listaCarros.stream().
                filter(Carro -> Carro.getId().equals(id)).findFirst();
        if (!idEncontrado.isPresent()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(idEncontrado.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carro> DeleteID(@PathVariable UUID id){
        var idEncontrado = listaCarros.stream().
                filter(Carro -> Carro.getId().equals(id)).findFirst();
        if (!idEncontrado.isPresent()){
            return ResponseEntity.status(204).build();
        }
        listaCarros.remove(idEncontrado.get());
        return ResponseEntity.status(200).body(idEncontrado.get());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Carro> alterarPlaca(@PathVariable UUID id,
                                              @RequestBody AtualizacaoCarro attCarro){
        var idEncontrado = listaCarros.stream().
                filter(Carro -> Carro.getId().equals(id)).findFirst();
        if(!idEncontrado.isPresent()){
         ResponseEntity.status(304).build();
        }
        attCarro.atualizarPlaca(idEncontrado.get(), attCarro);
        return ResponseEntity.status(200).body(idEncontrado.get());
    }

    @GetMapping("/valor-medio")
    public ResponseEntity<Double> getMediaPorMarca(@RequestParam("marca") String marca){
        var idCarro = listaCarros.stream().filter(Carro -> Carro.getMarca().equals(marca))
                .mapToDouble(Carro::getPreco).average();
        if (!idCarro.isPresent()){
            return ResponseEntity.status(HttpStatusCode.valueOf(204)).build();
        }
        return ResponseEntity.status(HttpStatusCode
                .valueOf(200)).body(idCarro.getAsDouble());
    }

    @GetMapping("/simples-ipva")
    public ResponseEntity<List<CarroSimples>> getSimples(){
        if(listaCarros.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200)
                .body(CarroSimples.listaCarrosSimples(listaCarros));
    }
}