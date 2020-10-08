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

    public static void printEconomy(int i) {
        int balance = getBalanceFromIndex(i);
        int updatedBalance = balance - getPriceEcon();
        if (balance > getPriceEcon()) {
            CW.print("Your current balance is: " + balance + " DKK.");
            CW.print("The price of the selected wash is: " + getPriceEcon() + " DKK");
            setBalanceAccordingToBoughtWash(i, updatedBalance);
        } else {
            CW.print("Insufficient funds! Recharge your card.");
            Menu.washCardMenu();
        }
    }

    public static void receiptPrinterEcon(int i) {
        int washType = getPriceEcon();
        printReceipt(i, washType);
    }

    public static int getPriceStandard() {
        Price p = new Price();
        return p.getStandard();
    }

    public static void printStandard(int i) {
        int balance = getBalanceFromIndex(i);
        int updatedBalance = balance - getPriceStandard();
        if (balance > getPriceStandard()) {
            CW.print("Your current balance is: " + balance + " DKK.");
            CW.print("The price of the selected wash is: " + getPriceStandard() + " DKK");
            setBalanceAccordingToBoughtWash(i, updatedBalance);
        } else {
            CW.print("Insufficient funds! Recharge your card.");
            Menu.washCardMenu();
        }
    }

    public static void receiptPrinterStand(int i) {
        int washType = getPriceStandard();
        printReceipt(i, washType);
    }

    public static int getPriceDeluxe() {
        Price p = new Price();
        return p.getDeluxe();
    }

    public static void printDeluxe(int i) {
        int balance = getBalanceFromIndex(i);
        int updatedBalance = balance - getPriceDeluxe();
        if (balance > getPriceEcon()) {
            CW.print("Your current balance is: " + balance + " DKK.");
            CW.print("The price of the selected wash is: " + getPriceDeluxe() + " DKK");
            setBalanceAccordingToBoughtWash(i, updatedBalance);
        } else {
            CW.print("Insufficient funds! Recharge your card.");
            Menu.washCardMenu();
        }
    }

    public static void receiptPrinterDelux(int i) {
        int washType = getPriceDeluxe();
        printReceipt(i, washType);
    }

    private static int getBalanceFromIndex(int i) {
        return WashCard.washCardArrList.get(i).getBalance();
    }

    private static int getIdFromIndex(int i) {
        return WashCard.washCardArrList.get(i).getId();
    }

    private static void setBalanceAccordingToBoughtWash(int i, int updatedBalance) {
        WashCard.washCardArrList.get(i).setBalance(updatedBalance);
    }

    private static void printReceipt(int i, int washType) {
        CW.print("ID: " + getIdFromIndex(i));
        CW.print("Price of selected wash: " + washType + " DKK.");
        CW.print("New balance: " + getBalanceFromIndex(i) + " DKK.");
    }

    public static boolean userWantsReceipt(String answer) {
        boolean userWantsReceipt = false;
        if (answer.toLowerCase().equals("yes")) {
            userWantsReceipt = true;
        }
        return userWantsReceipt;
    }
}
