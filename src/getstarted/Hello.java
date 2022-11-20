package getstarted;

import classobjectconstructor.House;

class Hello {
    //this is main method
    public static void main(String[] args) {
        //this is print statement
        System.out.print("getstarted.Hello World");

        /*
        this is line 1
        this is line 2
        this line 3
        */

        //in-line declaration and assignment
        int x = 1;

        //declaration
        int y;
        byte o, j, k, m;

        //assignment
        y = 5;

        //re-assignment
        y = 10;

        System.out.println(y);

        //final variable
        final int z = 15;
        //z = 20; cannot be reassigned
        System.out.print(z);

        //number
            //whole number
            byte b = -128; //1 byte
            short s = 243; //2 bytes
            int i = 246412; //4 bytes
            long l = 7237847987823L; //8 bytes

            //fraction
            float f = 1.3823452394F; //4 bytes
            double d = 1.3245245346463456789876; //8 bytes

        //character
        char c = ' '; //1 bytes

        //boolean
        boolean boo = true; //1 bit (1/8 byte)

        //string
        String str = "Amar";

        //java logic
        int num1 = 7;
        int num2 = 65;
        double num3 = (double) num2/ (double) num1;

        System.out.println(num3);

        System.out.println((double) num1 != (double)num2);

        //comparison operators: >, <, >=, <=, ==, !=
        //arithmetic operators: +, -, /, *, %, ++, --
        //assignment operators: =
        //logical operators: &&, ||, !

        System.out.println((double) 10/(double) 3);

        int num4 = 10;
        System.out.println(num4++);
        System.out.println(num4);

        //type casting
        //up casting (widening): byte > short > char > int > long > float > double
        int n1 = 2;
        int n2 = 1;
        double res2 = n1 / n2;
        System.out.println(res2);

        //down casting (narrowing): double > float > long > int > char > short > byte
        double doub1 = 1.3;
        double doub2 = 1.5;
        int res1 = (int)doub1 / (int)doub2;
        System.out.println(res1);

        //string (non-primitive)
        String str1 = "getstarted.Hello World!!!";

        //string manipulation
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.indexOf("W"));

        //string concatenation
        System.out.println(str1+" "+str);
        System.out.println(str1.concat(str));
        System.out.println(str1+(562+123));

        //array (non-primitive)
        //in-line declaration and assignment
        int[] array1 = {4,6,0,2,5};

        //array declaration
        int[] array2 = new int[5];
        //array assignment
        array2[0] = 2;
        array2[1] = 8;
        array2[2] = 9;
        array2[3] = 3;
        array2[4] = 1;
        System.out.println(array2[5]);

        //2D array
        int[][] array3 = {{1,3},{0,9}};

        int[][] array4 = new int[2][2];
        array4[0][0] = 1;
        array4[0][1] = 3;
        array4[1][0] = 9;
        array4[1][1] = 0;

        House house = new House();

    }
}
