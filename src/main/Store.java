package main;

public class Store {

    private int id;
    private String phoneNumber;
    private String place;

    public Store(int id, String phoneNumber, String place) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.place = place;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Tienda: " + this.id +
                ", Telefono: '" + this.phoneNumber + '\'' +
                ", Direccion: " + this.place;
    }
}
