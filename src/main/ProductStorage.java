package main;

import java.util.HashMap;

public class ProductStorage {

    private HashMap<String, Product> getMap() {
        Product list = new Product("AXMD8900", "LAPICERO", 30, 10);
        Product list2 = new Product("SASW5689", "HOJA DE PAPEL", 100, 2);

        HashMap<String, Product> map = new HashMap<String, Product>();
        map.put(list.getCode(), list);
        map.put(list2.getCode(), list2);
        return map;
    }

    public void printProducts() {
        for (Product i : this.getMap().values()) {
            System.out.println(i.toString());
        }
    }

    public void printElement(String code) {
        try {
            System.out.println("Resultado:\n " + this.getMap().get(code).toString());
        }
        catch (NullPointerException e) {
            System.out.println("Error: Inserte codigo valido. " + e.getMessage());
        }
    }

    public void updateElement(String code, int quantity) {
        try {
            Product codigo = this.getMap().get(code);
            codigo.setQuantity(quantity);
            this.getMap().put(codigo.getCode(), codigo);
            System.out.println(codigo.toString());
        }
        catch (NullPointerException e) {
            System.out.println("Error: No se pudo actualizar el producto " + e.getMessage());
        }
    }
}
