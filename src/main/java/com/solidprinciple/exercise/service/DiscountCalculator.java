package com.solidprinciple.exercise.service;

public interface DiscountCalculator {

    String calculate(Double orderTotal);

    Boolean supports(Voucher voucher);

}
