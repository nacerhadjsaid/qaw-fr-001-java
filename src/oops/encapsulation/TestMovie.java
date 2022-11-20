package oops.encapsulation;

public class TestMovie {

    public static void main(String[] args) {

        Movie gameOfThrones = new Movie();

        gameOfThrones.setRate("");

        System.out.println(gameOfThrones.getRate());

    }
}
