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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("ninjas/listar")
    public List<NinjaDTO> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("ninjas/listar/{id}")
    public NinjaDTO listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("ninjas/alterar/{id}")
    public NinjaDTO alterarNinjasPorID(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("ninjas/deletar/{id}")
    public void deletarNinjasPorID(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }


}

// IMPORTANTE!!
// @GetMapping // Puxar/Pegar informações
// @PostMapping // Mandar informações
// @PutMapping // Alterar informações
// @PatchMapping // Também altera informações
// @DeleteMapping // Deleta informações