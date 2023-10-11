package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use:");
        double gasUse = input.nextDouble();
        double milesPerGallon = miles / gasUse;

        System.out.println("Driving " + miles + " miles and using " + gasUse + " gallons of gas, means your miles per gallon is " + milesPerGallon);
        input.close();

    }
}
