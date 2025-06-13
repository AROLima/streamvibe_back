package com.streamvibe.api.models;

//import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity

public class Filme {
    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;
    private String genero;
    private String diretor;
    private String elenco;
    private String sinopse;

    
}
