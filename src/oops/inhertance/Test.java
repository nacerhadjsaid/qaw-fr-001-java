package oops.inhertance;

public class Test {

    public static void main(String[] args) {

        Father achour = new Father(2);

        achour.house();
        achour.rich();

        Son mouloud = new Son();

        //single inheritance
        mouloud.house();
        //multi level inheritance
        mouloud.rich();

        GrandFather ramdane = new GrandFather();
        ramdane.rich();

        //hierarchical inheritance
        ramdane.communicate();
        Bird sparrow = new Bird();
        sparrow.communicate();

    }

}
