package src.carWash;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Checkout {
    private Price price;
    
    public Checkout(){
        price = new Price();
    }    

    public void printPrice() {
        var scanner = new Scanner(System.in);
        int timeOfDay;
        int dayOfWeek;
        CW.printMenu("Weekdays", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        do {
            CW.outputText("Please enter right input.");
            dayOfWeek = scanner.nextInt(); 
        } while (dayOfWeek < 1 || dayOfWeek > 7);
        do {
            CW.outputText("Please enter right input.");
            timeOfDay = scanner.nextInt(); 
        } while (timeOfDay < 0 || timeOfDay > 23);
        
    
        this.price.getEconomy(DayOfWeek.of(dayOfWeek), timeOfDay);
        scanner.close();
    }
    
    //handles receipts + calc of price deductions
}
