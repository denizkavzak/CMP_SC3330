package edu.mu.generics.utility;

public class Main {

	public static void main(String[] args) {
        Utility util = new Utility();

        String[] names = {"Alice", "Bob"};
        Integer[] numbers = {10, 20};

        String firstName = util.first(names);
        Integer firstNumber = util.first(numbers);

        System.out.println(firstName);
        System.out.println(firstNumber);
	}

}
