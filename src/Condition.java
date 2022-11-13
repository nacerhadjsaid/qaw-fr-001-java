import java.util.Scanner;

class Condition {
    public static void main(String[] args) {

        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("this number is positive");
        }else if(num < 0){
            System.out.println("this number is negative");
        }else {
            System.out.println("this number equals to 0");
        }

        if (num % 2 == 0){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }
    }
}
