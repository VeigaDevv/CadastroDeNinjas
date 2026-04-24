package dev.java10x.CadastroDeNinjas;

// Puxando da biblioteca JPA
import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // @Id informa que o atributo abaixo vai ser o id da classe(Long id;)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue para passar uma estrategia de como vai gerar o Id
    private Long id;
    private String nome;
    private String email;
    private int idade;

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