package com.solidprinciple.exercise.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;
import java.text.NumberFormat;

@RequiredArgsConstructor
@RestController
public class CalculateController {

    @GetMapping("calculate/discount")
    public String calculateDiscount(@RequestParam("orderTotal") Double orderTotal,
                                    @RequestParam(value = "voucher", required = false, defaultValue = "noDiscount") String voucher) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        switch (voucher) {
            default:
                throw new InvalidParameterException("Invalid voucher: " + voucher);
            case "noDiscount":
                return formatter.format(orderTotal);
            case "5PercentOff":
                orderTotal = orderTotal - orderTotal * 0.05;
                return formatter.format(orderTotal);
            case "50PesosOff":
                orderTotal = orderTotal - 50;
                return formatter.format(orderTotal);
            case "20PercentOffCapped150":
                double discount20 = orderTotal * 0.2 > 150 ? 150 : orderTotal * 0.2;
                orderTotal = orderTotal - discount20;
                return formatter.format(orderTotal);
        }
    }
}
