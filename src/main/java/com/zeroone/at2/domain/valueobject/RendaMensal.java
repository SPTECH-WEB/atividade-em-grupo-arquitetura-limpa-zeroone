package com.zeroone.at2.domain.valueobject;

import com.zeroone.at2.domain.valueobject.enums.ClassificacaoRisco;

public final class RendaMensal {

    private Double value;
    private ClassificacaoRisco classificacaoRisco;

    public static RendaMensal of(Double value, Integer idade){
        if (value == null) {
            throw new IllegalArgumentException("Renda mensal não pode ser nula");
        }
        if (value.isNaN() || value.isInfinite()) {
            throw new IllegalArgumentException("Renda mensal inválida: " + value);
        }
        if (value < 0) {
            throw new IllegalArgumentException("Renda mensal não pode ser negativa");
        }
        return new RendaMensal(value, ClassificacaoRisco.of(value ,idade));
    }

    private RendaMensal(Double value, ClassificacaoRisco classificacaoRisco) {
        this.value = value;
        this.classificacaoRisco = classificacaoRisco;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ClassificacaoRisco getClassificacaoRisco() {
        return classificacaoRisco;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", value);
    }
}
