package statickeyword;

public class TestGarage {
    public static void main(String[] args) {

        //non static variables and methods belong to object
        Garage garage = new Garage();

        garage.length = 15;
        //garage.size();

        Garage hassibaGarage = new Garage();
        hassibaGarage.setLength(50);
        System.out.println("Hassiba's Garage "+hassibaGarage.getLength());

        Garage hanafiGarage = new Garage();
        hanafiGarage.setLength(100);
        System.out.println("Hanafi's's Garage "+hanafiGarage.getLength());

        System.out.println("Hassiba's Garage "+hassibaGarage.getLength());

        Garage amarGarage = new Garage();
        amarGarage.setLength(200);
        System.out.println("Amar's Garage "+amarGarage.getLength());

        System.out.println("Hassiba's Garage "+hassibaGarage.getLength());

        //static variables and methods belong to the class
        Garage.width = 20;
        //Garage.driveWay();

    }
}
