import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Day ");
        Day monday = new Day("Monday", 1);
        System.out.println(monday);
        System.out.println("monday.getNameDay() = " + monday.getNameDay());
        System.out.println("monday.getNumberDay() = " + monday.getNumberDay());
        Day[] week = new Day[7];
        week[0] = monday;
        week[1] = new Day("Tuesday", 2);
        week[2] = new Day("Wednesday", 3);
        week[3] = new Day("Thursday", 4);
        week[4] = new Day("Friday", 5);
        week[5] = new Day("Saturday", 6);
        week[6] = new Day("Sunday", 7);
        System.out.println(Arrays.toString(week));
    }
}