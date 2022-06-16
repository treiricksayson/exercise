package com.solidprinciple.exercise.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateService {

    private final DiscountCalculatorFactory discountCalculatorFactory;

    public String calculateDiscount(Double orderTotal, Voucher voucher) {
        return discountCalculatorFactory.calculateDiscount(orderTotal, voucher);
    }

}
