package com.zeroone.at2.domain.valueobject;

public class Telefone {
    private String value;

    public static Telefone of(String value){
        return new Telefone(value);
    }

    private Boolean validarTelefone(){
        assert value != null;
        return value.length() < 10;
    }

    private Telefone(String value) {
        //if(!validarTelefone()){
         //   throw new IllegalArgumentException("telefone invalido");
        //}
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
