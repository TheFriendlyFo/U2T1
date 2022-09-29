public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla", 120);
        car1.printData();

        car1.accellerate(50);
        car1.drive(2);
        car1.printData();

        car1.accellerate(1000);
        car1.drive(12);
        car1.printData();
    }
}
