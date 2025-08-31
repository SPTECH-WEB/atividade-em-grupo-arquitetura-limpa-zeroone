package com.zeroone.at2.adapters.dtos;

public record ClienteEntityRequestDto(String nome, String email, String cpf, String telefone, Double rendaMensal, Integer idade, String profissao) {
}
