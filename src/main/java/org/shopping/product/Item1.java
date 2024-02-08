package org.shopping.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item1 extends Product {
    private static final ProductType type = ProductType.CLOTHING;

    public Item1(String name, double costPrice) {
        this.setName(name);
        this.setCostPrice(costPrice);
        this.setType(type);
    }

    @Override
    public double getPrice() {
        return this.getCostPrice();
    }
}
