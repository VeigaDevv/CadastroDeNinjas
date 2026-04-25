package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Tudo até o final do colchetes {} de MissoesModel é uma Entity
@Table (name = "tb_missoes")
@Data // Criando automaticamente todos os Getters e Setters
@NoArgsConstructor // Criando automaticamente um construtor sem argumentos(vazio)
@AllArgsConstructor // Criando automaticamente um construtor com todos os argumentos(id, nome, email, idade, missoes)
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - Uma missão pode ter varios ninjas(ou seja, cada missão vai poder ter/participar/ser atribuida varios ninjas de uma vez)
    @OneToMany(mappedBy = "missoes") // Mapear e conectar atravez de uma chave estrangeira esse relacionamento
    private List<NinjaModel> ninjas;
}

// IMPORTANTE!!
// As annotations leem o codigo até vc fechar os colchetes "{}" ou der ponto e virgula ";"
// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API