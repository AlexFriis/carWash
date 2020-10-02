package src.carWash;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner in = new Scanner(System.in);

    public static void firstMenu() {
        firstMenuOptions();
        try {
            switch(in.nextInt()) {
                case 1:
                    Design.newLine();
                    //Time and date function
                    //print current time and date
                    //go to next menu
                case 2:
                    Design.newLine();
                    //User Specified time and date function
                    //specify time
                    //go to next menu
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
        }
        Design.newLine();
    }
    private static void firstMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("Import time & date from computer");
        outputText("Specify time & date");
        outputText("Exit program");
        outputText(Design.menuBars());
    }
    public static void secondMenu() {
        secondMenuOptions();
        try {
            switch(in.nextInt()) {
                case 1:
                    Design.newLine();
                    //
                case 2:
                    Design.newLine();
                    //User Specified time and date function
                    //specify time
                    //go to next menu
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
        }
        Design.newLine();
    }
    private static void secondMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("Use existing Wash Card by providing ID");
        outputText("Buy a new Wash Card and print ID");
        outputText("Exit program");
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
        }
        Design.newLine();
    }
    private static void mainMenuOptions() {
        outputText(Design.headline());
        outputText(Design.menuBars());
        outputText("Wash your car");
        outputText("Manage Wash Card");
        outputText("Admin Menu");
        outputText("Exit program");
        outputText(Design.menuBars());
    }
    public static void washCardMenu() {
        //listoptions
        //while loop in this
    }
    private static void washCardMenuOptions() {
    }
    public static void washMenu() {
        //listoptions
        //while loop in this
    }
    private static void washMenuOptions() {
    }
    public static void adminMenu() {
        //listoptions
        //while loop in this
    }
    private static void adminMenuOptions() {
    }
    private static void outputText(String text) {
        System.out.println(text);
    }
}
