import java.lang.reflect.Type;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        String code;

        /*Store*/
        Store store1 = new Store(1, "8965743209", "MEXICO");
        Store store2 = new Store(2, "8965743256", "CDMX");
        /*Map Store*/
        Map<Integer, Store> mapTienda = new HashMap<Integer, Store>();
        mapTienda.put(store1.storeNumber, store1);
        mapTienda.put(store2.storeNumber, store2);


        /*Products*/
        Product product1 = new Product("AMX3547", "PALOMITA", 40);
        Product product2 = new Product("AMD8990", "CLAVO", 67);
        Product product3 = new Product("ERI4510", "LAPICERO", 13);
        /*Map Products*/
        Map<String, Product> map = new HashMap<String, Product>();
        map.put(product1.code, product1);
        map.put(product2.code, product2);
        map.put(product3.code, product3);

        /*Supplier*/
        Supplier supplier1 = new Supplier("FARMACIAS SA DE CV", "343565878878");
        Supplier supplier2 = new Supplier("PAPELERIA SA DE CV", "232378712900");
        /*Map Supplier*/
        Map<String, Supplier> mapSupplier = new HashMap<String, Supplier>();
        mapSupplier.put(supplier1.name, supplier1);
        mapSupplier.put(supplier2.name, supplier2);

        System.out.println(" 1. Lista de tiendas \n 2. Lista de Proveedores \n 3. Buscar productos");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("--- TIENDAS ---");
                for (Store i : mapTienda.values()) {
                    System.out.println(i.toString());
                }
                System.out.println("\n SELECCIONAR LA TIENDA");
                System.out.println(" Tienda 1 \n Tienda 2");
                opc = scanner.nextInt();

                if (opc == 1) {
                    System.out.println("Información general: " + store1.telephoneNumber + " " + store1.place);
                    System.out.println("Seleccione la opción tecleando el número");
                    System.out.println("\n 1. Lista de Productos \n 2. Lista de Proveedores \n 3. Inventario");
                    opc = scanner.nextInt();
                    if (opc == 1) {
                        for (Product i : map.values()) {
                            System.out.println("PRODUCTOS EN EXISTENCIA PARA TIENDA " + store1.storeNumber);
                            System.out.println(i.toString());
                        }
                    } else if (opc == 2) {
                        System.out.println("PROVEEDORES");
                        for (Supplier i : mapSupplier.values()) {
                            System.out.println(i.toString());
                        }
                    } else if (opc == 3) {
                        Date date = new Date();
                        System.out.println("Clave de producto a editar");
                        Product result = map.get(code = scanner.next());
                        if (code.length() <= 0) {
                            System.out.println("ERROR: Debe de insertar un código de producto");
                            return;
                        }
                        System.out.println(" PRODUCTO:  " + result.code + " | " + result.name + " | " + result.quantity);
                        System.out.println("Inserte la nueva existencia para: " + result.code);
                        int quantityProduct = scanner.nextInt();
                        result.quantity = quantityProduct;
                        map.put(result.code, result);
                        System.out.println("----- Nuevo resultado -----");
                        System.out.println("CÓDIGO: " + result.code + "\n" + "DESCRIPCIÓN: " + result.name + "\n" + "EXISTENCIAS: " + result.quantity + "\n");
                        System.out.println("Fecha y hora de última modificación: " + date);
                    } else {
                        System.out.println("ERROR!");
                    }
                } else if (opc == 2) {
                    System.out.println("Información general: \n" + store2.telephoneNumber + " " + store2.place);
                    System.out.println(" 1. Lista de Productos \n 2. Lista de Proveedores \n 3. Inventario");
                    opc = scanner.nextInt();
                    if (opc == 1) {
                        for (Product i : map.values()) {
                            System.out.println("PRODUCTOS EN EXISTENCIA PARA TIENDA " + store2.storeNumber);
                            System.out.println(i.toString());
                        }
                    } else if (opc == 2) {
                        for (Supplier i : mapSupplier.values()) {
                            System.out.println("PROVEEDORES");
                            System.out.println(i.toString());
                        }
                    } else if (opc == 3) {
                        Date date = new Date();
                        System.out.println("Clave de producto a editar");
                        Product result = map.get(code = scanner.next());
                        if (code.length() <= 0) {
                            System.out.println("ERROR: Debe de insertar un código de producto");
                            return;
                        }
                        System.out.println(" PRODUCTO:  " + result.code + " | " + result.name + " | " + result.quantity);
                        System.out.println("Inserte la nueva existencia para: " + result.code);
                        int quantityProduct = scanner.nextInt();
                        result.quantity = quantityProduct;
                        map.put(result.code, result);
                        System.out.println("----- Nuevo resultado -----");
                        System.out.println("CÓDIGO: " + result.code + "\n" + "DESCRIPCIÓN: " + result.name + "\n" + "EXISTENCIAS: " + result.quantity + "\n");
                        System.out.println("Fecha y hora de última modificación: " + date);
                    } else {
                        System.out.println("ERROR!");
                    }
                } else {
                    System.out.println("ERROR: Seleccione una tienda");
                }
                break;
            case 2:
                System.out.println("--- PROVEEDORES ---");
                System.out.println("|Nombre| |TELEFONO|");
                for (Supplier i : mapSupplier.values()) {
                    System.out.println(i.toString());
                }
                break;
            case 3:
                System.out.println("--- BUSCAR PRODUCTOS ---");
                System.out.println("INSERTE CODIGO DE PRODUCTO");

                code = scanner.next();

                if (code.length() <= 0) {
                    System.out.println("ERROR: No inserto el código a buscar");
                    return;
                }
                Product result = map.get(code);
                System.out.println("Producto: " + result.name + " Existencias: " + result.quantity);
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }
    }
}
