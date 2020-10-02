package src.carWash;

public class Design {
    public static void newLine() {
        System.out.println();
    }
    public static String bars() { return ("\n---------------------------------------------------------------\n"); }
    public static String menuBars() { return ("\n---------------------------------------------------------------\n"); }
    public static String headline() { return ("----------------------SuperShine Car Wash----------------------"); }
    public static String exitSystemMsg() { return ("Exiting system, have a shine-tastic day!"); }
    public static String defaultMenuMsg() { return ("Input format is not valid!"); }
    public static void inputMismatchExceptionMsg() {
        System.out.println("Please enter the right input format!");
    }
}
