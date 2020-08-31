package tenum_tests;

import enums.DB_INSTANCE;

public class TestDB {
    public static void main(String[] args) {
        DB_INSTANCE.CLASSICMODELS.open();
        DB_INSTANCE.ECOM.open();
        DB_INSTANCE.ECOM.query("SELECT * FROM EMPLOYEES;");
        DB_INSTANCE.ECOM.close();
        DB_INSTANCE.CLASSICMODELS.query("SELECT * FORM EMPLOYEE;");
        DB_INSTANCE.CLASSICMODELS.close();
    }
}
