package enumandswitch;

public class Day {

    Week week;

    public Day(Week week) {
        this.week = week;
    }

    public void whichDay(){

        switch (week){
            case MON:
                System.out.println("first day of the week");
                break;
            case TUE:
                System.out.println("second day of the week");
                break;
            case WED:
                System.out.println("third day of the week");
                break;
            case THU:
                System.out.println("fourth day of the week");
                break;
            case FRI:
                System.out.println("fifth day of the week");
                break;
            case SAT:
                System.out.println("sixth day of the week");
                break;
            case SUN:
                System.out.println("seventh day of the week");
                break;
        }
    }
}
