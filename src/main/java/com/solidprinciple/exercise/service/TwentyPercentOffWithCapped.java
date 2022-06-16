package com.solidprinciple.exercise.service;

import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
public class TwentyPercentOffWithCapped implements DiscountCalculator {

    private final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        Double discount20 = orderTotal * 0.2 > 150 ? 150 : orderTotal * 0.2;
        Double discountedPrice = orderTotal - discount20;
        return formatter.format(discountedPrice);
    }

    @Override
    public Boolean supports(Voucher voucher) {
        return voucher.equals(Voucher.TWENTY_PERCENT_OFF_CAPPED_150);
    }

}
