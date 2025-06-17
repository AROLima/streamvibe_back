package com.streamvibe.api.models.usuario;

public record DadosCadastroUsuario(
    String nome,
    String dataDeNascimento,
    String email,
    String senha,
    String cpf
) {

}
