package task.day7;

import task.day7.Animal;

public class Snake extends Animal {
    public Snake() {
    }

    public Snake(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("蛇爬行");
    }

    @Override
    public void eat() {
        System.out.println("蛇吃田鼠");
    }
}
