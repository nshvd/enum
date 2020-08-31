package Models;

import enums.DayOfTheWeek;

public class CustomDate {
    int year;
    String month;
    int day;
    DayOfTheWeek dayOfTheWeek;

    public CustomDate(int year, String month, int day, DayOfTheWeek dayOfTheWeek) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "year=" + year +
                ", month='" + month + '\'' +
                ", day=" + day +
                ", dayOfTheWeek=" + dayOfTheWeek +
                '}';
    }
}
