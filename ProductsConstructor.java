package homeWork.simpleArrayList;

import homeWork.simpleStore.Products;

public class ProductsConstructor {
    String name;
    String description;
    int price;
    int quantity;
    Products.Type productType;

    public Products(String name, String description, int price, int quantity, Products.Type productType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    enum Type{
        FOOD,
        BOOK,
        SMUGGLING
    }

}
