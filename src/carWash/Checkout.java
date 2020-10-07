package src.carWash;

//handles receipts
//Id
//price
//receipt

import java.util.InputMismatchException;

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

    public static void doCheckout(int i) {
        int price;
        //int oldbalance = washcard.getbalance;
        int newbalance;
        var inputId = UserInput.intIn();
        var washCard = WashCard.getWashCardById(inputId);

        //TESTER
        CW.print("" + washCard.getBalance());
        switch (i) {
            case 1:
                price = getPriceEcon();

                //int newbalance = oldbalance - price;
                //washCard.setbalance(oldbalance - price);

                //Needs method to acquire washCardId MATHIAS HALP ERMERGANCAY
                //Receipt r = new Receipt(washCardId, oldBalance, price, newBalance);
                //receiptMenu(r);
            case 2:
                price = getPriceStandard();

                //int newbalance = oldbalance - price;
                //washCard.setbalance(oldbalance - price);

                //Needs method to acquire washCardId MATHIAS HALP ERMERGANCAY
                //Receipt r = new Receipt(washCardId, oldBalance, price, newBalance);
                //receiptMenu(r);
            case 3:
                price = getPriceDeluxe();

                //int newbalance = oldbalance - price;
                //washCard.setbalance(oldbalance - price);

                //Needs method to acquire washCardId MATHIAS HALP ERMERGANCAY
                //Receipt r = new Receipt(washCardId, oldBalance, price, newBalance);
                //receiptMenu(r);
            default:

        }
    }

    public void receiptMenu(Receipt r) {
        try {
            washCheckoutOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    //r.printReceipt();
                    CW.print("Thank you for your purchase, have a shine-tastic day!");
                    CW.newLine();
                    break;
                case 2:
                    CW.newLine();
                    CW.print("Thank you for your purchase, have a shine-tastic day!");
                    return;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    receiptMenu(r);
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
        }
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
