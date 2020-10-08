package src.carWash;

public class AdminFunctions {

    public static String printTotalStatistics() {
        if (Menu.totalWashCounter < 0) {
            CW.newLine();
            return "No washes have been purchased.";
        }
        CW.newLine();
        return "A total of " + Menu.totalWashCounter + " washes has been sold.";
    }

    public static String printEconomyStatistics() {
        if (Menu.economyWashCounter < 0) {
            CW.newLine();
            return "No Economy washes have been purchased.";
        }
        CW.newLine();
        return "A total of " + Menu.economyWashCounter + " Economy has been sold.";
    }

    public static String printStandardStatistics() {
        if (Menu.standardWashCounter < 0) {
            CW.newLine();
            return "No Standard washes have been purchased.";
        }
        CW.newLine();
        return "A total of " + Menu.standardWashCounter + " Standard has been sold.";
    }

    public static String printDeluxeStatistics() {
        if (Menu.deluxeWashCounter < 0) {
            CW.newLine();
            return "No Deluxe washes have been purchased.";
        }
        CW.newLine();
        return "A total of " + Menu.deluxeWashCounter + " Deluxe has been sold.";
    }


}
    


