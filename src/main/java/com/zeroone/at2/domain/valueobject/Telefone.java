package com.zeroone.at2.domain.valueobject;

import com.zeroone.at2.domain.shared.ArgumentoInvalidoException;

public class Telefone {
    private final String value;

    public static Telefone of(String value) {
        if (value == null || value.replaceAll("\\D", "").length() < 11) {
            throw new ArgumentoInvalidoException("Telefone inválido");
        }
        return new Telefone(value);
    }

    private Telefone(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}