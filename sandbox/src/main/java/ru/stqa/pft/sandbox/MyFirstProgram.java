package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Square s = new Square(5.0);
        Rectangle r = new Rectangle(6.0,5.0);
        hello("World");
        hello("Jacob");
        hello("User");

        System.out.println("The area of the square with length " + s.l + " = "+ area(s));


        System.out.println("The area of rectangle with length " + r.a + " and width " + r.b +" = "+area(r));

    }
    public static void hello(String sombebody) {
        System.out.println("Hello " + sombebody);

    }
    public static double area(Square s) {
        return s.l*s.l;
    }
    public static double area(Rectangle r){
        return r.a*r.b;
    }
}