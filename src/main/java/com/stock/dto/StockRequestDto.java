package com.stock.dto;

import jakarta.validation.constraints.NotBlank;

public class StockRequestDto {

    @NotBlank
    private String symbol;

    @NotBlank
    private String name;

    @NotBlank
    private Double price;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
