package org.shopping.cart;

import org.shopping.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Product> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Product p) {
        itemList.add(p);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product item: itemList) {
            System.out.println("item_name: " + item.getName());
            System.out.println("item_type: " + item.getType());
            System.out.println("item_price: " + item.getPrice());
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public Map<String, Double> getCart() {
        Map<String, Double> mp = new HashMap<>();
        itemList.forEach(item -> mp.put(item.getName(), item.getPrice()));
        return mp;
    }
}
