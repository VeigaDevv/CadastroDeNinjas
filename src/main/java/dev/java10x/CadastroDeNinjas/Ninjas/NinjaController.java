package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") // Esse GetMapping vai pegar informações do meu metodo BoasVindas usando essa sintaxe
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninja";
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorID() {
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjasPorID() {
        return "Deletar Ninja por ID";
    }
}

// IMPORTANTE!!
// @GetMapping // Puxar/Pegar informações
// @PostMapping // Mandar informações
// @PutMapping // Alterar informações
// @PatchMapping // Também altera informações
// @DeleteMapping // Deleta informações