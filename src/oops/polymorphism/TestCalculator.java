package oops.polymorphism;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.addition(2, 5, 8, 9);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.addition(3, 8);

    }
}
