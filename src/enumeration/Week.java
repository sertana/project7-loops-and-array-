package enumeration;

public class Week {
    Day day;
    public Week(){}
    public Week (Day day){
        this.day = day;
    }
    public void whatToDo(Day day){
        switch(day){
            case MONDAY:
                System.out.println("Start codelab");
                break;
            case TUESDAY:
                System.out.println("Start codela1");
                break;
            case WEDNESDAY:
                System.out.println("Start codelab2");
                break;
            case THURSDAY:
                System.out.println("Start codelab3");
                break;
            case FRIDAY:
                System.out.println("Start codelab4");
                break;
            case SATURDAY:
                System.out.println("Start codelab5");
                break;
            case SUNDAY:
                System.out.println("Start codelab6");
                break;
            default:
                System.out.println("u Crazy");
        }
    }
}
