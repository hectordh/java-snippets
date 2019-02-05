package com.hharo.java;

import com.google.common.collect.Lists;
import com.hharo.java.entities.Employee;
import com.hharo.java.utils.EmployeeIdComparator;
import com.hharo.java.utils.EmployeeSalaryComparator;

import java.util.Collections;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        // Banderita de control
        boolean flag = false;

        // Creamos 3 instancias de empleado
        Employee e1 = new Employee(11, "Oscar", 17.9f);
        Employee e2 = new Employee(4, "Juan", 7.9f);
        Employee e3 = new Employee(23, "Graciela", 13.9f);

        // Creamos una lista de empleados
        List<Employee> employeeList = Lists.newArrayList(e1,e2,e3);

        // Imprimimos una lista de empleados sin ordenar.
        System.out.println("Lista de Empleados sin ordenar: ");
        System.out.println(employeeList);

        if (flag) {
            System.out.println("Lista de Empleados ordenada por Id: ");
            Collections.sort(employeeList, new EmployeeIdComparator());
            System.out.println(employeeList);
        } else {
            System.out.println("Lista de Empleados ordenada por salario: ");
            Collections.sort(employeeList, new EmployeeSalaryComparator());
            System.out.println(employeeList);
        }
    }
}
