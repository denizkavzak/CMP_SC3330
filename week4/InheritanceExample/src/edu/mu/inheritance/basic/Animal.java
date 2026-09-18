package edu.mu.inheritance.basic;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor");
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println("Some animal sound");
    }
}
