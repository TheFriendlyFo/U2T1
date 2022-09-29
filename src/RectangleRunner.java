public class RectangleRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class "blueprint"
        Rectangle rect1 = new Rectangle(5, 6);
        rect1.printData();  // calling a method on the object

        // creating ANOTHER instance/object from the Rectangle class
        Rectangle rect2 = new Rectangle(10, 8);
        rect2.printData();  // calling a method on the object

        Rectangle rect3 = new Rectangle(rect1.area, rect2.area);
        rect3.printData();
        
    }
}



