public class Loop {
    public static void main(String[] args) {

        int count = 1;
        int max = 10;

        //while loop
//        while(count < max){//true
//            System.out.println(count);
//            count++;
//        }

        //do wile loop
//        do{
//            System.out.println(count);
//            count++;
//        }while (count < max);

        //for loop
//        for(int i = 1; i < max; i++){
//            System.out.println(i);
//        }

        int[] array1 = {4,6,0,2,5};
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
//        System.out.println(array1[4]);

        for(int i = 0; i < 5; i++){
            System.out.println(array1[i]);
        }

        //foreach loop
        for (int myNum: array1){
            System.out.println(myNum);
        }



    }
}
