package enums;

import java.sql.Connection;
import java.sql.Statement;

public enum DB_INSTANCE {
    ECOM("ecom"),
    CLASSICMODELS("classicmodels"),
    FOODDELIVERY("food_delivery");

    private Connection connection;
    private Statement statement;
    private String db_name;

    public void query(String q){
        System.out.println("Query sent " + name() + ": \n" + q);
    }

    public void open(){
        System.out.println("Opening connection: " + name());
    }

    public void close(){
        System.out.println("closing connection: " + name());
    }

     DB_INSTANCE(String db_name){
        this.db_name = db_name;
    }

    public String getDb_name(){
         return db_name;
    }
}
