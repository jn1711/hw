interface Shape{
    public void area();
    public void perimetr();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        double S = 3.14 * (radius * radius);
        System.out.println("Area circle: " + S);
    }

    @Override
    public void perimetr() {
        double P = 2 * (3.14 * radius);
        System.out.println("Perimetr circle: " + P);
    }
}

class Rectangle implements Shape{
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void area() {
        double S = a*b;
        System.out.println("Area rectangle: " + S);
    }

    @Override
    public void perimetr() {
        double P = 2 * (a + b);
        System.out.println("Perimetr rectangle: " + P);
    }
}

class Triangle implements Shape{
    int taban;
    int en1;
    int en2;
    int h;

    public Triangle(int taban, int en1, int en2, int h){
        this.taban=taban;
        this.en1=en1;
        this.en2=en2;
        this.h=h;
    }

    @Override
    public void area() {
        double S = (taban*h)/2;
        System.out.println("Area triangle: " + S);
    }

    @Override
    public void perimetr() {
        double P = taban+en1+en2;
        System.out.println("Perimetr triangle: " + P);
    }
}

public class clea {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(8, 12);
        Shape triangle = new Triangle(10, 8, 6, 7);

        print_shape_info(circle, rectangle, triangle);
    }
    public static void print_shape_info(Shape ...shape){
        for(int i=0; i<shape.length; i++){
            shape[i].area();
            shape[i].perimetr();
            System.out.println();
        }
    }
}