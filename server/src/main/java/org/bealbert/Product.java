package org.bealbert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Product {

    private String sku;
    private String itemName;
    private List<String> category = new ArrayList<>();
    private BigDecimal price;
    private boolean isCustomItem;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCustomItem() {
        return isCustomItem;
    }

    public void setCustomItem(boolean customItem) {
        isCustomItem = customItem;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = UUID.randomUUID().toString();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public void setCategory(List<String> category) {
        this.category = category;
    }

    public List<String> getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product(String sku, String itemName, List<String> category, BigDecimal price, boolean ) {
        this.sku = sku;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }
}
