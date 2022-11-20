package oops.inhertance;

public class Son extends Father{

    //subclass

    public Son(){
        super(5);
    }

    public void higherEducation(){
        super.height = 8;
        super.educated();
    }

}
