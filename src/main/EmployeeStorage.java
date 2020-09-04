package main;

import java.util.HashMap;

public class EmployeeStorage {

    private HashMap<String, Employee> getMapEmployee() {
        Employee employee1 = new Employee("LUIS", "4534234356", "AVENIDA #1, CALLE NORTE");
        Employee employee2 = new Employee("ARTURO", "657898905", "CERRADA #45, CALLE SUR");

        HashMap<String, Employee> map = new HashMap<String, Employee>();
        map.put(employee1.getName(), employee1);
        map.put(employee2.getName(), employee2);
        return map;
    }

    public void printEmployees() {
        for (Employee i: this.getMapEmployee().values()) {
            System.out.println(i.toString());
        }
    }
}
