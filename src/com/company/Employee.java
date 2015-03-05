package com.company;

/**
 * Created by Marta on 2/28/2015.
 */
public class Employee {

    // region Instance Fields
    private String name;
    private int age;
    private float sallary;
    // endregion

    // region Constructor
    public Employee(String name, int age, float sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }
    //end region

    // region Member Methods
    public void printInfo() {
        System.out.print(name + "\t" + age + "\t" + "Sallary: " + sallary);
    }
    // endregion

    // region Setters And Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSallary() {
        return sallary;
    }
    public void setSallary(float sallary) {
        this.sallary = sallary;
    }
    // endregion
}
