package com.zeroone.at2.domain.valueobject.enums;

import com.zeroone.at2.domain.shared.ArgumentoInvalidoException;
import com.zeroone.at2.domain.valueobject.Idade;
import com.zeroone.at2.domain.valueobject.RendaMensal;

import java.util.Objects;

public enum ClassificacaoRisco {
    BAIXO("Contato automático por e-mail", 3),
    MEDIO("Análise manual em até 48h", 2),
    ALTO("Contato telefônico em até 24h + análise crítica", 1);

    private final String estrategia;
    private final int prioridade;

    ClassificacaoRisco(String estrategia, int prioridade) {
        this.estrategia = Objects.requireNonNull(estrategia, "estrategia");
        this.prioridade = prioridade;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public static ClassificacaoRisco of(Double renda, Integer idade) {
        if (renda == null || idade == null) {
            throw new ArgumentoInvalidoException("Renda e idade não podem ser nulos");
        }

        double valorRenda = renda;
        int valorIdade = idade;

        if (valorRenda > 6000 && valorIdade > 30) {
            return BAIXO;
        } else if ((valorRenda >= 3000 && valorRenda <= 6000) || valorIdade <= 30) {
            return MEDIO;
        } else if (valorRenda < 3000) {
            return ALTO;
        }

        throw new IllegalStateException("Nenhuma classificação encontrada para renda=" + valorRenda + ", idade=" + valorIdade);
    }

    @Override
    public String toString() {
        return name() + " (prioridade " + prioridade + " | " + estrategia + ")";
    }
}


