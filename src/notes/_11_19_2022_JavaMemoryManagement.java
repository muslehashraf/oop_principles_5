package notes;

public class _11_19_2022_JavaMemoryManagement {
    /*
            11/19/2022 - Java Memory Management
        Stack: Stack is where methods, local variables and object references are stored
        -When you run a program, different layers will be created in stack and they will be executed in
        the order of program (Last in, first out)
        Heap:Heap is where objects (instances) are stored. Instance variables are stored in the heap
        with their respective instance
        -Accessing object is slower compared to accessing a local variable
        STRING POOL
        -String is an object (reference type)
        -There are 2 ways to create String
        1. String s1 = "value";
        2. String s2 = new String("value");
        -String that created without new keyword will be stored in the String Pool, a special area in the
        heap to store Strings
        -The reason of having of having String Pool is to save memory
        What is the difference between == operator and equals() method?
        == is one of the relational operators and it is used to find if both sides of the operator are equal
        to each other. It will return a boolean, either true or false based on the comparison
        == is mostly used with primitive data types and should not be used with reference types
        (objects)
        -When == is used with reference types, it compares their location in the memory and each
        object created with new keyword will have a unique location. That’s why, although the object
        variable values are same, == will return a false since it compares their location and locations are
        obviously different.
        -equals() is mostly known to be used with String objects but String is not the only class that has
        equals() method. -Wrapper classes, Arrays, ArrayList, Vector and other collections also has
        equals() method and this method is used to check 2 objects of same data type has same value
        or not and return a boolean as true or false
        EXAMPLES
        String str1 = “Tech”;
        String str2 = “Global”;
        System.out.println(str1.equals(str2)); // this statement will print false as 2 String object values
        are not equal
        Garbage Collection
        -Garbage means unreferenced objects (objects that lost their references)
        -Garbage Collection is a process of destroying objects that lost references
        -Garbage Collection runs automatically (implicitly) for better memory management in Java
        NOTE: Garbage Collection applies only to reference types data (objects)
        Object class: Object class the parent of all the Java classes by default
        finalize() method
        -it is a method located in Object class
        -It does not have body
        -It is provided to be overridden by other classes
        -When you override, you provide a body to be executed each time when an object garbage
        collected
        What is the difference between final, finalize and finally?
        final -> non-access modifier
        finalize -> method - garbage collection
        finally -> block - exceptions
        MUTABLE - IMMUTABLE
        -Do you know what is mutable or immutable?
        -Immutable: That cannot change
        -Mutable: That can be changed
        -String is immutable
        -StringBuilder, StringBuffer are mutable
        -StringBuffer is synchronized (thread-safe) - slower
        -StringBuilder is faster
        length index 1 index 2
        aa -> a*a 2 1
        aaaa -> aa*aa 4 2
        aaaaaa -> aaa*aaa 6 3
        aaa -> a*a*a 3 1 3
        aaaaa -> aa*a*aa 5 2 4
        aaaaaaa -> aaa*a*aaa 7 3 5
     */
}
