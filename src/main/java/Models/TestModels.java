package Models;

import enums.DB_INSTANCE;
import enums.DayOfTheWeek;

public class TestModels {
    public static void main(String[] args) {
//        CustomDate cd = new CustomDate(2000, "January", 20, DayOfTheWeek.MONDAY);
//        System.out.println(cd);

        DayOfTheWeek day = DayOfTheWeek.valueOf("MONDAY");
        DayOfTheWeek[] ar = DayOfTheWeek.values();
        for (DayOfTheWeek dayOfTheWeek : ar){
            System.out.println(dayOfTheWeek.getNum());
        }

    }
}
