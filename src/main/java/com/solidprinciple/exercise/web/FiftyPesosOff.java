package com.solidprinciple.exercise.web;

import java.text.NumberFormat;
import org.springframework.stereotype.Component;

@Component
public class FiftyPesosOff implements CalculateDiscount {

    private final NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String calculate(Double orderTotal) {
        Double discountedPrice = orderTotal - 50;
        return formatter.format(discountedPrice);
    }

    @Override
    public Boolean supports(String voucher) {
        return voucher.equalsIgnoreCase("50PesosOff");
    }

}
