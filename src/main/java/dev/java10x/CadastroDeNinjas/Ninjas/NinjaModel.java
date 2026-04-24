package dev.java10x.CadastroDeNinjas.Ninjas;

// Puxando da biblioteca JPA
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// Importante: As annotations leem o codigo até vc fechar os colchetes "{}" ou der ponto e virgula ";"
// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API

@Entity // Tudo até o final do colchetes {} de NinjaModel é uma Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // @Id informa que o atributo abaixo vai ser o id da classe(Long id;)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue para passar uma estrategia de como vai gerar o Id
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma unica missão(ou seja, cada ninja só vai poder ter/participar/ser atribuida uma unica missão por vez)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Juntar as duas colunas(missões e ninjas) criando uma terceira coluna
    private MissoesModel missoes;


    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}