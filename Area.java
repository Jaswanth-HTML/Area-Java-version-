// A sample class Shape which provides a method to get the Shape's area
import java.util.Scanner;

class Shape {

public double getArea() {

return 0;

}

}

// A triangle with base and height

class Triangle extends Shape { // extended form the Shape class

private double base;

private double height;

public Triangle(double base, double height) {

this.base = base;

this.height = height;

}

public double getArea() {//area of triangle 1/2*b*h

//area using heron's formula can also be used here

return 0.5 * base * height;

}

}

// A SQUARE is a Shape with a specific side

class Square extends Shape {

private double side;

public Square(double side) {

this.side = side;

}

public double getArea() {

return side * side;

}

}

class Area {

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

Shape[] shape = new Shape[2]; // Creating shape array of size 2

//instead of hardcoding the inout we can take input from user also
System.out.print("Side of Square:- ");
double a = sc.nextDouble();
System.out.print("Base of Triangle:- ");
double b = sc.nextDouble();
System.out.print("Height of Triangle:- ");
double c = sc.nextDouble();

//a switch case could be created press 1 for area of square press 2 for area of triangle

shape[0] = new Square(a); // creating circle object at index 0

shape[1] = new Triangle(b, c); // creating rectangle object at index 1

// Shape object is calling children classes method

System.out.println("Area of the Square: " + shape[0].getArea());

System.out.println("Area of the Triangle: " + shape[1].getArea());

sc.close();
}

}