package classobjectconstructor;

public class TestHouse {

    public static void main(String[] args) {

        //object
        House myHouse = new House();

        myHouse.room();

        House hisHouse = new House();

        House herHouse = new House("white");

        herHouse.room();

        House ourHouse = new House("red", 5);

        ourHouse.livingRoom();



    }
}
