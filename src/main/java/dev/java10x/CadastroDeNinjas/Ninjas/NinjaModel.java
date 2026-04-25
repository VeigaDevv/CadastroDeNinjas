package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Tudo até o final do colchetes {} de NinjaModel é uma Entity
@Table(name = "tb_cadastro")
@Data // Criando automaticamente todos os Getters e Setters
@NoArgsConstructor // Criando automaticamente um construtor sem argumentos(vazio)
@AllArgsConstructor // Criando automaticamente um construtor com todos os argumentos(id, nome, email, idade, missoes)
public class NinjaModel {

    @Id // @Id informa que o atributo abaixo vai ser o id da classe(Long id;)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue para passar uma estrategia de como vai gerar o Id
    private Long id;

    private String nome;

    @Column(unique = true) // Usando @Column com unique = true faz com que não tenha itens repetidos nesse atributo da anotation(email)
    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma unica missão(ou seja, cada ninja só vai poder ter/participar/ser atribuida uma unica missão por vez)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Juntar as duas colunas(missões e ninjas) criando uma terceira coluna
    private MissoesModel missoes;

}

// IMPORTANTE!!
// As annotations leem o codigo até vc fechar os colchetes "{}" ou der ponto e virgula ";"
// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API