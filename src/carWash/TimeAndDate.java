package src.carWash;

import java.util.Date;
//import java.util.SimpleDateFormat;

public class TimeAndDate {
    public static void main(String[] args) {
        localTime();
    }

    private static void localTime() {
        Date date = new java.util.Date();
        System.out.println(date);
    }

}
