package org.shopping.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item2 extends Product {
    private static final ProductType type = ProductType.ELECTRONICS;

    public Item2(String name, double costPrice) {
        this.setName(name);
        this.setCostPrice(costPrice);
        this.setType(type);
    }

    @Override
    public double getPrice() {
        return this.getCostPrice();
    }
}
