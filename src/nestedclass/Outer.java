package nestedclass;

public class Outer {

    Inner inner = new Inner();

    //outer class variable
    int numOuter = 6;

    //outer class constructor
    public Outer(){

    }

    //outer class method
    public void outerMethod(){
        System.out.println("this is outer class method");
    }

    //inner class
    class Inner{
        //outer class variable
        int numInner = 6;

        //outer class constructor
        public Inner(){

        }

        //outer class method
        public void InnerMethod(){
            System.out.println("this is inner class method");
        }
    }

}
