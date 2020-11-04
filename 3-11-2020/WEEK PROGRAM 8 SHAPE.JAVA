SHAPE.JAVA

import java.util.Scanner;

abstract class Shape
{
    int a;
    int b;
    abstract void printArea();

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Rectangle extends Shape
{
    public Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea()
    {
        System.out.println("Area of rectangle:"+(a*b));
    }
}

class Triangle extends Shape
{
    public Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of triangle:"+(a*b));
    }
}

class Circle extends Shape
{
    public Circle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Circle:"+(3.142*a*b));
    }
}

class Prog5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        int l_rec = sc.nextInt();
        System.out.print("Enter breadth of rectangle:");
        int b_rec = sc.nextInt();

        System.out.print("Enter height of triangle:");
        int l_tri = sc.nextInt();
        System.out.print("Enter base of triangle:");
        int b_tri = sc.nextInt();

        System.out.print("Enter radius of circle:");
        int r_cir = sc.nextInt();

        Rectangle r = new Rectangle(l_rec,b_rec);
        Triangle t = new Triangle(l_tri,b_tri);
        Circle c = new Circle(r_cir,r_cir);
        System.out.println("---------------");
        r.printArea();
        t.printArea();
        c.printArea();
    }
}

