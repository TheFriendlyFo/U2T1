// Rectangle class definition
public class Rectangle {

    // instance variables
    int length;
    int width;
    int area;
    int perimeter;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
        area = length * width;
        perimeter = 2 * (length + width);
    }

    // method that calculates and prints area
    public void printData() {
        System.out.println("My area is " + area);
        System.out.println("My perimeter is " + perimeter);
    }
}


