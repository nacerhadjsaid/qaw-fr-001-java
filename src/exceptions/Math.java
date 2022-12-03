package exceptions;

public class Math {

    public static void main(String[] args) {

        //runtime exception

        int a = 5;
        int b = 0;

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        try {
            System.out.println("line 5"+ a/b);
        }catch (ArithmeticException e){
            System.out.println("line 5 code error");
            e.printStackTrace();
        }
        System.out.println("line 6");
        System.out.println("line 7");
        System.out.println("line 8");

    }

}
