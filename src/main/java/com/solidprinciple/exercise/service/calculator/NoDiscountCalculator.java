package com.solidprinciple.exercise.service.calculator;

import com.solidprinciple.exercise.service.DiscountCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@Component
@RequiredArgsConstructor
public class NoDiscountCalculator implements DiscountCalculator {

    private final NumberFormat formatter;
    @Override
    public String calculate(Double orderTotal) {
        return formatter.format(orderTotal);
    }

    @Override
    public boolean supports(String voucher) {
        return voucher.equals("noDiscount");
    }
}
