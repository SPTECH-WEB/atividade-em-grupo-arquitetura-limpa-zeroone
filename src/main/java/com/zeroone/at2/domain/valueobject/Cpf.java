package com.zeroone.at2.domain.valueobject;

import java.util.regex.Pattern;

public class Cpf {
    private String value;
    private static final Pattern regex = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");

    public static Cpf of(String valor){
        if (!regex.matcher(valor).matches()){
            throw new IllegalArgumentException("CPF Inválido");
        }
        return new Cpf(valor);
    }

    private Cpf(String value) {
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
