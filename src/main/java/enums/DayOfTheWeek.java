package enums;

public enum DayOfTheWeek {
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7),
    SUNDAY(1);

    public int num;

    DayOfTheWeek(int i){
        this.num = i;
    }

    public int getNum(){
        return num;
    }

    public static DayOfTheWeek[] getWeekends(){
        DayOfTheWeek[] weekends = new DayOfTheWeek[]{DayOfTheWeek.SATURDAY, DayOfTheWeek.SUNDAY};
        return weekends;
    }
}
