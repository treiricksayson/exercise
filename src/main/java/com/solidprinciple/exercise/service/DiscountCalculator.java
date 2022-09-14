package com.solidprinciple.exercise.service;

public interface DiscountCalculator {

    String calculate(Double orderTotal);
    boolean supports(String voucher);
}
