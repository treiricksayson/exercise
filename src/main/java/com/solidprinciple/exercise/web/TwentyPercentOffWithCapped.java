package com.solidprinciple.exercise.web;

import java.text.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class TwentyPercentOffWithCapped implements CalculateDiscount {

    private final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        Double discount20 = orderTotal * 0.2 > 150 ? 150 : orderTotal * 0.2;
        Double discountedPrice = orderTotal - discount20;
        return formatter.format(discountedPrice);
    }

    @Override
    public Boolean supports(String voucher) {
        return voucher.equalsIgnoreCase("20PercentOffCapped150");
    }

}
