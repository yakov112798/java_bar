package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("Jacob");
        hello("User");

        double i = 5.0;
        System.out.println("The area of the square with length " + i + " = "+ area(i));

        double x= 6;
        double y=8;
        System.out.println("The area of rectangle with length " + x + " and width " + y +" = "+area(x,y));

    }
    public static void hello(String sombebody) {
        System.out.println("Hello " + sombebody);

    }
    public static double area(double x) {
        return x*x;
    }
    public static double area(double x , double y){
        return x*y;
    }
}