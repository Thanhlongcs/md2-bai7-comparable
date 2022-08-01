package rikkei.academy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // test class Shape

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        //test class Circle

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.5);
        System.out.println(circle);
        circle = new Circle(5.5, "indigo", false);
        System.out.println(circle);
        //test class RECTANGLE

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        //test SQUARE

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
    }
}
