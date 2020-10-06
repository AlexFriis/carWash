package src.carWash;

//haderfc
//TODO: Fix double print/case 3 in secondMenu

import java.util.InputMismatchException;

public class Menu {
    private static boolean userContinue = true;

    public static void firstMenu() {
        try {
            firstMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    Price p;
                    p = new Price();
                    p.printTimeAndDate();
                    CW.newLine();
                    // Time and date function
                    // print current time and date
                    mainMenu();
                    break;
                case 2:
                    CW.newLine();
                    // User Specified time and date function
                    // specify time
                    mainMenu();
                    break;
                case 3:
                    CW.newLine();
                    CW.print(CW.exitSystemMsg());
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    firstMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            UserInput.intIn.next();
            CW.newLine();
            firstMenu();
        }
        CW.newLine();
    }

    private static void firstMenuOptions() {
        CW.printMenu(
                "First menu",
                "Import time & date from computer",
                "Specify time & date",
                "Exit program"
        );
    }

    public static void mainMenu() {
            try {
                mainMenuOptions();
                switch (UserInput.intIn.nextInt()) {
                    case 1:
                        CW.newLine();
                        washMenu();
                        break;
                    case 2:
                        CW.newLine();
                        washCardMenu();
                        break;
                    case 3:
                        CW.newLine();
                        adminMenu();
                        break;
                    case 4:
                        CW.newLine();
                        CW.print(CW.exitSystemMsg());
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
                        WashCard.addWashCard();
                        washCardMenu();
                        break;
                    case 2:
                        CW.newLine();
                        WashCard.getWashCardBalanceFromId();
                        washCardMenu();
                        break;
                    case 3:
                        CW.newLine();
                        // function that recharges wash card with x amount
                        washCardMenu();
                        break;
                    case 4:
                        CW.newLine();
                        CW.print(CW.exitToMainMenuMsg());
                        userContinue = false;
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
                "Buy a new WashCard and print ID",
                "Check WashCard balance",
                "Recharge Wash Card",
                "Exit to main menu"
        );
    }

    public static void washMenu() {
        try {
            washMenuOptions();
            switch (UserInput.intIn.nextInt()) {
                case 1:
                    CW.newLine();
                    // function that does econ wash
                    // prompts if user wants a receipt, if yes prints it out
                    washMenu();
                    break;
                case 2:
                    CW.newLine();
                    // function that does stand. wash
                    // prompts if user wants a receipt, if yes prints it out
                    washMenu();
                    break;
                case 3:
                    CW.newLine();
                    // function that does delux wash
                    // prompts if user wants a receipt, if yes prints it out
                    washMenu();
                case 4:
                    CW.newLine();
                    CW.print(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    washMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            CW.newLine();
            UserInput.intIn.next();
            washMenu();
        }
    }

    private static void washMenuOptions() {
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
                        // function that lists amount of econ washes bought + discount washes
                        adminMenu();
                        break;
                    case 4:
                        CW.newLine();
                        // function that lists amount of standard washes bought + discount washes
                        adminMenu();
                        break;
                    case 5:
                        CW.newLine();
                        // function that lists amount of delux washes bought
                        adminMenu();
                        break;
                    case 6:
                        CW.newLine();
                        // function that lists bought washes by specific wash card
                        adminMenu();
                        break;
                    case 7:
                        CW.newLine();
                        CW.print(CW.exitToMainMenuMsg());
                        userContinue = false;
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
                "List bought washes by specific WashCard",
                "Exit to main menu"
        );
    }
}
