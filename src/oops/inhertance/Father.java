package oops.inhertance;

public class Father extends GrandFather{

    //super class

    int height = 6;
    int numberOfSport;

    public Father(int numberOfSport){
        this.numberOfSport = numberOfSport;
    }

    public void house(){
        System.out.println("owns a house");
    }

    public void educated(){
        System.out.println("has master's degree");
    }

}
