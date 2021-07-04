package fr.epita.shapes;

public class Rectangle {

    public double len;
    public double width;

    public Rectangle(double rectangleLength, double rectangleWidth) {
         len = rectangleLength;
         width = rectangleWidth;
    }

    public double computeArea(){ return  len * width; }

    public double computePerimeter(){ return 2 * (len + width); }

}
