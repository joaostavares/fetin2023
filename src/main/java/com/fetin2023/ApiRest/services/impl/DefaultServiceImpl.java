package com.fetin2023.ApiRest.services.impl;


import com.fetin2023.ApiRest.entities.Aluno;
import com.fetin2023.ApiRest.repositories.AlunoRepository;
import com.fetin2023.ApiRest.services.DefaultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultServiceImpl implements DefaultService {
    private final AlunoRepository alunoRepository;

    public DefaultServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }


    public String hello() {
        return "Hello Fetin!";
    }

    public Aluno criarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
        return aluno;
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findByMatricula(int matricula) {
        return alunoRepository.findByMatricula(matricula);
    }
}
