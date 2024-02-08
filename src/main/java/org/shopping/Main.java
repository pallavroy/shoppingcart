package org.shopping;

import org.shopping.cart.ShoppingCart;
import org.shopping.offer.PercentOffProduct;
import org.shopping.offer.TypeOffProduct;
import org.shopping.product.Item1;
import org.shopping.product.Item2;
import org.shopping.product.Product;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ShoppingCart cart = new ShoppingCart();

        Product i1 = new TypeOffProduct(new PercentOffProduct(new Item1("Jeans", 100), 10), 10);
        Product i2 = new TypeOffProduct(new PercentOffProduct(new Item2("Watch", 500), 10), 10);

        cart.addItem(i1, 2);
        cart.addItem(i2, 1);

        System.out.println("\nCart total: " + cart.getTotalPrice());

        Map<String, Double> cartItems = cart.getCart();
        System.out.println("\nPrice breakdown:");
        cartItems.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}