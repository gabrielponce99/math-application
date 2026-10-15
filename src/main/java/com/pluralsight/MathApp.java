package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Step 1
        //Question #1
        double bobSalary = 4500.50;
        double garySalary = 5000.10;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("And the highest salary is: " + highestSalary);
        System.out.println(""); //This is a space I'm creating between prints

        //Question #2
        double carPrice = 25000.55;
        double truckPrice = 70000.67;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is: " + lowestPrice);
        System.out.println("");

        //Question #3
        double radius = 7.25;
        double area = Math.PI * (radius * radius); // This is the diameter formula: d = 2r
        System.out.println("The area of the circle is: " + area);
        System.out.println("");

        //Question #4
        double square = 5.0;
        double squareRoot = Math.sqrt(square);
        System.out.println("The square root of " + square + " is: " + squareRoot);
        System.out.println("");

        //Question #5
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distanceX = x2 - x1;
        double distanceY = y2 - y1;

        System.out.println("The distance between (5, 10) and (85, 50) is: (" + distanceX + ", " + " " + distanceY + ")");
        System.out.println("");

        //Question #6
        double findAbsoluteValue = -3.8;

        double absoluteValue = Math.abs(findAbsoluteValue);
        System.out.println("The absolute value is: " + absoluteValue);
        System.out.println("");

        //Question #7
        System.out.println("The random number is: " + Math.random());
        System.out.println("");

        //Question #8
        int minutes = 60;
        int hours = 24;
        int days = 24;
        int milliseconds = 1000;
        int daysToMinutes = (minutes * hours) * days;
        int daysToMilliseconds = milliseconds * daysToMinutes;
        System.out.println("There are " + daysToMinutes + " minutes in " + days + " days.");
        System.out.println("There are " + daysToMilliseconds + " milliseconds in " + days + " days.");






    }
}
