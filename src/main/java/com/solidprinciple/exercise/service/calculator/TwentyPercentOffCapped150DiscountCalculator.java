package com.solidprinciple.exercise.service.calculator;

import com.solidprinciple.exercise.service.DiscountCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
@RequiredArgsConstructor
public class TwentyPercentOffCapped150DiscountCalculator implements DiscountCalculator {

    private final NumberFormat formatter;
    public String calculate(Double orderTotal) {
        double discount20 = orderTotal * 0.2 > 150 ? 150 : orderTotal * 0.2;
        orderTotal = orderTotal - discount20;
        return formatter.format(orderTotal);
    }

    @Override
    public boolean supports(String voucher) {
        return voucher.equals("20PercentOffCapped150");
    }
}
