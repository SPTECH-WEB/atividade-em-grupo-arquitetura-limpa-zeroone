package com.zeroone.at2.domain.valueobject;

public class Idade {
    private Integer value;

    public Boolean validarIdade(Integer value){
        return value >= 18 && value <= 100;
    }

    public Idade(Integer value){
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
