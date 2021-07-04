package fr.epita.shapes;

public class Square {

    public double side;
    public Square(double squareSide) {
        side = squareSide;
    }

    public double computeArea(){ return  side * side; }

    public double computePerimeter(){ return 4 * side; }
}
