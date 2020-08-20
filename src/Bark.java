class Dog {
    public static void bark() {
        System.out.print("woof ");
    }
}
class Basenji extends Dog {
    public static void bark() {}
}
 class Bark {
    public static void main(String args[]) {
        Dog woofer = new Dog();
        Basenji nipper = new Basenji();
        woofer.bark();
        System.out.println(woofer.getClass());
        nipper.bark();
        System.out.println(nipper instanceof Dog);

    }
}