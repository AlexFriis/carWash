package src.carWash;

public class Design {
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
        System.out.println(menuBars());
        System.out.println("*****" + menuNameString + "*****");
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

    public static void exitToMainMenuMsg() {
        this.outputText("Exiting to main menu!");
    }

    public static void inputMismatchExceptionMsg() {
        System.out.println("Please enter the right input format!");
    }

    public static void outputText(String text) {
        System.out.println(text);
    }
}
