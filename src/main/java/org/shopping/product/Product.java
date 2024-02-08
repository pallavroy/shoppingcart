package org.shopping.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
    private String name;
    private double costPrice;
    private ProductType type;

    public abstract double getPrice();
}
