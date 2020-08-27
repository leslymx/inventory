public class Store {

    int storeNumber;
    String telephoneNumber;
    String place;
    Employee employee;
    Product[] product;

    public Store(int storeNumber, String telephoneNumber, String place) {
        this.storeNumber = storeNumber;
        this.telephoneNumber = telephoneNumber;
        this.place = place;
    }

    public String toString() {
        return "Tienda: " + this.storeNumber + " Telefono: " + this.telephoneNumber + " Ubicación: " + this.place;
    }
}
