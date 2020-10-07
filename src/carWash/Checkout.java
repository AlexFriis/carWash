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
        CW.print("The price of the selected wash is: " + getPriceEcon() + " DKK"); }

    public static int getPriceStandard() {
        Price p = new Price();
        return p.getStandard();

    }
    public static void printStandard() {
        CW.print("The price of the selected wash is: " + getPriceStandard() + " DKK"); }

    public static int getPriceDeluxe() {
        Price p = new Price();
        return p.getDeluxe();
    }
    public static void printDeluxe() {
        CW.print("The price of the selected wash is: " + getPriceDeluxe() + " DKK"); }


        /*public static void checkFunds() {
        if (balance < price) {
            return "Insufficient funds";
        }
        */
/*
    public void printReceipt(String Receipt,
                                   int washCard,
                                   int oldBalance,
                                   int price,
                                   int newBalance,
                                   String receiptMsg) {
        WashCard w = new WashCard();

        this.washCard = washCard;
        this.oldBalance = oldBalance;
        this.price = price;
        this.newBalance = newBalance;


    } */
    //*Receipt*
    //*WashCard ID*
    //*Old Balance ID*
    //*Price of wash*
    //*New Balance after wash*
    //*Thank you come again plz, we have cookies :)*
    
}

//Balance - wash
// Print receipt
