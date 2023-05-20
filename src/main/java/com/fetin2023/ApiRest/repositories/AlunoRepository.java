package com.fetin2023.ApiRest.repositories;

import com.fetin2023.ApiRest.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long > {
    Aluno findByMatricula(int matricula);
}
