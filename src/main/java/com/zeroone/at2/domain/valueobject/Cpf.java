package com.zeroone.at2.domain.valueobject;

import java.util.regex.Pattern;

public class Cpf {
    private String value;
    private static final Pattern DIGITS_PATTERN = Pattern.compile("^\\d{11}$");

    public Cpf() {
    }

    public Cpf(String value) {
        String formattedCPF = normalize(value);

        if (!isValid(formattedCPF)) {
            throw new IllegalArgumentException("CPF inválido: " + value);
        }
        this.value = formattedCPF;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private static String normalize(String cpf) {
        if (cpf == null) throw new IllegalArgumentException("CPF não pode ser nulo");
        String cpfDigits = cpf.replaceAll("\\D+", "");
        if (!DIGITS_PATTERN.matcher(cpfDigits).matches()) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos");
        }
        return cpfDigits;
    }

    private static boolean isValid(String cpf) {
        if (cpf.chars().distinct().count() == 1) return false;

        int digit1 = calculateDigits(cpf, 10);
        int digit2 = calculateDigits(cpf, 11);

        return (cpf.charAt(9) - '0') == digit1 &&
                (cpf.charAt(10) - '0') == digit2;
    }

    private static int calculateDigits(String cpf, int weight) {
        int total = 0;
        for (int index = 0; index < weight - 1; index++) {
            int num = cpf.charAt(index) - '0';
            total += num * (weight - index);
        }
        int remainder = total % 11;
        return remainder < 2 ? 0 : 11 - remainder;
    }
}
