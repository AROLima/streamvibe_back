package com.streamvibe.api.models.usuario;

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

    public Usuario(DadosCadastroUsuario dados){
    this.nome = dados.nome();
    this.dataDeNascimento = dados.dataDeNascimento();
    this.email = dados.email();
    this.senha = dados.senha();
    this.cpf = dados.cpf();
    }

}

