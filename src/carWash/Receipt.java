package src.carWash;

public class Receipt {
    public int washCardId;
    public int oldBalance;
    public int price;
    public int newBalance;


    public Receipt (int washCardId, int oldBalance, int price, int newBalance){
        this.washCardId = washCardId;
        this.oldBalance = oldBalance;
        this.price = price;
        this.newBalance = newBalance;
        //WashCard.washCardArrList.stream().filter(washCard -> washCardId == washCard.getId());
    }


    public void printReceipt() {
    CW.print(
            "Wash card ID: " + this.washCardId + ".\n"
            + "Old balance: " + this.oldBalance + ".\n"
            + "Price of selected wash: " + this.price + ".\n"
            + "New balance: " + this.newBalance + "."
    );

    }


}
//*Receipt*
//*WashCard ID*
//*Old Balance (ID)*
//*Price of wash*
//*New Balance after wash*
//*Thank you come again plz, we have cookies :)*