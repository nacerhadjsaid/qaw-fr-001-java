package oops.polymorphism;

public class Calculator {

    //polymorphism: method overloading is when you use the same method name with different parameters
    public void addition(int a, int b){
        int total = a + b;
        System.out.println(total);
    }

    public void addition(int a, int b, int c){
        int total = a + b + c;
        System.out.println(total);
    }

    public void addition(int a, int b, int c, int d){
        int total = a + b + c;
        System.out.println(total);
    }
}
