package src.carWash;

import java.util.Date;
import java.util.Scanner;

public class TimeAndDate {
    private static void outputText(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        inputTime();
        localTime();

    }

    private static void localTime() {
        Date date = new java.util.Date();
        System.out.println(date);
    }

    public static void inputTime() {
        Scanner scan = new Scanner(System.in);


        outputText("Please enter the day you would like to visit: ");

        String usrDay = scan.nextLine();

        Design.newLine();
        outputText("Please enter the time of your arrival: ");
        Design.newLine();
        double usrTime = scan.nextDouble();
        outputText("Current day and time is: " + usrDay + ", " + +usrTime);
    }
}


/*
    }
    public static void boolean isWeekend() {
        String day[] = {mon, tue, wed, thur, fri, sat, sun}
        if (day == sun || day == sat) {
            return true;
        }
        return false;
    }*/

/* TODO
    private static void boolean scnDate() {
        if (!isWeekend) {
            //outputText(itsWeekend)
            return true;
        }
        //outputText(notWeekend)
        return false;
    }*/



