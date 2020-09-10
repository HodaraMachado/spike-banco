package com.postgres.exemplo.repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tabela_teste")
public class Pessoa implements Serializable {
    private static final long  serialVersionUID = 1L;

    @Id
    private long cpf;
    private String nome;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public long getId() {
        return cpf;
    }

    public void setId(long id) {
        this.cpf = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
