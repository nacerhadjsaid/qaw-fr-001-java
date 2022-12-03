package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor{

    //method coming from toyota class
    public void carColor(){
        System.out.println("can have multiple color");
    }

    //methods coming from Car interface
    public void start() {
        System.out.println("let's drive teh car");
    }

    public void stop() {
        System.out.println("brake and stop");
    }

    public String carShape() {
        System.out.println("5 places possibility");
        return "";
    }

    //methods coming from Motor interface
    public void engine() {
        System.out.println("v6");
    }

    public void fuelType() {
        System.out.println("diesel engine");
    }

    //method coming from ModerCar abstract class
    public void hydraulicBrake() {
        System.out.println("hydraulic brake");
    }


    public void wheels() {
        System.out.println("4 wheels");
    }
}
