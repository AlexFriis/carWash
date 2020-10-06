package src.carWash;

//Console Writer

public class CW {
    public static void newLine() {
        System.out.println();
    }

    /**
     * Prints a menu with any amount of menu options.
     * @param menuNameString name of the menu as *****Menu name*****.
     * @param menuOptions Variable length argument for options, self-numbered.
     * <p>
     * Example:
     * <p>
     * {@code Design.printMenu("Wash Menu", "Economy Wash", "Standard Wash", "De Luxe Wash", "Exit to main menu");}
     */
    public static void printMenu(String menuNameString, String ... menuOptions){
        System.out.println(headline());
        newLine();
        System.out.println("*" + menuNameString + "*");
        newLine();
        if (menuOptions.length > 0) {
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println(i+1 + ". " + menuOptions[i]);
            }
        }
        System.out.println(menuBars());
    }

    public static String bars() {
        return ("\n---------------------------------------------------------------\n");
    }

    public static String menuBars() {
        return ("\n---------------------------------------------------------------\n");
    }

    public static String headline() {
        return ("----------------------SuperShine Car Wash----------------------");
    }

    public static String exitSystemMsg() {
        return ("Exiting system, have a shine-tastic day!");
    }

    public static final String defaultMenuMsg = "Input format is not valid!";
    public static String defaultMenuMsg() {
        return ("Input format is not valid!");
    }
    public static String noWashCardsRegisteredMsg() { return "System has no WashCards registered! Returning to menu"; }
    public static String noWashCardsEqualToInputMsg(int id) { return "No WashCard registered to " + id; }
    public static String exitToMainMenuMsg() {
        return ("Exiting to main menu!");
    }

    public static String inputMismatchExceptionMsg() {
        return ("Please enter the right input format!");
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
