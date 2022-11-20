package classobjectconstructor;

//blueprint
public class House {

    //class attributes

    //variables
    public int length;
    int width;

    //constructor
    //default constructor
    public House(){

    }
    //build constructor 1
    protected House(String color){
        System.out.println("house color is: "+color);
    }
    //build constructor 2
    House(String color, int numberOfRooms){
        System.out.println("house color is: "+color);
        System.out.println("number of rooms: "+ numberOfRooms);
    }

    //methods
    //method non-return
    public void room(){
        System.out.println("sleep zzzzzzzzzz");
    }
    private void kitchen(){
        System.out.println("yummy yummy");
    }
    void bathroom(){
        System.out.println("lallalallal");
    }

    //method return
    String livingRoom(){
        String movieShow = "Game Of Thrones";
        System.out.println("watch " + movieShow);
        kitchen();
        return movieShow;
    }

    //access modifiers: public, default, protected, private

    //non-access modifiers: final, abstract, static


}
