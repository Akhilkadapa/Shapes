import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeInputHandler {
    private BufferedReader reader;

    public ShapeInputHandler() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Shape getCircle() {
        double radius = getUserInput("Enter radius of circle: ");
        return new Circle(radius);
    }

    public Shape getRectangle() {
        double length = getUserInput("Enter length of rectangle: ");
        double width = getUserInput("Enter width of rectangle: ");
        return new Rectangle(length, width);
    }

    public Shape getTriangle() {
        double base = getUserInput("Enter base of triangle: ");
        double height = getUserInput("Enter height of triangle: ");
        return new Triangle(base, height);
    }

    public Shape getSquare() {
        double side = getUserInput("Enter side length of square: ");
        return new Square(side);
    }

    private double getUserInput(String prompt) {
        double userInput = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.print(prompt);
                userInput = Double.parseDouble(reader.readLine());
                isValid = true;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return userInput;
    }
}
