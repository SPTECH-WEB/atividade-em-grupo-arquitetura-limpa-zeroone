package com.zeroone.at2.domain.valueobject;

public class Idade {
    private Integer value;

    private Boolean validarIdade(Integer value){
        return value >= 18 && value <= 100;
    }

    public static Idade of(Integer value){
        return new Idade(value);
    }

    private Idade(Integer value){
        if (!validarIdade(value)){
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if(!validarIdade(value)){
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.value = value;
    }
}
