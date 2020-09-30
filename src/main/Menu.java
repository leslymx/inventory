package main;

import java.util.Scanner;

public class Menu {

        Scanner scanner = new Scanner(System.in);
        ProductStorage products = new ProductStorage();

        public void printResult(int opc) {
                if (opc == 1) {
                    System.out.println("----- PRODUCTOS EN EXISTENCIA-----\n");
                    products.printProducts();
                } else if (opc == 2) {
                    System.out.println("Inserte codigo de producto");
                    products.printElement(scanner.next());
                } else if (opc == 3) {
                    System.out.println("Inserte codigo de producto y cantidad a modificar");
                    products.updateElement(scanner.next(), scanner.nextInt());
                } else {
                    System.out.println("Error: Opcion NO valida");
                }
        }
}
