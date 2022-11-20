package conditions;

public class SwitchStatement {

    public static void main(String[] args) {

        String day = "Mon";

        switch (day){
            case "Mon":
                System.out.println("first day of the week");
                break;
            case "Tue":
                System.out.println("second day of the week");
                break;
            case "Wed":
                System.out.println("third day of the week");
                break;
            case "Thu":
                System.out.println("fourth day of the week");
                break;
            case "Fri":
                System.out.println("fifth day of the week");
                break;
            case "Sat":
                System.out.println("sixth day of the week");
                break;
            case "Sun":
                System.out.println("seventh day of the week");
                break;
            default:
                System.out.println("error");

        }

    }
}
