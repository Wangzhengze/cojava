package day6_task;
public class day6_2 {
}
class Shape{
    int x,y;
    public Shape(){}
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(){
        System.out.println("Shape draw");
    }
}
class Circle extends Shape{
    double r;
    public Circle(){
        this.r=1.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw in circle"+x+" "+y+" "+r);
    }
}

class Rectangle extends Shape{
    double height,width;
    public Rectangle(){
        this.height=1.0;
        this.width=1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("drwa in rectangle"+x+" "+y+" "+height+" "+width);
    }
}