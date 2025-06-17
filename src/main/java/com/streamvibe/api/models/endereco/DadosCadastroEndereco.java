package com.streamvibe.api.models.endereco;

public record DadosCadastroEndereco(
    String rua,
    int numero,
    String bairro,
    String cep,
    String cidade,
    String complemento
) {

}
