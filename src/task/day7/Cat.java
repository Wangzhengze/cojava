package task.day7;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("猫走");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
