package tenum_tests;

import enums.DB_INSTANCE;
import enums.Page;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {
        visitPage(Page.LOOGIN);
        DB_INSTANCE.CLASSICMODELS.query("SELECT * FORM customers");
//        LocalDateTime d = LocalDate.of(1990, Month.APRIL)
    }

    public static void visitPage(Page page){
        System.out.println("Visiting " + page.getUrl());
    }

}
