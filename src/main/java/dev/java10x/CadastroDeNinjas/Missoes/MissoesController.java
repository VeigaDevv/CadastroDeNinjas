package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController // Tudo que está em {} da classe MissoesController vai ser um Controller
@RequestMapping // Mapear as APIs
public class MissoesController {

    // POST -- Mandar uma requisição para criar as missões
    @PostMapping("missoes/criar") // Rota que ele vai seguir "missoes/criar"
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    // GET -- Mandar uma requisição para mostrar as missões
    @GetMapping("missoes/listar")
    public String listarMissao() {
        return "Missão listadas com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar as missões
    @PutMapping("missoes/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar as missões
    @DeleteMapping("missoes/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }

}
