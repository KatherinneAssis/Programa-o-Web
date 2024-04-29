package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculosController {

    @GetMapping("/dobro/{numero}") // calculos/dobro/22
    public String dobro(@PathVariable Double numero){
        return "O dobro de %s é %s".formatted(numero, numero * 2);
    }

    @GetMapping("/media/{numero1}/{numero2}")
    public String media(@PathVariable Double numero1,@PathVariable Double numero2){
        return "A média entre %s e %s é %s".formatted(numero1, numero2, (numero1+numero2)/2);
    }

    @GetMapping("/resultado/{nota1}/{nota2}")
    public String resultado(@PathVariable Double nota1, @PathVariable Double nota2) {
        Double media = nota1 + nota2 / 2;
        String resposta = "";

        if (media >= 6) {
            resposta = "Parabens Aprovado!";
        } else if (media < 6) {
            resposta =  "Tente outra vez";
        }
        return resposta;
    }
}