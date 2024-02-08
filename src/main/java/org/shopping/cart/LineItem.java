package org.shopping.cart;

import lombok.Getter;
import lombok.Setter;
import org.shopping.product.Product;

@Getter
@Setter
public class LineItem {
    private Product item;
    private int quantity;

    public LineItem(Product p, int qty) {
        this.item = p;
        this.quantity = qty;
    }
}
