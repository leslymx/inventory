public class Product {

    String code;
    String name;
    int quantity;
    Supplier supplier;

    public Product(String code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "Código: " + this.code + " Descripción: " + this.name + " Existencias: " + this.quantity;
    }
}
