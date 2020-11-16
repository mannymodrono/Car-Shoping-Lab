import java.util.Scanner;

public class CarShopping {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        // add more methods and print total cost
    }

    public static int base() {
        System.out.println("Our inventory:\nModel 1 - $15,000\nModel 2 - $24,000\nModel 3 - $40,000\nWhich base model did the customer choose? (Enter full model name)");
        String model = in.nextLine();
        //return output based on user input

    }

    public static int automaticWindows() {
        System.out.println("Automatic Windows for $500? (y/n)");
        //return output based on user input

    }

    //Add remaining methods
    /*
    Remote keyless entry $1000
    OnStar System $1000
    Anti-lock Brakes (ABS) $500
    Telescoping steering wheel/adjustable pedals $1000
    Sunroof $800
    Cold Weather Package (Heated seats/windshield heater $1500
    GPS Navigation System $750
    You should come up with three more of your own additional features
    */
}