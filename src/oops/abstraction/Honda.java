package oops.abstraction;

public class Honda implements Car{

    public void start() {
        System.out.println("start without key");
    }

    public void stop() {
        System.out.println("automatic stop");
    }

    public String carShape() {
        System.out.println("7 places");
        return "";
    }

    public void wheels() {
        System.out.println("4 wheels");
    }
}
