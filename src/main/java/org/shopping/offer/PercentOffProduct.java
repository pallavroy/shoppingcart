package org.shopping.offer;

import lombok.Getter;
import lombok.Setter;
import org.shopping.product.Product;
import org.shopping.product.ProductType;

@Getter
@Setter
public class PercentOffProduct extends Product {
    private Product item;
    private int percentageOff;

    public PercentOffProduct(Product p, int pct) {
        this.item = p;
        this.percentageOff = pct;
    }

    @Override
    public double getPrice() {
        return item.getPrice() - (percentageOff * item.getPrice()) / 100;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public ProductType getType() {
        return item.getType();
    }

    @Override
    public double getCostPrice() {
        return item.getCostPrice();
    }
}
