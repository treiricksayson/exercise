package com.solidprinciple.exercise.service;

import java.util.Arrays;

public enum Voucher {

    FIFTY_PESOS_OFF("50PesosOff"),

    FIVE_PERCENT_OFF("5PercentOff"),

    TWENTY_PERCENT_OFF_CAPPED_150("20PercentOffCapped150");

    private final String name;

    Voucher(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public static Voucher getVoucher(String name){
        return Arrays.stream(Voucher.values())
                .filter(voucher -> voucher.getName().equalsIgnoreCase(name)).findFirst()
                .orElse(null);
    }
}
