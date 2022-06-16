package com.solidprinciple.exercise.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateService {

    private final DiscountOperation discountOperation;

    public String calculateDiscount(Double orderTotal, Voucher voucher) {
        return discountOperation.calculateDiscount(orderTotal, voucher);
    }

}
