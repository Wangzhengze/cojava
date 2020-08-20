package chap06;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable{
    private String name;
    private int age;
    public int sex;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        return name != null ? name.equals(customer.name) : customer.name == null;
    }

    public Customer() {
        super();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    @Override
    public int compareTo(Object o) {
        Customer customer=(Customer) o;
        if(this.age<customer.age){
            return 1;
        }else{
            return -1;
        }
    }
}
