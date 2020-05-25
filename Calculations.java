package Main;

import java.util.Scanner;

public class Calculations {
    public static Scanner input = new Scanner(System.in);
    private static int Integer1, Integer2;
    private static char Operator;

    public static void setInteger1() {
        System.out.print("Enter the first Integer: ");
        Integer1 = input.nextInt();
    } public static int getInteger1() {
        return Integer1;
    }

    public static void setOperator() {
        System.out.print("\nEnter the operator: ");
        Operator = input.next().charAt(0);
        input.nextLine();
    } public static char getOperator() {
        return Operator;
    }

    public static void setInteger2() {
        System.out.print("\nEnter the second Integer: ");
        Integer2 = input.nextInt();
    } public static int getInteger2() {
        return Integer2;
    }




}