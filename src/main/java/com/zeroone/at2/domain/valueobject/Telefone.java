package com.zeroone.at2.domain.valueobject;

public class Telefone {
    private String value;

    public Boolean validarTelefone(){
        return value.length() < 10;
    }

    public Telefone(String value) {
        if(!validarTelefone()){
            throw new IllegalArgumentException("telefone invalido");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
