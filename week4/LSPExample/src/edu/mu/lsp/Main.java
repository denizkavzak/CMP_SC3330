package edu.mu.lsp;

public class Main {

    public static void resize(Rectangle r) {
        r.setWidth(4);
        r.setHeight(5);

        System.out.println(r.area());
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        resize(rectangle); // 20
        resize(square);    // 25
    }
}