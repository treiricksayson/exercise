package com.solidprinciple.exercise.web;

import java.security.InvalidParameterException;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DiscountOperation {

    private final Collection<CalculateDiscount> calculateDiscounts;

    public String calculateDiscount(Double orderTotal, String voucher) {
        for (CalculateDiscount calculateDiscount :  calculateDiscounts) {
            if (calculateDiscount.supports(voucher)) {
                return calculateDiscount.calculate(orderTotal);
            }
        }

        throw new InvalidParameterException("Invalid voucher: " + voucher);
    }

}
