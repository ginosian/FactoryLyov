package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Factory factory = new Factory();
        do {
            if (menu(factory)) { return; }
        } while (true);
    }

    public static boolean menu(Factory factory) {
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Print Information");
        System.out.println("4. Exit");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Enter Name, age, salary");
                factory.addEmployee(new Employee(scanner.next(), scanner.nextInt(), scanner.nextFloat()));
                break;
            case 2:
                System.out.println("Choose the Employee to remove...");
                factory.printEmployeeInfo();
                factory.removeEmployee(factory.getEmployee(scanner.nextInt() - 1));
                break;
            case 3:
                System.out.println("Employee list...");
                factory.printEmployeeInfo();
                break;
            case 4:
                System.out.println("Thanks for using the soft. Bye...");
                return true;
            default:
                System.out.println("Invalid command IDIOT!");
                break;
        }
        return false;
    }


    public static int integerGenerator(int lowEnd, int highEnd) {
        return random.nextInt(highEnd - lowEnd) + lowEnd;
    }
}
