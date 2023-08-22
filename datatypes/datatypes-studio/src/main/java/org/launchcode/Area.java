package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        double area;
        Scanner userInput;

        userInput = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = userInput.nextDouble();
        area = org.launchcode.Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
