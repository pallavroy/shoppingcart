package org.shopping.offer;

import org.shopping.product.Product;
import org.shopping.product.ProductType;

import java.util.HashSet;
import java.util.Set;

public class TypeOffProduct extends CouponDecorator {
    private Product item;
    private int percentageOffer;

    static Set<ProductType> eligibleTypes;
    static {
        eligibleTypes = new HashSet<>();
        eligibleTypes.add(ProductType.ELECTRONICS);
    }

    public TypeOffProduct(Product p, int pct) {
        this.item = p;
        this.percentageOffer = pct;
    }

    @Override
    public double getPrice() {
        double originalPrice = item.getPrice();
        if (eligibleTypes.contains(item.getType())) {
            return originalPrice - (percentageOffer * originalPrice) / 100;
        } else {
            return originalPrice;
        }
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
