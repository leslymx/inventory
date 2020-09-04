package main;

public class Supplier {

    private String name;
    private String phoneNumber;
    private String address;

    public Supplier(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String toString() {
        return  "Proveedor: '" + name + '\'' +
                ", Telefono: '" + phoneNumber + '\'' +
                ", Direccion: '" + address;
    }
}

