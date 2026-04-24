package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

// Importante: As annotations leem o codigo até vc fechar os colchetes "{}" ou der ponto e virgula ";"
@Entity // Tudo até o final do colchetes {} de MissoesModel é uma Entity
@Table (name = "tb_missoes")
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
