package PracticeOne;

public class ExampleOne {

    public static void main(String[] args) {
        ExampleOnePt2 firstExample = new ExampleOnePt2();
        firstExample.color = "Blue";
        firstExample.model = "2020s";
        firstExample.height = 60;
        firstExample.width = 60;
        firstExample.mph = 100.50;
        firstExample.stillManufactured = true;

        ExampleOnePt2 car = new ExampleOnePt2();
        car.stillManufactured = true;
        car.color = "Silver";
        car.mph = 120.0;
        car.width = 55;
        System.out.println("Your car will be " + car.color + " and can achieve a maximum speed of " + car.mph + " mph.");

    }


    public static void main() {ExampleOnePt2 firstExample = new ExampleOnePt2();
        firstExample.color = "Blue";
        firstExample.model = "2020s";
        firstExample.height = 60;
        firstExample.width = 60;
        firstExample.mph = 100.50;
        firstExample.stillManufactured = true;

        ExampleOnePt2 car = new ExampleOnePt2();
        car.stillManufactured = true;
        car.color = "Silver";
        car.mph = 120.0;
        car.width = 55;
        System.out.println("Your car will be " + car.color + " and can achieve a maximum speed of " + car.mph + " mph.");
    }
}
