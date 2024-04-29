package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
    public class PaisesController {
        private int acessos = 0;

        private List<String> paises = new ArrayList<>( List.of("Chile", "México", "Cuba", "Perú"));
        @GetMapping("/paises/{posicao}")
        public String paises(@PathVariable Integer posicao){
            String posicaoNaLista = paises.get(posicao);
            return posicaoNaLista;
        }

        @GetMapping("/novo/{nome}")
        public String adicionaLista(@PathVariable ){

        }
        
        @GetMapping("/acessos")
        public int acessos(){
            acessos++;
            return acessos;
        }
}
