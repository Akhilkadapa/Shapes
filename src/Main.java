

public class Main {
        public static void main(String[] args) {
            ShapeInputHandler inputHandler = new ShapeInputHandler();
            Shape circle = inputHandler.getCircle();
            Shape rectangle = inputHandler.getRectangle();
            Shape triangle = inputHandler.getTriangle();
            Shape square = inputHandler.getSquare();

            System.out.println("Area of circle: " + circle.calculateArea());
            System.out.println("Area of rectangle: " + rectangle.calculateArea());
            System.out.println("Area of triangle: " + triangle.calculateArea());
            System.out.println("Area of square: " + square.calculateArea());
        }
    }
