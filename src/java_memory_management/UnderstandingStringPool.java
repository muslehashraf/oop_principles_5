package java_memory_management;

import class_object.Car;

public class UnderstandingStringPool {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        //Create String as a new object
        String name6 = new String("John");

        //name1, name3, name4 and name6 having value of "John"

        System.out.println(name1 == name3); // true "John" == "John" why? true bc they have the same location in the memory
        System.out.println(name1 == name6); // false why? false bc its checking the location in the memory
        System.out.println(name1.equals(name6)); // true why? true bc its checking the value and not the location in the memory

        Car car1 = new Car();
        Car car2 = car1;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2); // true
        System.out.println(car1.equals(car2)); // true
    }
}
