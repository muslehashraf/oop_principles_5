package class_object;

public class Apple {

    //default constructor is provided by java to create zero arg object
    public Apple(){
        //Each time you created a new object, this block will be executed
    }

    //instance variables - fields - states - fields - attributes
    public String color = "Red"; // Red
    public double price; // 0.0
    public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
