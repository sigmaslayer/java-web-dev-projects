package org.launchcode;
import java.util.Scanner;

public class NumType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the width:");
        double width = input.nextDouble();
        System.out.println("Please enter the length:");
        double length = input.nextDouble();

        double area = width * length;

        System.out.println("The area with a width of " + width + " and a length of " + length + " = " + area);
        input.close();
    }
}
