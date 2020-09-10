package com.postgres.exemplo.controller;

import com.postgres.exemplo.repository.Pessoa;
import com.postgres.exemplo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/pessoa/{nome}/{cpf}")
    public void criarPessoa(@PathVariable String nome, @PathVariable long cpf) {
        pessoaRepository.save(new Pessoa(nome, cpf));
    }

    @GetMapping("/pessoa")
    public String busca() {
        return "ola";
    }

}
