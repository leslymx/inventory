package main;

import java.util.HashMap;

public class Storage {

    private HashMap<Integer, Store> getMapStore() {
        Store store1 = new Store(1, "3423467890", "PUEBLA, PUEBLA");
        Store store2 = new Store(2, "7865490342", "MEXICO, MEXICO");

        HashMap<Integer, Store> map = new HashMap<Integer, Store>();
        map.put(store1.getId(), store1);
        map.put(store2.getId(), store2);
        return map;
    }

    public void printStore(int id) {
        try{
            System.out.println("Informacion general de tienda: \n " + this.getMapStore().get(id).toString());
        }
        catch (NullPointerException e){
            System.out.println("Error: No se pudo obtener la informacion de la tienda: " + e.getMessage());
        }
    }

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
