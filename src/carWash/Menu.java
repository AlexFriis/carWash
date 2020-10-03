package src.carWash;

//haderfc

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner in = new Scanner(System.in);
    private static boolean userContinue = true;

    public static void firstMenu() {
        firstMenuOptions();
        try {
            switch (in.nextInt()) {
                case 1:
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
                    outputText(CW.exitSystemMsg());
                    break;
                default:
                    outputText(CW.defaultMenuMsg());
                    firstMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            outputText(CW.inputMismatchExceptionMsg());
            in.next();
            CW.newLine();
            firstMenu();
        }
        CW.newLine();
    }

    private static void firstMenuOptions() {
        outputText(CW.headline());
        outputText(CW.menuBars());
        outputText("1. Import time & date from computer");
        outputText("2. Specify time & date");
        outputText("3. Exit program");
        outputText(CW.menuBars());
    }

    public static void secondMenu() {
        secondMenuOptions();
        try {
            switch (in.nextInt()) {
                case 1:
                    CW.newLine();
                    // function that uses existing wash card by providing ID
                    mainMenu();
                case 2:
                    CW.newLine();
                    // Function that adds new washcard
                    mainMenu();
                case 3:
                    CW.newLine();
                    outputText(CW.exitSystemMsg());
                    break;
                default:
                    CW.newLine();
                    outputText(CW.defaultMenuMsg());
                    secondMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            outputText(CW.inputMismatchExceptionMsg());
            in.next();
            CW.newLine();
            secondMenu();
        }
        CW.newLine();
    }

    private static void secondMenuOptions() {
        outputText(CW.headline());
        outputText(CW.menuBars());
        outputText("1. Use existing Wash Card by providing ID");
        outputText("2. Buy a new Wash Card and print ID");
        outputText("3. Exit program");
        outputText(CW.menuBars());
    }

    public static void mainMenu() {
        mainMenuOptions();
        try {
            switch (in.nextInt()) {
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
                    outputText(CW.exitSystemMsg());
                    break;
                default:
                    CW.newLine();
                    outputText(CW.defaultMenuMsg());
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            outputText(CW.inputMismatchExceptionMsg());
            in.next();
            CW.newLine();
            mainMenu();
        }
        CW.newLine();
    }

    private static void mainMenuOptions() {
        outputText(CW.headline());
        outputText(CW.menuBars());
        outputText("*****Main menu*****");
        outputText("1. Wash your car");
        outputText("2. Manage Wash Card");
        outputText("3. Admin Menu");
        outputText("4. Exit program");
        outputText(CW.menuBars());
    }

    public static void washCardMenu() {
        while (userContinue) {
            washCardMenuOptions();
            try {
                switch (in.nextInt()) {
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
                        outputText(CW.exitToMainMenuMsg());
                        userContinue = false;
                        CW.newLine();
                        mainMenu();
                        break;
                    default:
                        CW.newLine();
                        outputText(CW.defaultMenuMsg());
                        washCardMenu();
                        break;
                }
            } catch (InputMismatchException e) {
                CW.newLine();
                outputText(CW.inputMismatchExceptionMsg());
                CW.newLine();
                in.next();
            }
        }
    }

    private static void washCardMenuOptions() {
        outputText(CW.headline());
        outputText(CW.menuBars());
        outputText("*****Wash Card Menu*****");
        outputText("1. Check Wash Card balance");
        outputText("2. Recharge Wash Card");
        outputText("3. Exit to main menu");
        outputText(CW.menuBars());
    }

    public static void washMenu() {
        washMenuOptions();
        try {
            switch (in.nextInt()) {
                case 1:
                    CW.newLine();
                    // function that does econ wash
                    // prompts if user wants a receipt, if yes prints it out
                    break;
                case 2:
                    CW.newLine();
                    // function that recharges wash card with x amount
                    // prompts if user wants a receipt, if yes prints it out
                    break;
                case 3:
                    CW.newLine();
                    // function that does delux wash
                    // prompts if user wants a receipt, if yes prints it out
                case 4:
                    CW.newLine();
                    outputText(CW.exitToMainMenuMsg());
                    CW.newLine();
                    mainMenu();
                    break;
                default:
                    CW.newLine();
                    outputText(CW.defaultMenuMsg());
                    washMenu();
                    break;
            }
        } catch (InputMismatchException e) {
            CW.newLine();
            outputText(CW.inputMismatchExceptionMsg());
            CW.newLine();
            in.next();
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
      /*
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("*****Wash Menu*****");
        outputText("1. Economy wash");
        outputText("2. Standard wash");
        outputText("3. De-luxe wash");
        outputText("4. Exit to main menu");
        outputText(Design.menuBars());
        */
    }

    public static void adminMenu() {
        while (userContinue) {
            washCardMenuOptions();
            try {
                switch (in.nextInt()) {
                    case 1:
                        CW.newLine();
                        // function that deletes wash card from system
                        break;
                    case 2:
                        CW.newLine();
                        // function that lists amount of econ washes bought + discount washes
                        break;
                    case 3:
                        CW.newLine();
                        // function that lists amount of standard washes bought + discount washes
                        break;
                    case 4:
                        CW.newLine();
                        // function that lists amount of delux washes bought
                        break;
                    case 5:
                        CW.newLine();
                        // function that lists bought washes by specific wash card
                        break;
                    case 6:
                        CW.newLine();
                        outputText(CW.exitToMainMenuMsg());
                        userContinue = false;
                        CW.newLine();
                        mainMenu();
                        break;
                    default:
                        CW.newLine();
                        outputText(CW.defaultMenuMsg());
                        washCardMenu();
                        break;
                }
            } catch (InputMismatchException e) {
                CW.newLine();
                outputText(CW.inputMismatchExceptionMsg());
                CW.newLine();
                in.next();
            }
        }
    }

    private static void adminMenuOptions() {
        outputText(CW.headline());
        outputText(CW.menuBars());
        outputText("*****Admin Menu*****");
        outputText("1. Delete existing Wash Card");
        outputText("2. Show amount of bought Econ washes");
        outputText("3. Show amount of bought Standard washes");
        outputText("4. Show amount of bought De-Luxe washes");
        outputText("5. List bought washes by specific Wash Card");
        outputText("6. Exit to main menu");
        outputText(CW.menuBars());
    }

    private static void outputText(String text) {
        System.out.println(text);
    }
}
