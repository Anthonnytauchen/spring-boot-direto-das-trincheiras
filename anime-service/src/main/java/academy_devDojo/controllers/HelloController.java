package academy_devDojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Devolver dados puros diretamente, quase sempre no formato JSON.
//@RequestMapping(value = "greetings")Use @RequestMapping no topo da sua classe de Controller para agrupar suas URLs.
public class HelloController {
   /*
O Assunto (O que você quer fazer?): Este é o verbo HTTP (GET, POST, DELETE).

GET: "Quero saber o preço de um produto." (Buscar informação)

POST: "Quero fazer uma nova compra." (Criar algo novo)

DELETE: "Quero cancelar meu pedido." (Remover algo)
    */
    @GetMapping("hi")// ou pode ser usado o ResquestMapping(method=)
    public String hi() {
        return "OMAW WA MOU SHINDE IRU";
    }
}
