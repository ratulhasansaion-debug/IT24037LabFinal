abstract class Shape {
    abstract void area();
}

interface Drawable {
    void draw();
}
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " + (3.1416 * radius * radius));
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
} 

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        c.area();

        Rectangle r = new Rectangle(10, 5);
        r.draw();
        r.area();
    }
}
 
