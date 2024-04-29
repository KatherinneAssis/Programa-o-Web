package sptech.projetojpa2.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa2.dtos.CompositorSimplesResponse;
import sptech.projetojpa2.dtos.QuantosCompositoresResponse;
import sptech.projetojpa2.repositorio.CompositorRepository;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/compositores")
public class CompositorController {

    @Autowired
    private CompositorRepository repository;

    @PatchMapping(value = "/compositor/documento/{codigo}", consumes = "text/csv")
    public ResponseEntity<Void> patchDocumento(@PathVariable Integer codigo, @RequestBody byte[] novoDocumento){
        var documento = repository.findById(codigo).get();
        documento.setDocumento(novoDocumento);
        repository.save(documento);

        return status(204).build();
    }

    @GetMapping(value = "/simples")
    public ResponseEntity<List<CompositorSimplesResponse>> getSimples(){
        return status(200).body(repository.findSimples());
    }

    @GetMapping("/relatorio")
    public ResponseEntity<QuantosCompositoresResponse> getCompositoresRelatorio(){
    return status (200).body(new QuantosCompositoresResponse(repository.count()));
    }
}