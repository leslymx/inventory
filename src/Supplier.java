import java.util.HashMap;
import java.util.Map;

public class Supplier {

    String name;
    String place;
    String phoneNumber;

    public Supplier(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return this.name + " " + this.phoneNumber;
    }
}
