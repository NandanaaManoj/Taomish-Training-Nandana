package org.example;

abstract class Structure { //abstract class
    double area;
    double peri;

    abstract void calculate();//abstract method
    abstract void perimeter();
    void area()
    {
        System.out.println("AREA=" + area);//concrete method
    }

    void peri()
    {
        System.out.println("Perimeter=" +peri);//concrete method
    }
}

interface areacalculator {//interface class
    void calculate();// abstract method
}

interface perimetercalculator {
    void perimeter();
}

class Circle extends Structure implements areacalculator,perimetercalculator {
    double radius;

    Circle(double radius) {//constructor to initialize attributes
        this.radius=radius;
    }

    public void calculate() {//overrides parent class
        area=Math.PI*radius*radius;
    }


    public void perimeter() {//overrides parent class
        peri=2*Math.PI*radius;
    }

}

class Rectangle extends Structure implements areacalculator,perimetercalculator  {
    double width,height;

    Rectangle(double width, double height) {//constructor to initialize attributes
        this.width=width;
        this.height=height;
    }
    @Override
    public void calculate() {//overrides parent class
        area=width*height;
    }

    public void perimeter() {//overrides parent class
        peri=2*(width+height);
    }
}

class Square extends Structure implements areacalculator,perimetercalculator  {
    double edge;

    Square(double edge) {//constructor to initialize attributes
        this.edge=edge;
    }
    @Override
    public void calculate() {//overrides parent class
        area=edge*edge;
    }

    public void perimeter() {//overrides parent class
        peri=4*edge;
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculate();
        c.perimeter();
        System.out.println("Area of circle");
        c.area();
        c.peri();
        Rectangle r = new Rectangle(3,2);
        r.calculate();
        r.perimeter();
        System.out.println("Area of Rectangle");
        r.area();
        r.peri();
        Square s = new Square(5.3);
        s.calculate();
        s.perimeter();
        System.out.println("Area of Square");
        s.area();
        s.peri();
    }
}