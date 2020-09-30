package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int opc;

        Menu listMenu = new Menu();
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage listEmployees = new EmployeeStorage();

        System.out.println("----- INVENTARIO -----");
        System.out.println("Seleccione la opcion tecleando el digito");
        System.out.println("1.Tiendas --- 2. Proveedores --- 3. Productos --- 4. Empleados");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                StoreStorage listStore = new StoreStorage();
                System.out.println("\nSeleccione la tienda tecleando el digito: \n 1. Tienda 1 \n 2. Tienda 2");
                listStore.printStore(scanner.nextInt());
                break;
            case 2:
                SupplierStorage listSuppliers = new SupplierStorage();
                System.out.println("Lista de proveedores:\n");
                listSuppliers.printSuppliers();
                break;
            case 3:
                System.out.println("\nDigite el numero de opcion: \n 1. Ver lista de productos\n 2. Buscar producto\n 3. Modificar inventario");
                listMenu.printResult(opc = scanner.nextInt());
                break;
            case 4:
                System.out.println("Lista de empleados\n");
                listEmployees.printEmployees();
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
