package fr.epita.shapes;


public class Circle {

    public double radius;
    public double pi = 3.14;

    public Circle(double circleRadius) {

        radius = circleRadius;
    }

    public double computeArea(){ return pi * radius * radius; }

    public double computePerimeter(){ return 2 * pi * radius; }

}
