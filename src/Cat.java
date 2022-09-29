// Cat class definition
public class Cat {

    // instance variables
    final private String name;
    final private int age;
    final private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        System.out.printf("Hello my name is %s, and I'm a %s cat.%n", name, (age < 7) ? "younger" : "older");
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
