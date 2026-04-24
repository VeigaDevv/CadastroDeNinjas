package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") // Esse GetMapping vai pegar informações do meu metodo BoasVindas usando essa sintaxe
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }
}

// IMPORTANTE!!
// @GetMapping // Puxar/Pegar informações
// @PostMapping // Mandar informações
// @PutMapping // Alterar informações
// @PatchMapping // Também altera informações
// @DeleteMapping // Deleta informações