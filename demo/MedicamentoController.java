package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

   private List<Medicamento> medicamentos = new ArrayList<>();

   @GetMapping 
   public ResponseEntity<List<Medicamento>> getMedicamentos() {
       if (medicamentos.isEmpty()) {
           return ResponseEntity.status(204).build();
       }
       return ResponseEntity.status(200).body(medicamentos);
   }

   @PostMapping
   public ResponseEntity<Medicamento> criarMedicamento(@RequestBody @Valid Medicamento novoMedicamento) {
       medicamentos.add(novoMedicamento);
       return ResponseEntity.status(201).body(novoMedicamento);
   }

   @PatchMapping("/{indice}")
   public ResponseEntity<Medicamento> atualizar(@PathVariable int indice,
                           @RequestBody @Valid MedicamentoPatchValorQuantidade atualizacao) {

       if (indice < 0 || indice >= medicamentos.size()) {
           return ResponseEntity.status(404).build();
       }
       Medicamento medicamento = medicamentos.get(indice);
       medicamento.setValorUnd(atualizacao.getNovoValorUnd());
       medicamento.aumentarQuantidade(atualizacao.getQuantidadeEntrada());

       return ResponseEntity.status(200).body(medicamento);
   }

   @DeleteMapping("/{indice}")
    public ResponseEntity<Medicamento> deletarMedicamento(@PathVariable int indice){
       if(indice >= 0 || indice < medicamentos.size()){
           medicamentos.remove(indice);
           return ResponseEntity.status(204).build();
       }
       throw new ResponseStatusException(
               HttpStatusCode.valueOf(404), "Medicamento não encontrado");
   }

    @GetMapping("/controlados")
    public ResponseEntity<List<Medicamento>> PrecisaReceita() {
        return ResponseEntity.status(HttpStatus.OK).body(medicamentos.stream().filter(medicamento -> medicamento.isPrecisaReceita()).toList());
    }
}