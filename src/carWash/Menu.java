package src.carWash;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner in = new Scanner(System.in);
    private static boolean userContinue = true;
    public static void firstMenu() {
        firstMenuOptions();
        try {
            switch(in.nextInt()) {
                case 1:
                    Design.newLine();
                    //Time and date function
                    //print current time and date
                    secondMenu();
                case 2:
                    Design.newLine();
                    //User Specified time and date function
                    //specify time
                    secondMenu();
                case 3:
                    outputText(Design.exitSystemMsg());
                    break;
                default:
                    outputText(Design.defaultMenuMsg());
                    firstMenu();
                    break;
            }
        }
        catch (InputMismatchException e) {
            Design.newLine();
            Design.inputMismatchExceptionMsg();
            in.next();
            Design.newLine();
            firstMenu();
        }
        Design.newLine();
    }
    private static void firstMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("1. Import time & date from computer");
        outputText("2. Specify time & date");
        outputText("3. Exit program");
        outputText(Design.menuBars());
    }
    public static void secondMenu() {
        secondMenuOptions();
        try {
            switch(in.nextInt()) {
                case 1:
                    Design.newLine();
                    //function that uses existing wash card by providing ID
                    mainMenu();
                case 2:
                    Design.newLine();
                    //Function that adds new washcard
                    mainMenu();
                case 3:
                    outputText(Design.exitSystemMsg());
                    break;
                default:
                    outputText(Design.defaultMenuMsg());
                    secondMenu();
                    break;
            }
        }
        catch (InputMismatchException e) {
            Design.newLine();
            Design.inputMismatchExceptionMsg();
            in.next();
            Design.newLine();
            secondMenu();
        }
        Design.newLine();
    }
    private static void secondMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("1. Use existing Wash Card by providing ID");
        outputText("2. Buy a new Wash Card and print ID");
        outputText("3. Exit program");
        outputText(Design.menuBars());
    }
    public static void mainMenu() {
        mainMenuOptions();
        try {
            switch(in.nextInt()) {
                case 1:
                    Design.newLine();
                    washMenu();
                    break;
                case 2:
                    Design.newLine();
                    washCardMenu();
                    break;
                case 3:
                    Design.newLine();
                    adminMenu();
                    break;
                case 4:
                    outputText(Design.exitSystemMsg());
                    break;
                default:
                    outputText(Design.defaultMenuMsg());
                    mainMenu();
                    break;
            }
        }
        catch (InputMismatchException e) {
            Design.newLine();
            Design.inputMismatchExceptionMsg();
            in.next();
            Design.newLine();
            mainMenu();
        }
        Design.newLine();
    }
    private static void mainMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("*****Main menu*****");
        outputText("1. Wash your car");
        outputText("2. Manage Wash Card");
        outputText("3. Admin Menu");
        outputText("4. Exit program");
        outputText(Design.menuBars());
    }
    public static void washCardMenu() {
        while (userContinue) {
            washCardMenuOptions();
            try {
                switch(in.nextInt()) {
                    case 1:
                        Design.newLine();
                        //function that checks wash card balance
                        break;
                    case 2:
                        Design.newLine();
                        //function that recharges wash card with x amount
                        break;
                    case 3:
                        Design.newLine();
                        outputText(Design.exitToMainMenuMsg());
                        userContinue = false;
                        Design.newLine();
                        mainMenu();
                        break;
                    default:
                        outputText(Design.defaultMenuMsg());
                        washCardMenu();
                        break;
                }
            }
            catch (InputMismatchException e) {
                Design.newLine();
                Design.inputMismatchExceptionMsg();
                Design.newLine();
                in.next();
            }
        }
    }
    private static void washCardMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("*****Wash Card Menu*****");
        outputText("1. Check Wash Card balance");
        outputText("2. Recharge Wash Card");
        outputText("3. Exit to main menu");
        outputText(Design.menuBars());
    }
    public static void washMenu() {
            washMenuOptions();
            try {
                switch(in.nextInt()) {
                    case 1:
                        Design.newLine();
                        //function that does econ wash
                        //prompts if user wants a receipt, if yes prints it out
                        break;
                    case 2:
                        Design.newLine();
                        //function that recharges wash card with x amount
                        //prompts if user wants a receipt, if yes prints it out
                        break;
                    case 3:
                        Design.newLine();
                        //function that does delux wash
                        //prompts if user wants a receipt, if yes prints it out
                    case 4:
                        Design.newLine();
                        outputText(Design.exitToMainMenuMsg());
                        Design.newLine();
                        mainMenu();
                        break;
                    default:
                        outputText(Design.defaultMenuMsg());
                        washMenu();
                        break;
                }
            }
            catch (InputMismatchException e) {
                Design.newLine();
                Design.inputMismatchExceptionMsg();
                Design.newLine();
                in.next();
                washMenu();
        }
    }
    private static void washMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("*****Wash Menu*****");
        outputText("1. Economy wash");
        outputText("2. Standard wash");
        outputText("3. De-luxe wash");
        outputText("4. Exit to main menu");
        outputText(Design.menuBars());
    }
    public static void adminMenu() {
        while (userContinue) {
            washCardMenuOptions();
            try {
                switch(in.nextInt()) {
                    case 1:
                        Design.newLine();
                        //function that deletes wash card from system
                        break;
                    case 2:
                        Design.newLine();
                        //function that lists amount of econ washes bought + discount washes
                        break;
                    case 3:
                        Design.newLine();
                        //function that lists amount of standard washes bought + discount washes
                        break;
                    case 4:
                        Design.newLine();
                        //function that lists amount of delux washes bought
                        break;
                    case 5:
                        Design.newLine();
                        //function that lists bought washes by specific wash card
                        break;
                    case 6:
                        Design.newLine();
                        outputText(Design.exitToMainMenuMsg());
                        userContinue = false;
                        Design.newLine();
                        mainMenu();
                        break;
                    default:
                        outputText(Design.defaultMenuMsg());
                        washCardMenu();
                        break;
                }
            }
            catch (InputMismatchException e) {
                Design.newLine();
                Design.inputMismatchExceptionMsg();
                Design.newLine();
                in.next();
            }
        }
    }
    private static void adminMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("*****Admin Menu*****");
        outputText("1. Delete existing Wash Card");
        outputText("2. Show amount of bought Econ washes");
        outputText("3. Show amount of bought Standard washes");
        outputText("4. Show amount of bought De-Luxe washes");
        outputText("5. List bought washes by specific Wash Card");
        outputText("6. Exit to main menu");
        outputText(Design.menuBars());
    }
    private static void outputText(String text) {
        System.out.println(text);
    }
}
