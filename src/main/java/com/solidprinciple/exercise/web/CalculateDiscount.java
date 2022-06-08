package com.solidprinciple.exercise.web;

public interface CalculateDiscount {

    String calculate(Double orderTotal);

    Boolean supports(String voucher);

}
