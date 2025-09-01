package com.zeroone.at2.adapters.dtos;

import java.util.UUID;

public record ClienteEntityResponseDto(UUID id, String nome, String email, Double renda, String classificacaoRisco ) {
}
