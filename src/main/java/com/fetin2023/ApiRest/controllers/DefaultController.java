package com.fetin2023.ApiRest.controllers;

import com.fetin2023.ApiRest.entities.Aluno;
import com.fetin2023.ApiRest.services.DefaultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DefaultController {

    private final DefaultService defaultService;

    public DefaultController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @GetMapping("/hello")
    public String hello() {
        return defaultService.hello();
    }

    @PostMapping
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno) {
        Aluno criacao = defaultService.criarAluno(aluno);
        return new ResponseEntity<>(criacao, HttpStatus.OK);
    }

    @GetMapping("/todosalunos")
    public ResponseEntity<Iterable<Aluno>> findAll() {
        Iterable<Aluno> alunos = defaultService.findAll();
        return new ResponseEntity<>(alunos, HttpStatus.OK);
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Aluno> findByMatricula(@PathVariable int matricula) {
        Aluno aluno = defaultService.findByMatricula(matricula);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
}
