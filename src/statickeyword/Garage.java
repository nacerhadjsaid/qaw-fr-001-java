package statickeyword;

public class Garage {

    //global variable
    int length;
    static int width;

    public void door(){
        //local variable
        String myDoor = "automatic";
        int i = 0;
        for (i = 0; i < 10; i++) {
            i = 20;
        }
        i = 10;
    }

    //non static method can use both static and non static variables
    public void size(){
        //myDoor = "";
        length = 10;
        width = 12;
    }

    //static method can use static variables only
    public static void driveWay(){
        //length = 10;
        width = 12;
    }

    //setter
    public void setLength(int length){
        this.length = length;
    }

    //getter
    public int getLength(){
        return length;
    }
}
