package oops.abstraction;

public interface Car extends Wheel {
    //Interface
    /* interface def: is an abstract type that is used to specify a behavior that classes must implement.
     * interface has only unimplemented public, abstract methods, and all the fields are public static and final
     * we can not create instance of interface or constructors
     * a class can implement multiple interfaces
     * a class that implements interface must implements all the methods of the interface
     * it is issued to use the multiple inheritance */

    final int a = 34;
    int b = 43;

    //road map
    //abstract method
    void start();

    public void stop();

    public String carShape();
}
