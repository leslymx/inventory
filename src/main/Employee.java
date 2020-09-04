package main;

public class Employee {

   private String name;
   private String phoneNumber;
   private String address;

    public Employee (String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return  "Nombre: '" + name + '\'' +
                ", Telefono: '" + phoneNumber + '\'' +
                ", Direccion: '" + address;
    }
}
