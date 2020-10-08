package src.carWash;

//handles receipts
//Id
//price
//receipt

public class Checkout {

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


    public static int doCheckout(int i) {
        int price;
        switch (i) {
            case 1:
                price = getPriceEcon();
                break;
            case 2:
                price = getPriceStandard();
                break;
            case 3:
                price = getPriceDeluxe();
                break;
            default:
                System.exit(0);
                break;
        }
        return i;
    }


    public static void washCheckoutOptions() {
        CW.printMenu("Print Receipt?",
                "Yes",
                "No");

    }


}
    /*
    Receipt r = new Receipt();

    */
        /*public static void checkFunds() {
        if (balance < price) {
            return "Insufficient funds";
        }
        */


//Balance - wash
// Print receipt
