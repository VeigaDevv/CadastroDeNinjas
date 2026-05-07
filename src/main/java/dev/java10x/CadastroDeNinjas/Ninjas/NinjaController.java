package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    // Injetando a dependencia NinjaService na classe NinjaController
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas") // Esse GetMapping vai pegar informações do meu metodo BoasVindas usando essa sintaxe
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }


    // Adicionar Ninja (CREATE)
    @PostMapping("ninjas/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("ninjas/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("ninjas/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("ninjas/alterarID")
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