package task.day7;

public class Fish extends Animal{
    public Fish() {
        super();
    }

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("鱼游泳");
    }

    @Override
    public void eat() {
        System.out.println("鱼被吃");
    }
}
