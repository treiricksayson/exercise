package com.solidprinciple.exercise.service.calculator;

import com.solidprinciple.exercise.service.DiscountCalculator;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
public class NoDiscountCalculator implements DiscountCalculator {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        return formatter.format(orderTotal);
    }

    @Override
    public boolean supports(String voucher) {
        return voucher.equals("noDiscount");
    }
}
