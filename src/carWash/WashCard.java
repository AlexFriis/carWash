package src.carWash;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class WashCard {

    private int id;
    private int balance;
    private static int i;
    static ArrayList<WashCard> washCardArrList = new ArrayList<>();

    public WashCard() {
    }

    public WashCard(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void addWashCard() {
        int id = WashCardIdGenerator.idGenerator();
        int balance;

        CW.print("Please enter amount you want to deposit");
        balance = UserInput.intIn.nextInt();
        CW.newLine();
        CW.print("WashCard (ID: " + id + ") created with balance: " + balance + " DKK");
        CW.newLine();
        washCardArrList.add(new WashCard(id, balance));
    }

    public static void deleteWashCard() {
        int i;
        if (washCardArrListSizeNotZero()) {
            try {
                CW.print("Please specify WashCard ID or write Exit to go back: ");
                int oldId = UserInput.intIn();
                for (i = 0; i < washCardArrList.size(); i++) {
                    if (washCardArrListIdEqualsIdIn(i, oldId)) {
                        washCardArrList.remove(i);
                        CW.newLine();
                        CW.print("WashCard: " + oldId + " has been deleted successfully");
                        break;
                    } else {
                        CW.print("System has no WashCard with id " + oldId + ". Returning to main menu!");
                        CW.newLine();
                        Menu.mainMenu();
                    }
                }
            } catch (InputMismatchException e) {
                CW.newLine();
                CW.print(CW.inputMismatchExceptionMsg());
                CW.newLine();
                Menu.mainMenu();
            }
        } else {
            CW.print(CW.noWashCardsRegisteredMsg());
            CW.newLine();
            Menu.mainMenu();
            CW.newLine();
        }
        CW.newLine();
    }

    public static void listAllWashCards() {
        if (washCardArrListSizeNotZero()) {
            CW.print("WashCard Information:" + CW.bars());
            for (i = 0; i < washCardArrList.size(); i++) {
                outputWashCardList(i);
            }
        }
        else {
            CW.newLine();
            CW.print(CW.noWashCardsRegisteredMsg());
        }
        CW.print(CW.bars());
    }

    public static void getWashCardBalanceFromId() {
        if (washCardArrListSizeNotZero()) {
            CW.print("Please specify WashCard ID");
            int id = UserInput.intIn.nextInt();
            CW.newLine();
            for (i = 0; i < washCardArrList.size(); i++) {
                if (washCardArrListIdEqualsIdIn(i, id)) {
                    CW.print("WashCard balance for ID: " + id + CW.bars());
                    CW.print(washCardArrList.get(i).getBalance() + " DKK");
                    CW.newLine();
                }
                else {
                    CW.print(CW.noWashCardsEqualToInputMsg(id));
                }
            }
        }
        else {
            CW.newLine();
            CW.print(CW.noWashCardsRegisteredMsg());
        }
    }

    private static boolean washCardArrListSizeNotZero() {
        return (washCardArrList.size() != 0);
    }

    private static boolean washCardArrListIdEqualsIdIn(int i, int Id) {
        return (washCardArrList.get(i).getId() == Id);
    }

    private static void outputWashCardList(int i) {
        CW.print("ID: " + washCardArrList.get(i).getId());
        CW.print("Balance: " + washCardArrList.get(i).getBalance());
        CW.newLine();
    }
}
