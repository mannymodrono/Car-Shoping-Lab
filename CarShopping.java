import java.util.Scanner;

public class CarShopping {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += trans();
        totalCost += automaticWindows();
        totalCost += keylessEntry();
        totalCost += onStar();
        totalCost += ABS();
        totalCost += adjustablesPedals();
        totalCost += sunroof();
        totalCost += coldWeatherPackage();
        totalCost += GPS();
        totalCost += sportsPackage();
        // add more methods and print total cost
        System.out.println("Customer's total is:");
        System.out.println("$" + totalCost);
    }

    public static int base() {
        System.out.println("Our inventory:\nModel 1 - $15,000\nModel 2 - $24,000\nModel 3 - $40,000\nWhich base model did the customer choose? (Enter full model name)");
        String model = in.nextLine();
        //return output based on user input

        switch (model){
            case "Model 1":
                return 15000;
            case "Model 2":
                return 24000;
            case "Model 3":
                return 40000;
            default:
                return 0;
        }

    }

    public static int automaticWindows() {
        System.out.println("Automatic Windows for $500? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 500;
            default:
                return 0;
        }

    }

    public static int keylessEntry() {
        System.out.println("Remote keyless entry for $1000? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 1000;
            default:
                return 0;
        }

    }

    public static int onStar() {
        System.out.println("OnStar system for $1000? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 1000;
            default:
                return 0;
        }

    }


    public static int ABS() {
        System.out.println("ABS for $500? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 500;
            default:
                return 0;
        }

    }


    public static int adjustablesPedals() {
        System.out.println("Telescoping steering wheel/adjustable pedals for $1000? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 1000;
            default:
                return 0;
        }

    }


    public static int sunroof() {
        System.out.println("Sunroof for $800? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 800;
            default:
                return 0;
        }

    }


    public static int coldWeatherPackage() {
        System.out.println("Cold weather package for $1500? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 1500;
            default:
                return 0;
        }

    }


    public static int GPS() {
        System.out.println("GPS for $750? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 750;
            default:
                return 0;
        }

    }

    public static int sportsPackage(){
        System.out.println("Sports package for $1500? (y/n)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "y":
                return 1500;
            default:
                return 0;
        }
    }

    public static int trans() {
        System.out.println("Manual($0) or automatic($1000) (m/a)");
        //return output based on user input
        String response = in.nextLine();

        switch(response) {
            case "a":
                return 1000;
            default:
                return 0;
        }
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