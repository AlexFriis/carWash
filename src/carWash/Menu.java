package src.carWash;

//haderfc
//TODO: Fix double print/case 3 in secondMenu

import java.util.InputMismatchException;

public class Menu {
    private static boolean userContinue = true;

    public static void firstMenu() {
        firstMenuOptions();
        try {
            switch (UserInput.intIn()) {
                case 1:
                    CW.newLine();
                    Price p;
                    p = new Price();
                    p.printTimeAndDate();
                    CW.newLine();
                    // Time and date function
                    // print current time and date
                    secondMenu();
                case 2:
                    CW.newLine();
                    // User Specified time and date function
                    // specify time
                    secondMenu();
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

    public static void secondMenu() {
        secondMenuOptions();
        try {
            switch (UserInput.intIn()) {
                case 1:
                    CW.newLine();
                    // function that uses existing wash card by providing ID
                    mainMenu();
                case 2:
                    CW.newLine();
                    WashCard.addWashCard();
                    mainMenu();
                case 3:
                    CW.newLine();
                    CW.print(CW.exitSystemMsg());
                    break;
                default:
                    CW.newLine();
                    CW.print(CW.defaultMenuMsg());
                    secondMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            CW.print(CW.inputMismatchExceptionMsg());
            UserInput.intIn.next();
            CW.newLine();
            secondMenu();
        }
        CW.newLine();
    }

    private static void secondMenuOptions() {
        CW.printMenu(
                "Second menu",
                "Use existing Wash Card by providing ID",
                "Buy a new Wash Card and print ID",
                "Exit program"
        );
    }

    public static void mainMenu() {
        mainMenuOptions();
        try {
            switch (UserInput.intIn()) {
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
                "Manage Wash Card",
                "Admin Menu",
                "Exit program"
        );
    }

    public static void washCardMenu() {
        while (userContinue) {
            washCardMenuOptions();
            try {
                switch (UserInput.intIn()) {
                    case 1:
                        CW.newLine();
                        // function that checks wash card balance
                        break;
                    case 2:
                        CW.newLine();
                        // function that recharges wash card with x amount
                        break;
                    case 3:
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
    }

    private static void washCardMenuOptions() {
        CW.printMenu(
                "Wash Card Menu",
                "Check Wash Card balance",
                "Recharge Wash Card",
                "Exit to main menu"
        );
    }

    public static void washMenu() {
        washMenuOptions();
        try {
            switch (UserInput.intIn()) {
                case 1:
                    CW.newLine();
                    // function that does econ wash
                    // prompts if user wants a receipt, if yes prints it out
                    break;
                case 2:
                    CW.newLine();
                    // function that does stand. wash
                    // prompts if user wants a receipt, if yes prints it out
                    break;
                case 3:
                    CW.newLine();
                    // function that does delux wash
                    // prompts if user wants a receipt, if yes prints it out
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
        while (userContinue) {
            adminMenuOptions();
            try {
                switch (UserInput.intIn()) {
                    case 1:
                        CW.newLine();
                        WashCard.listAllWashCards();
                        break;
                    case 2:
                        CW.newLine();
                        WashCard.deleteWashCard();
                        break;
                    case 3:
                        CW.newLine();
                        // function that lists amount of econ washes bought + discount washes
                        break;
                    case 4:
                        CW.newLine();
                        // function that lists amount of standard washes bought + discount washes
                        break;
                    case 5:
                        CW.newLine();
                        // function that lists amount of delux washes bought
                        break;
                    case 6:
                        CW.newLine();
                        // function that lists bought washes by specific wash card
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
    }

    private static void adminMenuOptions() {
        CW.printMenu(
                "Admin Menu",
                "List all added WashCards",
                "Delete existing Wash Card",
                "Show amount of bought Econ washes",
                "Show amount of bought De-Luxe washes",
                "List bought washes by specific WashCard",
                "Exit to main menu"
        );
    }
}
