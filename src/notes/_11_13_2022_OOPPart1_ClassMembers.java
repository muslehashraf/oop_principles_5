package notes;

public class _11_13_2022_OOPPart1_ClassMembers {
    /*
            RECAP:
        Class: it is a blueprint from where we can create many object
        Object: it is an instance of the class
        Class member:
        1. attributes - fields - states - instance variables
        2. methods
        3. constructor
        4. blocks
        Constructor
        -It is one of the class members that allows to create an instance
        -It is always used next to <new> keyword
        dataType varName = new dataType();
        -Constructor names must always be same as class name
        -Once the class is created, Java provides the default constructor
        className(){
        //default constructor
        }
        -We can create our own custom constructor when needed
        -Once you create a custom one, then you lose the default
        dataType varName = new dataType(); // not allowed
        -If you still want to use zero-arg (default) constructor after creating custom one, then you need
        explicitly write the deault one in your template class
        -Constructor overloading: it is creating custom constructor with different arguments similar to
        method overloading
        Method:
        returnType methodName(){
        }
        INSTANCE VARIABLES:
        -Class attributes are known as fields or instance variables of a class
        -Fields are used to store data
        -Fields can be accessed by instance of that class
        class Car{
        String make;
        String model;
        String color;
        int year;
        double price;
        Engine engine;
        }
        Car myCar = new Car();
        myCar.make = "BMW";
        class Book{
        int page;
        String title;
        Date publishYear;
        Author author;
        }
        Author{fName='', lName=''}
        class Author{
        String fName;
        String lName;
        Date DOB;
        String countryOfBirth;
        }
        class Address{
        }
        class Animal{
        String name;
        int age;
        boolean isCarnivore;
        boolean isHerbivore;
        boolean isOmnivore;
        }
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Cow");
        Animal animal3 = new Animal("Cow", 5);
        Constructor chaining: We can use one of constructor in another custom one. The goal is to
        reduce code duplication.
        -It can be achieved with this() and it MUST the first statement.
        DIFFERENCE BT this and this()
        -this is a reference to current object
        -this() is a reference to another constructor
        Animal{name='Tiger', age=10, isCarnivore=true}
        Animal{name='Cow', age=5, isHerbivore=true}
        Animal{name='Cat', age=2, isOmnivore=true}
        //These are the feature each Animal instance can have
            public String name;
            public int age;
            public boolean isCarnivore;
            public boolean isHerbivore;
            public boolean isOmnivore;
            //
            public static boolean isExtinct = true;
            static instance variables
            -makes it belongs the class and can be invoked with the class name
            final instance variables
            -final fields must be having an initial value defined in the template and this value cannot be
        changed
            NOTE: one instance variable may or may not be static and final at the same time
            //static
            Integer.MAX_VALUE;
            Integer.MIN_VALUE;
            class Day{
            public static final int daysInAWeek = 7;
            }
        NOTE: static final variables are also known as CONSTANTS
        BLOCKS:
        1. Local block: loops, methods, if-else-switch
        2. Instance initialization block
        3. Static initialization block
        NOTE: static block is executed only once but before everything else
        non-static (instance block) is executed each time you create an object
        static blocks can be used to set up your automation data like connection to files or databases
        instance blocks can be used for reporting purposes
        IS THERE A WAY TO EXECUTE A BLOCK OF CODE BEFORE main() method?
        -Yes, static block
     */
}
