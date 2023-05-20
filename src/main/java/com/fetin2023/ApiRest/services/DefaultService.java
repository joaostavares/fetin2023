package com.fetin2023.ApiRest.services;

import com.fetin2023.ApiRest.entities.Aluno;

import java.util.List;

public interface DefaultService {
    String hello();

    Aluno criarAluno(Aluno aluno);

    List<Aluno> findAll();

    Aluno findByMatricula(int matricula);

}
