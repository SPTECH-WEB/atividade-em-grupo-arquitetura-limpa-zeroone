package com.zeroone.at2.domain.valueobject;

import com.zeroone.at2.domain.shared.ArgumentoInvalidoException;

public class Nome {
    private String value;

    public Boolean validarNome(String value){
        return value != null && !value.isBlank() && value.length() >= 3;
    }

    public static Nome of(String value){
        return new Nome(value);
    }

    private Nome(String value){
        if (!validarNome(value)){
            throw new ArgumentoInvalidoException("Nome inválido.");
        }
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        if(!validarNome(value)){
            throw new ArgumentoInvalidoException("Nome inválido.");
        }
        this.value = value;
    }
}
