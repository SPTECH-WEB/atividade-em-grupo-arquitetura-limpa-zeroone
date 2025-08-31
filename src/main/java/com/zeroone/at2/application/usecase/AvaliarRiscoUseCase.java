package com.zeroone.at2.application.usecase;

import com.zeroone.at2.domain.Cliente;
import com.zeroone.at2.domain.valueobject.enums.ClassificacaoRisco;

public class AvaliarRiscoUseCase {

    public ClassificacaoRisco avaliarRisco(Cliente cliente) {
        return ClassificacaoRisco.of(cliente.getRendaMensal(), cliente.getIdade());
    }
}

