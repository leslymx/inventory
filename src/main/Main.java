package main;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opc;

        ProductStorage listProducts = new ProductStorage();
        EmployeeStorage listEmployees = new EmployeeStorage();
        Storage listStorage = new Storage();

        System.out.println("----- INVENTARIO -----");
        System.out.println("Seleccione la opcion tecleando el digito");
        System.out.println("1.Tiendas --- 2. Proveedores --- 3. Productos --- 4. Empleados");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\nSeleccione la tienda tecleando el digito: \n 1. Tienda 1 \n 2. Tienda 2");
                listStorage.printStore(scanner.nextInt());
                break;
            case 2:
                System.out.println("Lista de proveedores:\n");
                listStorage.printSuppliers();
                break;
            case 3:
                System.out.println("\nDigite el numero de opcion: \n 1. Ver lista de productos\n 2. Buscar producto\n 3. Modificar inventario");
                opc = scanner.nextInt();
                if (opc == 1) {
                    System.out.println("----- PRODUCTOS EN EXISTENCIA-----\n");
                    listProducts.printProducts();
                }
                else if(opc == 2) {
                    System.out.println("Inserte codigo de producto");
                    listProducts.printElement(scanner.next());
                }
                else if(opc == 3){
                    System.out.println("Inserte codigo de producto y cantidad a modificar");
                    listProducts.updateElement(scanner.next(), scanner.nextInt());
                }
                else {
                    System.out.println("Error: Opcion NO valida");
                }
                break;
            case 4:
                System.out.println("Lista de empleados\n");
                listEmployees.printEmployees();
                break;
            default:
                System.out.println("Opcion invalida");
        }
        Test test1 = new Test();
        test1.testing();
    }
}