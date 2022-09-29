public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mona", 6, 5);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Riebeck", 12, 12);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
