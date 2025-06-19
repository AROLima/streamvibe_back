package com.streamvibe.api.models.filme;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "Filmes") annotoation para nomear a tabela

public class Filme {

    @Id // annotation para definir o atributo como chave primária. deve vir da importação do jakarta.(JPA)
    @GeneratedValue (strategy = GenerationType.IDENTITY) //gera automaticamente o id no banco de dados.
    private Integer id;

    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String diretor;
    private String elenco;
    private String sinopse;

    public Filme(DadosCadastroFilme dados){
        this.nome = dados.nome();
        this.estudio = dados.estudio();
        this.duracao = dados.duracao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.diretor = dados.diretor();
        this.elenco = dados.elenco();
        this.sinopse = dados.sinopse();
    }

}
