package com.solidprinciple.exercise.service;

import java.text.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class FivePercentOff implements DiscountCalculator {

    private final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        Double discountedPrice = orderTotal - orderTotal * 0.05;
        return formatter.format(discountedPrice);
    }

    @Override
    public Boolean supports(Voucher voucher) {
        return voucher.equals(Voucher.FIVE_PERCENT_OFF);
    }

}
