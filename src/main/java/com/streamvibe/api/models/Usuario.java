package com.streamvibe.api.models;

//import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity

public class Usuario {
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private String cpf;
}
