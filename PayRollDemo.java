import java.util.*;

public class PayRollDemo {
    public static void main(String[] args) {
        final int VALID = 7;
        int[] workersID = new int[VALID];
        int[] workHours = new int[VALID];
        double[] workPay = new double[VALID];
        double[] wages = new double[VALID];

        Payroll ourPay = new Payroll();

        System.out.println("The employee id's are: ");
        ourPay.PayRoll(workersID);
        ourPay.returnEmployeeID(workersID);

        System.out.println(" ");

        System.out.println("Enter the number of hours worked by each employee: ");
        ourPay.setHours(workHours);

        System.out.println("Enter the payrate of each employee: ");
        ourPay.setPayrate(workPay);

        System.out.println("The wages of the employees calculated ");
        ourPay.setWages(wages);

        System.out.println("Enter the each employee's ID to showcase his grosspay: ");
        twoDimen(wages);

    }

    public static void twoDimen(double[] payRate) {
        Scanner input = new Scanner(System.in);
        int showID;

        for (int index = 0; index < 7; index++) {
            System.out.println("Enter the ID of the worker: ");
            showID = input.nextInt();

            if (showID == 5658845) {
                System.out.println("Gross Wages: " + payRate[0]);
            } else if (showID == 4520125) {
                System.out.println("Gross Wages: " + payRate[1]);

            } else if (showID == 7895122) {
                System.out.println("Gross Wages: " + payRate[2]);
            } else if (showID == 8777541) {
                System.out.println("Gross Wages: " + payRate[3]);
            } else if (showID == 8451277) {
                System.out.println("Gross Wages: " + payRate[4]);
            } else if (showID == 1302850) {
                System.out.println("Gross Wages: " + payRate[5]);
            } else if (showID == 7584088) {
                System.out.println("Gross Wages: " + payRate[6]);
            } else {
                System.out.println("This is a wrong ID ");
            }

            // 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7584088
        }

    }

}
