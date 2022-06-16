package com.solidprinciple.exercise.service;

import java.text.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class FiftyPesosOff implements DiscountCalculator {

    private final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        Double discountedPrice = orderTotal - 50;
        return formatter.format(discountedPrice);
    }

    @Override
    public Boolean supports(Voucher voucher) {
        return voucher.equals(Voucher.FIFTY_PESOS_OFF);
    }

}
