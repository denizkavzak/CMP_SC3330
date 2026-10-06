package edu.mu.generics.box;

public class Main {

	public static void main(String[] args) {

		StringBox stringBox = new StringBox("Hello");
		IntegerBox integerBox = new IntegerBox(10);
		StudentBox studentBox = new StudentBox(new Student("Alice"));
		
		Box<String> b1 = new Box<>("Hello");
		Box<Integer> b2 = new Box<>(10);
		Box<Student> b3 = new Box<>(new Student("Alice"));

		print("Hello");
		print(10);
		print(3.14);
		print(new Student("Alice"));
		
	}

    public static <T> void print(T value) {
        System.out.println(value);
    }
}
