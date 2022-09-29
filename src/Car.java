import java.util.Collections;

public class Car {
    final String model;
    final int topSpeed;
    int speed;
    double dist;

    Car(String inMod, int inTop) {
        model = inMod;
        topSpeed = inTop;
        speed = 0;
        dist = 0;
    }

    public void drive(double time) {
        dist += speed * time;
    }

    public void accellerate(int a) {
        speed += a;
        speed = Math.max(0, Math.min(speed, topSpeed));
    }

    public void printData() {
        System.out.printf("This is a model %s.\n", model);
        System.out.printf("It has a top speed of %d and is currently driving at %d mph.\n", topSpeed, speed);
        System.out.printf("It has driven a total of %d miles.\n", (int) dist);
        System.out.println();
    }
}
