package com.solidprinciple.exercise.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final DiscountCalculatorFactory discountCalculatorFactory;

    public CalculatorService(DiscountCalculatorFactory discountCalculatorFactory) {
        this.discountCalculatorFactory = discountCalculatorFactory;
    }

    public String calculateDiscount(Double orderTotal, String voucher) {
        return discountCalculatorFactory.getDiscountCalculator(voucher).calculate(orderTotal);
    }
}
