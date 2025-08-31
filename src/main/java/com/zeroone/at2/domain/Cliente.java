package com.zeroone.at2.domain;

import com.zeroone.at2.domain.valueobject.*;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private Nome nome;
    private Email email;
    private Telefone telefone;
    private Cpf cpf;
    private RendaMensal rendaMensal;
    private Idade idade;
    private String profissao;

    public static Cliente newCliente(String nome, String email, String telefone, String cpf, Double rendaMensal, Integer idade, String profissao){
        return new Cliente(
                UUID.randomUUID(),
                Nome.of(nome),
                Email.of(email),
                Telefone.of(telefone),
                Cpf.of(cpf),
                RendaMensal.of(rendaMensal, idade),
                Idade.of(idade),
                profissao
        );
    }

    public static Cliente existingClient(String id, String nome, String email, String telefone, String cpf, Double rendaMensal, Integer idade, String profissao){
        return new Cliente(
                UUID.fromString(id),
                Nome.of(nome),
                Email.of(email),
                Telefone.of(telefone),
                Cpf.of(cpf),
                RendaMensal.of(rendaMensal, idade),
                Idade.of(idade),
                profissao
        );
    }

    private Cliente(UUID id, Nome nome, Email email, Telefone telefone, Cpf cpf, RendaMensal rendaMensal, Idade idade, String profissao) {
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

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public RendaMensal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(RendaMensal rendaMensal) {
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
