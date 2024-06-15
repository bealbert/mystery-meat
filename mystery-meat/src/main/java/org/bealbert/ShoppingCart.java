package org.bealbert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Map<String, BigDecimal> cart = new HashMap<>();

    public Map<String, BigDecimal> getCart() {
        return cart;
    }

    public void addToCart(String itemName, BigDecimal price) {
        cart.put(itemName, price);
    }

    public void removeFromCart(String itemname, BigDecimal price) {
        cart.remove(itemname, price);
    }

    public ShoppingCart(Map<String, BigDecimal> cart) {
        this.cart = cart;
    }

    public BigDecimal getCartTotal() {
        return new BigDecimal(0);
    }
}
