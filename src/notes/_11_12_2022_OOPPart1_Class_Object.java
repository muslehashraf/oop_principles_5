package notes;

public class _11_12_2022_OOPPart1_Class_Object {
            /*
            1. Class vs Object
        2. Class members
            Attributes
            Methods
            Constructors
            Blocks
        3. Stack & Heap -> Java Memory
        4. Access Modifier
            private
            default
            protected
            public
        5. OOP Principles
            Encapsulation
            Inheritance
            Abstraction
            Polymorphism
        Collections
            List
                ArrayList
                LinkedList
                Vector
            Set
                HashSet
                LinkedHashSet
                TreeSet
            Map
                HashMap
                LinkedHashMap
                TreeMap
                HashTable
        NOTES:
        DO NOT MEMORIZE - UNDERSTAND
        BE GOOD AT OOP
        30 minutes recap of what you learned
        Class vs Object
        Class: can be created using <class> keyword
        -Class is a blueprint that you can create many object from
        SYNTAX:
        class Apple{

            //attributes - fields - states - instance variables
            color;
            taste;
            price;
        }
        Object: object can be created with <new> keyword and constructor
        -Object is an instance of a class
        Apple apple1 = new Apple(); // Red, sweet, 0.5
        Apple apple2 = new Apple(); // Green, sour, 0.75
        class Scanner{

        }
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        CONSTRUCTORS
        -it is a class member used to instantiate an object of that class
        -it is a special method that allows creating object
        -Once you create a class, Java will provide you the default constructor BUT when you overload the default constructor, it will be gone.
        -it is similar to method but
            -It MUST be having the same name as the class
            -Methods are either void or return but constructors are not
        Is constructor void or return type?
        -it is not void or return
        Can constructor take any arguments?
        -it can take arguments when needed
        INSTANCE VARIABLES
        -These are class level and used to define what objects will have as a feature
        -By default
            String will be null
            byte-short-int-long will be 0
            float-double will be 0.0
            boolean will be false
            char will be nothing
        NOTE: if you define an initial value for the instance variable in the blueprint, that means you override above default values with the new value
        System.out.println(apple1); // class_object.Apple@1540e19d
        System.out.println(apple2); // class_object.Apple@677327b6
        Apple{color= 'Red', price='0.75', taste='sweet'}
        OVERRIDING toString() method
        -toString() method is a predefined method in Object class and we can override it in our template classes to get actual value of the objects instead of the locations in the memory
        ShortCut: right click -> Generate - toString() -> select all attributes and click on OK
            public String color; //
            public double price; //
            public String taste; //
        public Apple(){

        }
        //3 args constructor
        public Apple(String color, double price, String taste){
            this.color = color;
            this.price = price;
            this.taste = taste;
        }
        Apple apple = new Apple("Yellow", 1.5, "Sweet");
        Apple apple2 = new Apple("Red", 1.75, "Sweet");
        System.out.println(apple);
        System.out.println(apple2);
        class DebitCard{
            String cardNumber;
            Date expDate;
            int securityCode;
            Customer customer;
        }
        class Customer{
            String fName;
            String lName;
            Date DOB;
            Address address;
            String phone;
            double balance;
            String SSN;
        }
        class Address{
            String street;
            String zip;
            State state;
        }
        enum State{
            IL,
            MN,
            WI
        }
        Class: Template - blueprint
        Object: instance of the class
        Class: Car
            Attributes: Color, Make, Model, Year, Price
            Functions: drive(), brake(), stop()
        this keyword: it is a reference to current object
             */
}
