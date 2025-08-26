package com.zeroone.at2.domain.valueobject;


public class Email {
    private String value;

    public Email(String value) {
        if(!emailValido(value)){
            throw new IllegalArgumentException("email errado.");
        };
        this.value = value;
    }

    public Email() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean emailValido(String email) {
        return email.contains("@");
    }
}
