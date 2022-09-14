package com.solidprinciple.exercise.service;

import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;
import java.util.Collection;

@Component
public class DiscountCalculatorFactory {

    private final Collection<DiscountCalculator> discountCalculatorCollection;

    public DiscountCalculatorFactory(Collection<DiscountCalculator> discountCalculatorCollection) {
        this.discountCalculatorCollection = discountCalculatorCollection;
    }

    public DiscountCalculator getDiscountCalculator(String voucher) {
        for (DiscountCalculator discountCalculator : discountCalculatorCollection) {
            if (discountCalculator.supports(voucher)) {
                return discountCalculator;
            }
        }
        throw new InvalidParameterException("Invalid voucher: " + voucher);
    }
}
