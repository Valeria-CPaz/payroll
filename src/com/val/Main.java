package com.val;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee("Valeria", "Paz", "Val21214");
        SalariedEmployee se = new SalariedEmployee("Dino", "Silva Sauro", "12345");
        BasePlusCommisionEmployee be = new BasePlusCommisionEmployee("What", "Ever", "44444");
        CommisionEmployee ce = new CommisionEmployee("Ya", "hoo", "4321");
        HourlyEmployee he = new HourlyEmployee("Ce", "Jura", "555666");


        System.out.println(e.toString());
        System.out.println(se.toString());
        System.out.println(be.toString());
        System.out.println(ce.toString());
        System.out.println(he.toString());
    }

}
