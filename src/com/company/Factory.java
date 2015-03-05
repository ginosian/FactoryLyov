package com.company;

import java.util.ArrayList;

/**
 * Created by Marta on 2/28/2015.
 */
public class Factory {

    private ArrayList<Employee> employees;

    public Factory() {
        employees = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
            return true;
        }
        return false;
    }
    public boolean removeEmployee(Employee employee) {
        if (employee != null) {
            if (employees.remove(employee)) {
                return true;
            }
        }
        return false;
    }
    public void printEmployeeInfo() {
        if (employees.size() == 0) {
            return;
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(i + 1 + ". ");
            employees.get(i).printInfo();
            System.out.println();
        }
    }
    public Employee getEmployee(int index) {
        return employees.get(index);
    }


}
