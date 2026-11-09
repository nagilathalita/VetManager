package com.vetmanager.tutor;

import org.springframework.stereotype.Service;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public Tutor cadastrarTutor(TutorCadastroDTO dados) {

        Tutor tutor = new Tutor(
                dados.nome(),
                dados.telefonePrincipal()
        );

        tutor.setCpf(dados.cpf());
        tutor.setTelefoneSecundario(dados.telefoneSecundario());
        tutor.setEmail(dados.email());

        tutor.setCep(dados.cep());
        tutor.setLogradouro(dados.logradouro());
        tutor.setNumero(dados.numero());
        tutor.setComplemento(dados.complemento());
        tutor.setBairro(dados.bairro());
        tutor.setCidade(dados.cidade());
        tutor.setUf(dados.uf());

        return tutorRepository.save(tutor);
    }

}