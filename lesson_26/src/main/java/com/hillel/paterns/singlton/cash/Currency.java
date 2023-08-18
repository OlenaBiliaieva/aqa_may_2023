package com.hillel.paterns.singlton.cash;

public enum Currency {

    EUR("€"),
    USD("$"),
    UAH("grn"),
    GBP("£");

    private String sign;

    Currency(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
