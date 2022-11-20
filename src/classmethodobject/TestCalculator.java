package classmethodobject;

public class TestCalculator {

    public static void main(String[] args) {

        //object: is an instance of a class
        Calculator cal1 = new Calculator();

        System.out.println(cal1.tempToConvert);

        int res;

        cal1.conversion1();

        res = cal1.conversion2() + 10;

        System.out.println(res);

        cal1.addition(100, 150);
        cal1.addition(567899786, 11234250);


        System.out.println(cal1.subtraction(200, 50));

        //call the recuresive method
        //cal1.rec();
    }
}
