package fr.epita.launcher;

import fr.epita.shapes.Circle;
import fr.epita.shapes.Rectangle;
import fr.epita.shapes.Square;
import fr.epita.shapes.Triangle;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to this application");
        System.out.println("please, Choose the option below:");
        System.out.println("1. Circle, 2. Rectangle, 3. Square 4. Triangle");
        System.out.println("Enter the Number:");


        Scanner scanner = new Scanner(System.in);
        int shapes = scanner.nextInt();

        switch (shapes)
        {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double circleRadius = scanner.nextDouble();

                Circle Circle = new Circle(circleRadius);

                double area = Circle.computeArea();
                double perimeter = Circle.computePerimeter();

                System.out.println("Area of the Circle:" + area);
                System.out.println("Perimeter of the Circle:" + perimeter);

                break;

            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double rectangleLength = scanner.nextDouble();
                double rectangleWidth = scanner.nextDouble();

                Rectangle Rectangle = new Rectangle(rectangleLength,rectangleWidth);

                double rectangleArea = Rectangle.computeArea();
                double rectanglePerimeter = Rectangle.computePerimeter();

                System.out.println("Area of the rectangle:" + rectangleArea);
                System.out.println("Perimeter of the rectangle:" + rectanglePerimeter);

                break;

            case 3:
                System.out.println("Enter the side of the Square:");
                double squareSide = scanner.nextDouble();

                Square Square = new Square(squareSide);

                double squareArea = Square.computeArea();
                double squarePerimeter = Square.computePerimeter();

                System.out.println("Area of the Square:" + squareArea);
                System.out.println("Perimeter of the Square:" + squarePerimeter);

                break;

            case 4:
                System.out.println("Enter the details in same order:Base, Height from the base, and other two sides");
                double triangleBase = scanner.nextDouble();
                double triangleHeightFromBase = scanner.nextDouble();
                double triangleSideOne = scanner.nextDouble();
                double triangleSideTwo = scanner.nextDouble();

                Triangle Triangle = new Triangle(triangleBase,triangleHeightFromBase,triangleSideOne,triangleSideTwo);

                double tringleArea = Triangle.computeArea();
                double trianglePerimeter = Triangle.computePerimeter();

                System.out.println("Area of the Triangle:" + tringleArea);
                System.out.println("Perimeter of the Triangle:" + trianglePerimeter);

            case 5:


                break;
            default:
                System.out.println("Enter correct option");




        }

        scanner.close();


    }
}
