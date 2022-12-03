package oops.abstraction;

public abstract class ModernCar {

    //abstract method
    public abstract void hydraulicBrake();


    //non-abstract method
    public void autoLock(){
        System.out.println("auto lock car");
    }

    /*
     *             interface                          |                     abstract
     * implicitly abstract and can not be implemented | can have instance methods that implements a default behavior
     * variable declared are by default final         | may contain a non-final datatypes
     * members are public by default                  | can have private, protected members
     * uses keyword implements                        | uses keyword extends
     * extends another interface only                 | extends another class and implements multiple interfaces
     * all abstract method and can not be instantiate | can not be instantiated but can be invoked in main()
     * slow                                           | comparatively fast
     * */
}
