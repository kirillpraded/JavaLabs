package by.praded;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kiryl Praded
 * 01.10.2020
 */
public class MainController {

    private static final double CM_TO_M_COEFFICIENT = 0.01;

    private static final double CM_TO_KM_COEFFICIENT = 0.00001;

    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String... args) {
        loop:
        while (true) {
            System.out.println("1. Convert cm to meters and kilometers" +
                    "\n2. Replace variables." +
                    "\n'e' to exit");
            String choice = SCANNER.nextLine();
            switch (choice){
                case "1":
                    try {
                        convert(enterLength());
                    } catch (InputMismatchException e){
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    changeVariables(enterFirstVariable(), enterSecondVariable());
                    break;
                case "e":
                    SCANNER.close();
                    break loop;
            }
        }
    }

    public static double enterFirstVariable(){
        System.out.println("Enter a");
        return SCANNER.nextDouble();
    }

    public static double enterSecondVariable(){
        System.out.println("Enter b");
        return SCANNER.nextDouble();

    }

    public static long enterLength(){
        System.out.println("Enter length");
        return SCANNER.nextLong();
    }


    public static void changeVariables(double a, double b) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Changing variables...");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void convert(long cm) {
        if(cm <= 0){
            throw new InputMismatchException("Length should be more than 0");
        }
        double m = cm * CM_TO_M_COEFFICIENT;
        double km = cm * CM_TO_KM_COEFFICIENT;
        System.out.println("cm -> meters : " + cm + " cm -> " + m + " m");
        System.out.println("meters -> kilometer : " + m + " m -> " + km + " km");
    }

}
