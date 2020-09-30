package main;

import java.util.HashMap;

public class SupplierStorage {
    private HashMap<String, Supplier> getMapSupplier() {
        Supplier supplier = new Supplier("PAPELERIA SA DE CV", "564678908", "MEXICO, MEXICO");
        Supplier supplier2 = new Supplier("FARMACIA SA DE CV", "554521908", "PUEBLA, PUEBLA");

        HashMap<String, Supplier> mapStore = new HashMap<String, Supplier>();
        mapStore.put(supplier.getName(), supplier);
        mapStore.put(supplier2.getName(), supplier2);
        return mapStore;
    }
    public void printSuppliers() {
        for (Supplier s : this.getMapSupplier().values()) {
            System.out.println(s.toString());
        }
    }
}
