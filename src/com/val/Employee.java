package com.val;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    //override
    public String toString(){
        return String.format("%s %s : %s", this.firstName, this.lastName, this.socialSecurityNumber);
    }
}
