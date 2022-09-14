package com.solidprinciple.exercise.service.calculator;

import com.solidprinciple.exercise.service.DiscountCalculator;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
public class FivePercentOffDiscountCalculator implements DiscountCalculator {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public String calculate(Double orderTotal) {
        orderTotal = orderTotal - orderTotal * 0.05;
        return formatter.format(orderTotal);
    }

    @Override
    public boolean supports(String voucher) {
        return voucher.equals("5PercentOff");
    }
}
