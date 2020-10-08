package src.carWash;

import java.time.*;

public class Price {
    private final int economy;
    private final int standard;
    private final int deluxe;

    private static LocalDateTime timestamp() {
        return LocalDateTime.now().withNano(0);
    }
    public static void printTimeAndDate() {
        System.out.println("Current date & time is: "
                + "\n"
                + "Format yyyy-mm-dd H-m-s"
                + "\n"
                + timestamp());
    }

    // Implicit constructor
    public Price() {
        this.economy = 50;
        this.standard = 80;
        this.deluxe = 120;
    }
    // Explicit constructor
    public Price(int economy, int standard, int deluxe) {
        this.economy = economy;
        this.standard = standard;
        this.deluxe = deluxe;
    }
    public int getEconomy() {
        if (this.isDiscountAvailable(timestamp())) {
            return (int) (this.economy * 0.8);
        }
        return this.economy;
    }
    public int getStandard() {
        if (this.isDiscountAvailable(timestamp())) {
            return (int) (this.standard * 0.8);
        }
        return this.standard;
    }
    public int getDeluxe() {
        return this.deluxe;
    }

    private boolean isDiscountAvailable(LocalDateTime timestamp) {
        switch (timestamp.getDayOfWeek()) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (timestamp.getHour() < 14) {
                    return true;
                }
            case SATURDAY:
            case SUNDAY:
            default:
                return false;
        }
    }

}
