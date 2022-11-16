package oop_practice;

public class SwordTest {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line:\n");
        Sword sword1 = new Sword("iron"); // -> Default constructor
        System.out.println("Printing out the Sword1 = " + sword1);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15, "long sword", "iron"); // -> Modified constructor
        System.out.println("Printing out the Sword2 = " + sword2);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword3 = new Sword(10, 25, "Super long sword", "titanium"); // -> Modified constructor
        System.out.println("Printing out the Sword3 = " + sword3);

        System.out.println("\nWorking with \n");
        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);
        Sword.isSharp = true;
        System.out.println(Sword.isSharp);





    }
}
