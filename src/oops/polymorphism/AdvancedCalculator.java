package oops.polymorphism;

public class AdvancedCalculator extends Calculator{

    //polymorphism:
    @Override
    public void addition(int a, int b){
        int total = a + b + 10;
        System.out.println(total);
    }

}
