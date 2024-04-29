package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")

public class FrasesController {

    @GetMapping("/cumprimentar")
    public String cumprimento(){
        return "Sejam bem-vindos á minha API";
    }

    @GetMapping("/boa-noite")
    public String boaNoite(){
        return "vem mimirrrr";
    }

    @GetMapping("/populacao-mundial")
    public Long populacao(){
        return 8_000_000_000L;
    }

    @GetMapping("/palmeiras-tem-mundial")
    public Boolean temMundial(){
        return false;
    }

}