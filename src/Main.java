import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for circle
        Shape circle = getCircle(scanner);

        // Get input for rectangle
        Shape rectangle = getRectangle(scanner);

        // Get input for triangle
        Shape triangle = getTriangle(scanner);

        // Get input for square
        Shape square = getSquare(scanner);

        scanner.close();

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Area of square: " + square.calculateArea());
    }

    private static Shape getCircle(Scanner scanner) {
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

    private static Shape getRectangle(Scanner scanner) {
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }

    private static Shape getTriangle(Scanner scanner) {
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        return new Triangle(base, height);
    }

    private static Shape getSquare(Scanner scanner) {
        System.out.print("Enter side length of square: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }
}
