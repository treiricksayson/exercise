package com.solidprinciple.exercise.web;

import com.solidprinciple.exercise.service.CalculateService;
import com.solidprinciple.exercise.service.Voucher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CalculateController {

    private final CalculateService service;

    @GetMapping("calculate/discount")
    public String calculateDiscount(@RequestParam("orderTotal") Double orderTotal,
                                    @RequestParam(value = "voucher", required = false, defaultValue = "noDiscount") String voucher) {
        return service.calculateDiscount(orderTotal, Voucher.getVoucher(voucher));
    }

}
