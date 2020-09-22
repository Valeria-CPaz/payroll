package com.val;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        int socialSecurityNumber = input.nextInt();

        double wage = 10.25;
        double salariedEmployee = 40*wage;
        double hourlyEmployee = wage;

        System.out.print("Choose your employee type");
        System.out.println("1 - Salaried Employee");
        System.out.println("2 - Hourly Employee");
        System.out.println("3 - Commission Employee");
        System.out.println("4 - Salaried - Commission Employee");

        

    }
}
