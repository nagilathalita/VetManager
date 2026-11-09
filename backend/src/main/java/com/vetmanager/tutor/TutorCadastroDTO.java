package com.vetmanager.tutor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public record TutorCadastroDTO(

        @NotBlank(message = "O nome do tutor é obrigatório")
        String nome,

        @NotBlank(message = "O telefone principal é obrigatório")
        String telefonePrincipal,

        String telefoneSecundario,

        String cpf,

        @Email(message = "Informe um endereço de e-mail válido")
        String email,

        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf

) {
}