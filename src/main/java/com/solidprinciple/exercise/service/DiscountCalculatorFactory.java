package com.solidprinciple.exercise.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.InvalidParameterException;
import java.util.Collection;

@Component
@RequiredArgsConstructor
public class DiscountCalculatorFactory {

    private final Collection<DiscountCalculator> discountCalculators;

    public String calculateDiscount(Double orderTotal, Voucher voucher) {
        return discountCalculators.stream()
                .filter(discountCalculator -> discountCalculator.supports(voucher))
                .findFirst()
                .orElseThrow(() -> new InvalidParameterException("Invalid voucher: " + voucher))
                .calculate(orderTotal);
    }

}
