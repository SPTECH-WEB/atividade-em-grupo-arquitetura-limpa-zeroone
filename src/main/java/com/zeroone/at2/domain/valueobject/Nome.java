package com.zeroone.at2.domain.valueobject;

public class Nome {
    private String value;

    public Boolean validarNome(String value){
        return value != null && !value.isBlank() && value.length() >= 3;
    }

    public Nome(String value){
        if (!validarNome(value)){
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        if(!validarNome(value)){
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.value = value;
    }
}
