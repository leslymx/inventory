package main;

public class Product {

    private String code;
    private String name;
    private int quantity;
    private int price;

    public Product(String code, String name, int quantity, int price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Codigo: '" + this.code + '\'' +
                ", Nombre: '" + this.name + '\'' +
                ", Existencia: " + this.quantity +
                ", Precio publico: " + this.price;
    }
}