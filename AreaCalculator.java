package P4;

public class AreaCalculator{
 
    public static double area(double radius) { //circle
        return Math.PI * radius * radius;
    }
    public static double area(double length, double width) { // Rectangle
        return length * width;
    }
    public static double area(int side) { // Square
        //for overolading parameter datatype should be different
        //so we use int for side rather than double
              
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println("Circle area (r=4): " + area(4.0));
        System.out.println("Rectangle area (l=3,w=5): " + area(3.0, 5.0));
        System.out.println("Square area (s=5): " + area(5));
    }
}

