package com.zeroone.at2.domain.valueobject;

import com.zeroone.at2.domain.valueobject.enums.ClassificacaoRisco;

public final class RendaMensal {

    private Double value;
    private ClassificacaoRisco risco;

    public RendaMensal(Double value) {
        if (value == null) {
            throw new IllegalArgumentException("Renda mensal não pode ser nula");
        }
        if (value.isNaN() || value.isInfinite()) {
            throw new IllegalArgumentException("Renda mensal inválida: " + value);
        }
        if (value < 0) {
            throw new IllegalArgumentException("Renda mensal não pode ser negativa");
        }
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ClassificacaoRisco getRisco() {
        return risco;
    }

    public void setRisco(ClassificacaoRisco risco) {
        this.risco = risco;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", value);
    }
}
