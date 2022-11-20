package classmethodobject;

//class: is a template for object or blueprint
public class Calculator {

    //class attributes

    //variables: place holder
    int tempToConvert = 50;
    int convertedTemp;

    //method or function: is a reusable block of code which only runs when called

    //non-return method (void type)
    void conversion1() {
        convertedTemp = (tempToConvert * 9/5) + 32;
        System.out.println(convertedTemp);
    }
    void addition(int a, int b){
        int total = a + b;
        System.out.println("addition total = "+total);
    }

    //return method (takes any other type like int, String, double, boolean...)
    int conversion2(){
        convertedTemp = (tempToConvert * 9/5) + 32;
        System.out.println(convertedTemp);
        return convertedTemp;
    }

    int subtraction(int a, int b){
        int total = a - b;
        return total;
    }

    //recursive method: method calling itself
    void rec(){
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        rec();
    }
}
