package homeWork.simpleStore;

import java.util.Objects;

public class Products {
    String name;
    String description;
    int price;
    int quantity;
    Type productType;

    @Override
    public String toString() {
        return "{ name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", productType=" + productType +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getProductType() {
        return productType;
    }

    public void setProductType(Type productType) {
        this.productType = productType;
    }

    public Products(String name, String description, int price, int quantity, Type productType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public enum Type{
        FOOD,
        BOOK,
        SMUGGLING
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return price == products.price && quantity == products.quantity && name.equals(products.name) && description.equals(products.description) && productType == products.productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, quantity, productType);
    }
}
