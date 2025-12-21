package oops.day7;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
