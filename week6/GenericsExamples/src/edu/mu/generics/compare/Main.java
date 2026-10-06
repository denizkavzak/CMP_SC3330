package edu.mu.generics.compare;

public class Main {

    public static void main(String[] args) {

    	// T is Integer compared by value
        ContainerList<Integer> numbers = new ContainerList<>();

        numbers.addItem(50);
        numbers.addItem(10);
        numbers.addItem(30);

        System.out.println(numbers.getMin()); // 10
        
        
        ContainerList<String> names =
                new ContainerList<>();

        names.addItem("Charlie");
        names.addItem("Alice");
        names.addItem("Bob");

        System.out.println(names.getMin()); // Alice
        
        // T is Student compared with gpa
        ContainerList<Student> students = new ContainerList<>();

        students.addItem(new Student(1, "Alice", 3.7));
        students.addItem(new Student(2, "Bob", 2.9));
        students.addItem(new Student(3, "Charlie", 3.4));

        System.out.println("Students:");

        for (Student student : students.getContainer()) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println(
            "Minimum student: " + students.getMin()
        );
        
        // T is product compared with price
        ContainerList<Product> products = new ContainerList<>();

        products.addItem(new Product("Laptop", 900));
        products.addItem(new Product("Mouse", 25));
        products.addItem(new Product("Keyboard", 70));

        System.out.println(products.getMin());
        
        // T is Task compared with priority
        ContainerList<Task> tasks = new ContainerList<>();

        tasks.addItem(new Task("Study", 3));
        tasks.addItem(new Task("Submit homework", 1));
        tasks.addItem(new Task("Exercise", 2));

        System.out.println(tasks.getMin());
        
        // T is Book compared by alphabetic order of title
        ContainerList<Book> books = new ContainerList<>();

        books.addItem(new Book("Dune"));
        books.addItem(new Book("Animal Farm"));
        books.addItem(new Book("1984"));

        System.out.println(books.getMin());
    }
}