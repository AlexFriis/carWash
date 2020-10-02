package src.carWash;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Price {
    private Scanner scn = new Scanner(System.in);

    private void outputText(String text) {
        System.out.println(text);
    }

    public void main(String[] args) {
        inputTime();
        localTime();
    }

    private void localTime() {
        Date date = new java.util.Date();
        System.out.println(date);
    }

    public void inputTime() {
        


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



