package com.solidprinciple.exercise.service.calculator;

import com.solidprinciple.exercise.service.DiscountCalculator;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
public class FiftyPesosOffDiscountCalculator implements DiscountCalculator {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public String calculate(Double orderTotal) {
        orderTotal = orderTotal - 50;
        return formatter.format(orderTotal);
    }

    @Override
    public boolean supports(String voucher) {
        return voucher.equals("50PesosOff");
    }
}
