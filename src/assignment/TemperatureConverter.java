package assignment;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        String mode;
        int tempToConvert;
        int convertedTemp;
        int answer;

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------Welcome-----------------------------------------");
        System.out.println("----------------Celsius-Fahrenheit/Fahrenheit-Celsius converter--------------------");

        do {
            System.out.println("choose the conversion mode:");
            System.out.println("1- Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius");

            mode = sc.nextLine();

            while (!(mode.equalsIgnoreCase("1")) && !(mode.equalsIgnoreCase("2"))){
                System.out.println("invalid entry, please enter 1 or 2");
                mode = sc.nextLine();
            }

            if (mode.equalsIgnoreCase("1")){
                System.out.println("Enter the temperature to convert in Celsius:");
                tempToConvert = sc.nextInt();
                convertedTemp = (tempToConvert * 9/5) + 32;
                System.out.println(tempToConvert+" C ------------------> "+convertedTemp+" F");
            }else {
                System.out.println("Enter the temperature to convert in Fahrenheit:");
                tempToConvert = sc.nextInt();
                convertedTemp = (tempToConvert - 32)*5/9;
                System.out.println(tempToConvert+" F ------------------> "+convertedTemp+" C");
            }

            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
            answer = sc.nextInt();

            while (answer != 1 && answer != 2){
                System.out.println("invalid entry, please enter 1 or 2");
                answer = sc.nextInt();
            }

        }while (answer == 1);

        System.out.println("-------------------------------Good bye, see you soon---------------------------  ");

    }
}
