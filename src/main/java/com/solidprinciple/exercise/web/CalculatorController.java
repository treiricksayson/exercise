package com.solidprinciple.exercise.web;

import com.solidprinciple.exercise.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("calculate/discount")
    public String calculateDiscount(@RequestParam("orderTotal") Double orderTotal,
                                    @RequestParam(value = "voucher", required = false, defaultValue = "noDiscount") String voucher) {
        return calculatorService.calculateDiscount(orderTotal, voucher);
    }
}
