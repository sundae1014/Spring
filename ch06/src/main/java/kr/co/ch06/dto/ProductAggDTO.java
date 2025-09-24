package kr.co.ch06.dto;

import lombok.Data;

@Data
public class ProductAggDTO {

    private int priceSum;
    private double priceAvg;
    private int priceMin;
    private int priceMax;
}
