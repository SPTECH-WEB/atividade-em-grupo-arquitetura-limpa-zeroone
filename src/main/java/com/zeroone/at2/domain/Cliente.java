package com.zeroone.at2.domain;

import com.zeroone.at2.domain.valueobject.Email;
import com.zeroone.at2.domain.valueobject.Idade;
import com.zeroone.at2.domain.valueobject.Nome;
import com.zeroone.at2.domain.valueobject.Telefone;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private Nome nome;
    private Email email;
    private Telefone telefone;
    private String cpf;
    private Double rendaMensal;
    private Idade idade;
    private String profissao;

    public Cliente(UUID id, Nome nome, Email email, Telefone telefone, String cpf, Double rendaMensal, Idade idade, String profissao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Idade getIdade() {
        return idade;
    }

    public void setIdade(Idade idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
