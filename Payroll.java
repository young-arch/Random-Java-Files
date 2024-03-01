`import java.util.*;

public class Payroll {
    final int EMPLOYEE_NUM = 7;
    private double[] wages = new double[EMPLOYEE_NUM];

    private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7584088 };
    private int[] hours = new int[EMPLOYEE_NUM];
    private double[] payRate = new double[EMPLOYEE_NUM];

    Scanner input = new Scanner(System.in);

    public void PayRoll(int[] array) {

        for (int index = 0; index < EMPLOYEE_NUM; index++) {
            array[index] = employeeId[index];
        }

    }

    public void setPayrate(double[] payRate) {

        for (int index = 0; index < EMPLOYEE_NUM; index++) {
            System.out.print("Employee " + (index + 1) + ": ");
            payRate[index] = input.nextDouble();
        }
    }

    public void setHours(int[] hours) {
        for (int index = 0; index < EMPLOYEE_NUM; index++) {
            System.out.print("Employee " + (index + 1) + ": ");
            hours[index] = input.nextInt();
        }
    }

    public double[] setWages(double[] wages) {
        for (int index = 0; index < EMPLOYEE_NUM; index++) {
            System.out.print("Employee " + (index + 1) + ": ");
            wages[index] = hours[index] * payRate[index];

        }
        return wages;
    }

    public void returnEmployeeID(int[] array) {
        for (int index = 0; index < EMPLOYEE_NUM; index++) {
            System.out.print(array[index] + " ");
        }
    }

}
