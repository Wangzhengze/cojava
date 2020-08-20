package task.day7;

public abstract class Animal {
    int legs;
    public Animal(){}
    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();
    public abstract void eat();
}
