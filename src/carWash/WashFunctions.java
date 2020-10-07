package src.carWash;

public class WashFunctions {
    //logic related to washing your car, washmenu
    public static int getPriceEcon() {
        Price p = new Price();
        return p.getEconomy();

    }
    public static void printEconomy() {
        CW.print("The price of the selected wash is: " + getPriceEcon() + " DKK");
    }
    public static int getPriceStandard() {
        Price p = new Price();
        return p.getStandard();

    }
    public static void printStandard() {
        CW.print("The price of the selected wash is: " + getPriceStandard() + " DKK");
    }
    public static int getPriceDeluxe() {
        Price p = new Price();
        return p.getDeluxe();
    }
    public static void printDeluxe() {
        CW.print("The price of the selected wash is: " + getPriceDeluxe() + " DKK");
    }

}
