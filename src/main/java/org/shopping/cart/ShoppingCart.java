package org.shopping.cart;

import org.shopping.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<LineItem> lineItemList;

    public ShoppingCart() {
        lineItemList = new ArrayList<>();
    }

    public void addItem(Product p, int qty) {
        LineItem item = new LineItem(p, qty);
        lineItemList.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (LineItem item: lineItemList) {
            System.out.println("item_name: " + item.getItem().getName());
            System.out.println("item_type: " + item.getItem().getType());
            System.out.println("item_price: " + item.getItem().getPrice());
            totalPrice += item.getItem().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public Map<String, Double> getCart() {
        Map<String, Double> mp = new HashMap<>();
        lineItemList.forEach(item -> mp.put(item.getItem().getName(), item.getItem().getPrice() * item.getQuantity()));
        return mp;
    }
}
