package fr.epita.shapes;

public class Triangle {

        public double sideOne;
        public double sideTwo;
        public double base;
        public double heightFromBase;

    public Triangle( double triangleBase, double triangleHeightFromBase,double triangleSideOne, double triangleSideTwo) {
        base = triangleBase;
        heightFromBase = triangleHeightFromBase;
        sideOne = triangleSideOne;
        sideTwo = triangleSideTwo;

    }

    public double computeArea(){ return (base * heightFromBase) / 2; }

    public double computePerimeter(){ return sideOne + sideTwo + base; }
}
