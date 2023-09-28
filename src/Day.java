public class Day {
    private String nameDay;
    private int numberDay;

    public Day(String nameDay, int numberDay) {
        this.nameDay = nameDay;
        this.numberDay = numberDay;
    }

    public Day(String nameDay) {
        this(nameDay, Integer.parseInt("Not numberDay"));
    }

    public String getNameDay() {
        return nameDay;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public String toString() {
        return getNameDay() + " " + getNumberDay();
    }
}
