package oops.abstraction;

public class Test {

    public static void main(String[] args) {

        //toyota
        Toyota camry = new Toyota();
        camry.start();
        camry.stop();
        camry.carShape();
        camry.carColor();

        Car corolla = new Toyota();
        corolla.start();
        corolla.stop();
        corolla.carShape();

        Honda accord = new Honda();
        accord.start();
        accord.stop();
        accord.carShape();

        Car civic = new Honda();

        ModernCar mc = new Toyota();

    }
}
