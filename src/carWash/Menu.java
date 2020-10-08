package src.carWash;

//haderfc
/*TODO:
- Checkout - Checkfunds
- Checkout - PrintReceipt

- SIDSTE UML DIMSDIMSDIMS?!?!?!

- Clean up code
- Deliver
 */

import java.util.InputMismatchException;


public class Menu {
    public static int economyWashCounter = 0;
    public static int standardWashCounter = 0;
    public static int deluxeWashCounter = 0;
    public static int totalWashCounter = 0;

    public static void superShine() {
        CW.newLine();
        CW.print("Welcome to Super-Shine!");
        CW.newLine();
        Price.printTimeAndDate();
        mainMenu();
    }

    public static void mainMenu() {
        try {
            mainMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    WashCard.addWashCard();
                    mainMenu();
                    break;
                case 2:
                    CW.newLine();
                    WashCard.changeInfo();
                    break;
                case 3:
                    CW.newLine();
                    washCardMenu();
                    break;
                case 4:
                    CW.newLine();
                    adminPasswordSubmenu();
                    break;
                case 5:
                    CW.newLine();
                    CW.print(CW.exitSystemMsg());
                    System.exit(0);
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            UserInput.intIn.next();
            CW.newLine();
            mainMenu();
        }
        CW.newLine();
    }

    private static void mainMenuOptions() {
        CW.printMenu(
                "Main menu",
                "Buy a new WashCard",
                "Wash your car",
                "Manage WashCard",
                "Admin Menu",
                "Exit program"
        );
    }
    public static void washCardMenu() {
        try {
            washCardMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    WashCard.getWashCardBalanceFromId();
                    washCardMenu();
                    break;
                case 2:
                    CW.newLine();
                    WashCard.rechargeBalance();
                    washCardMenu();
                    break;
                case 3:
                    CW.newLine();
                    CW.print(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    washCardMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
        }
    }
    private static void washCardMenuOptions() {
        CW.printMenu(
                "Wash Card Menu",
                "Check WashCard balance",
                "Recharge Wash Card",
                "Exit to main menu"
        );
    }
    public static void washMenu(int i) {
        try {
            washMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    int j = Checkout.getPriceEcon();
                    Menu.economyWashCounter++;
                    Menu.totalWashCounter++;
                    CW.newLine();
                    Checkout.printEconomy();
                    CW.print("Do you want a receipt?");
                    String answer = UserInput.in.nextLine();
                    CW.newLine();
                    if (Checkout.userWantsReceipt(answer)) {
                        receiptPrinter(i, j);
                    }
                    else {
                        washMenu(i);
                    }
                    // function that does econ wash
                    // prompts if user wants a receipt, if yes prints it out
                    break;
                case 2:
                    Menu.standardWashCounter++;
                    Menu.totalWashCounter++;
                    CW.newLine();
                    Checkout.printStandard();
                    CW.newLine();
                    //Checkout.doCheckout(i);
                    // function that does stand. wash
                    // prompts if user wants a receipt, if yes prints it out
                    washMenu(i);
                    break;
                case 3:
                    Menu.deluxeWashCounter++;
                    Menu.totalWashCounter++;
                    CW.newLine();
                    Checkout.printDeluxe();
                    CW.newLine();
                    //Checkout.doCheckout(i);
                    // function that does delux wash
                    // prompts if user wants a receipt, if yes prints it out
                    washMenu(i);
                case 4:
                    CW.newLine();
                    CW.print(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    washMenu(i);
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
            washMenu(i);
        }
    }

    public static void washMenuOptions() {
        CW.printMenu(
                "Wash Menu",
                "Economy Wash",
                "Standard Wash",
                "De Luxe Wash",
                "Exit to main menu"
        );
    }

    public static void adminMenu() {
        try {
            adminMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    WashCard.listAllWashCards();
                    adminMenu();
                    break;
                case 2:
                    CW.newLine();
                    WashCard.deleteWashCard();
                    adminMenu();
                    break;
                case 3:
                    CW.newLine();
                    CW.print(AdminFunctions.printEconomyStatistics());
                    adminMenu();
                    break;
                case 4:
                    CW.newLine();
                    CW.print(AdminFunctions.printStandardStatistics());// function that lists amount of standard washes bought + discount washes
                    adminMenu();
                    break;
                case 5:
                    CW.newLine();
                    CW.print(AdminFunctions.printDeluxeStatistics());
                    adminMenu();
                    break;
                case 6:
                    CW.newLine();
                    CW.print(AdminFunctions.printTotalStatistics() + "\nOf which: \n"
                            + AdminFunctions.printEconomyStatistics() + "\n"
                            + AdminFunctions.printStandardStatistics() + "\n"
                            + AdminFunctions.printDeluxeStatistics());

                    adminMenu();
                    break;
                case 7:
                    CW.newLine();
                    //Insert function - Search specific Washcard
                    CW.print("Nothing here yet boso");
                    CW.newLine();
                    adminMenu();
                case 8:
                    CW.newLine();
                    CW.print(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    washCardMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
        }
    }

    private static void adminMenuOptions() {
        CW.printMenu(
                "Admin Menu",
                "List all added WashCards",
                "Delete existing Wash Card",
                "Show amount of bought Econ washes",
                "Show amount of bought Standard washes",
                "Show amount of bought De-Luxe washes",
                "Show amount of total bought washes",
                "List bought washes by specific WashCard",
                "Exit to main menu"
        );
    }

    public static void adminPasswordSubmenu() {
        CW.print("Please input password");
        String pass = UserInput.in.nextLine();
        if (pass.equals("1234")) {
            adminMenu();
        }
        CW.newLine();
        CW.print("Password: \"" + pass + "\" is incorrect. Returning to main menu!");
        CW.newLine();
        mainMenu();
    }

    public static void receiptPrinter(int i, int j) {
        int oldBalance = WashCard.washCardArrList.get(i).getBalance();
        int newBalance;
        newBalance = (oldBalance - j);
        CW.print("ID: " + WashCard.washCardArrList.get(i).getId());
        CW.print("Previous Balance: " + WashCard.washCardArrList.get(i).getBalance());
        CW.print("Price of selected wash: " + j + ".");
        CW.print("New balance: " + newBalance + ".");


    }
    /* public static void receiptMenu(int i) {
        try {
            receiptMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    receiptPrinter(i);
                    CW.print("Thank you for your purchase, have a shine-tastic day!");
                    CW.newLine();
                    break;
                case 2:
                    CW.newLine();
                    CW.print(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    receiptMenu(i);
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
        }
    }
    public static void receiptMenuOptions() {
        CW.printMenu(
                "Would you like a receipt?",
                "Yes",
                "No"
        );

    }

     */
}