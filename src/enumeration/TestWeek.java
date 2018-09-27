package enumeration;

public class TestWeek {
    public static void main(String[] args) {
        Week week = new Week();
        week.whatToDo(Day.SATURDAY);
        week.whatToDo(Day.MONDAY);
        week.whatToDo(Day.NO);

    }
}
