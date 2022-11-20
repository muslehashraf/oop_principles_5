package notes;

public class _11_20_2022_AccessModifiersRECAP {
            /*
            11/20/2022 - Access Modifiers
        RECAP:
        Object or INSTANCE: It is an instance of a class
        Class: Blueprint - template - prototype from where we create instances
        Class: Scanner
        Instance: myScanner, input, scanner
        CLASS MEMBERS:
        Instance variables - states - attributes - fields: Features of an instance
        Methods - functions: behaviors of the instance
        Constructors: are special methods used to create instances
        Blocks: are used to execute some code when objects are created or before object being created
        OOP PRINCIPLES:
            Encapsulation: privacy
            Inheritance: code reusability - extends keyword
            Abstraction: hiding implementation but providing functionality
            Polymorphism:
            Object
            Creature
            Animal
            Cat
            Cat cat = new Cat();
            cat is a Cat
            cat is an Animal
            cat is a Creature
            cat is an Object
        constructors vs methods
        DIFFERENCES:
        -methods are used to define the behaviors of the objects
        -constructors are used to create objects
        -methods should always be either return or void
        -constructors cannot be void or return type
        -methods can have any meaningful name
        -constructors MUST always have the same name as the class name
        -methods can be static or final or both at the same time
        -constructors can never be static or final
        -methods can be overridden: it is changing the body of the parent method
        -constructors cannor be overridden
        SIMILARITIES:
        -both are class members
        -both can be overloaded
        -both can be chained
        static keyword
        -when a member is static, it means we can invoke it with class name. It means it belongs to class
        -instance variables can be static
        -methods can be static
        -blocks can be static
        -constructors can not be static
        ACCESS MODIFIERS
            public
            protected
            default
            private
        Non-Access Modifiers
            static
            final
        NOTE: All the access and non-access are about the accessibility of the class and its members
        Accessibility scope: public -> protected -> default -> private
        public is most accessible
        private is the least accessible
        Access modifiers and the class
        -class can be public and it enables us to create objects anywhere in the same project (class, package, project)
        -class cannot be protected
        -class can be default and it enables us to create object only in the same package (clas, package)
        -class cannot be private
        -class cannot be static
        -class can be final - it cannot be parent - it cannot have child classes
        NOTE: class can be either public or default
        NOTE: class CANNOT be private or protected
        NOTE: These rules will be revisited when we learn inner classes
        Inner classes can be private and protected
        Inner classes can be static
        class Account{
            static class Debit{
            }
            private class Credit{
            }
        }
        parent class - super class - base class
        child class - sub class
        NOTE: inner class is not sub-class
        Access modifiers and the constructors
        constructor can be private: you can create object only in the same class
        constructor can be default: you can create object in the same class and package
        constructor can be protected: it will be public when there is inheritance, otherwise, it will act like default
        constructor can be public: you can create object anywhere in the project
        constructor cannot be static
        constructor cannot be final
        Access modifiers and the instance variables
        instance variables can be public: can be accessed anywhere in the project
        instance variables can be protected: it will be public when there is inheritance, otherwise, it will act like default
        instance variables can be default: can only be accessed in the same package
        instance variables can be private: can only be accessed in the same class
        instance variables can be static: belongs to class and can be invoked with class name
        instance variables can be final: becomes constant, cannot be changed
        Access modifiers and the methods
        methods can be private: can only be accessed in the same class
        methods can be default: can only be accessed in the same package
        methods can be protected: it will be public when there is inheritance, otherwise, it will act like default
        methods can be public: can be accessed anywhere in the project
        methods can be static: belongs to class and can be invoked with class name
        methods can be final: this method cannot be overridden, the body cannot be changed by sub classes
        Access modifiers and the blocks
        -There is nothing to discuss between blocks and the access modifiers
        private: restricted to same class
        default: restricted to same package
        public: restricted to same project
        protected if inheritance -> public
        protected no inheritance -> default
        -class itself cannot be private or protected
        -constructors, methods and instance variables can have all
        -blocks can have none
        -final: class, methods, instance variables
        -static: methods, instance variables
        final keyword
        - it is used with class, methods and instance variables
            final class: cannot be inherited - cannot be parent class
            final method: cannot be overridden - body cannot be changed by subclass
            final instance variables: has to be initialized and cannot be reassigned
     */
}
