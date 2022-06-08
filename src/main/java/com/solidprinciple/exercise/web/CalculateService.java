package com.solidprinciple.exercise.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateService {

    private final DiscountOperation discountOperation;

    public String calculateDiscount(Double orderTotal, String voucher) {
        return discountOperation.calculateDiscount(orderTotal, voucher);
    }

}
