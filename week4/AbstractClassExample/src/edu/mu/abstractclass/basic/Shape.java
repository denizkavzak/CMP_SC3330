package edu.mu.abstractclass.basic;

/***
 * Abstract class can have:
 * fields, constructors, 
 * implemented methods, abstract methods
 */
public abstract class Shape {

    public abstract double area();

    public void printArea() {
        System.out.println("Area: " + area());
    }
}
