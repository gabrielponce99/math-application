package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Step 1
        //Question #1
        //Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine which salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is …")
        double bobSalary = 4500.50;
        double garySalary = 5000.10;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("And the highest salary is: " + highestSalary);
        System.out.println(""); //This is a space I'm creating between prints



        //Question #2
        //Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        double carPrice = 25000.55;
        double truckPrice = 70000.67;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is: " + lowestPrice);
        System.out.println(""); //This is a space I'm creating between prints



        //Question #3
        //Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * (radius * radius); // This is the diameter formula: d = 2r
        System.out.println("The area of the circle is: " + area);
        System.out.println(""); //This is a space I'm creating between prints



        //Question #4
        //Find and display the square root of a variable after it is set to 5.0
        double square = 5.0;
        double squareRoot = Math.sqrt(square);
        System.out.println("The square root of " + square + " is: " + squareRoot);
        System.out.println(""); //This is a space I'm creating between prints



        //Question #5
        //Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distanceX = x2 - x1;
        double distanceY = y2 - y1;

        System.out.println("The distance between (5, 10) and (85, 50) is: (" + distanceX + ", " + " " + distanceY + ")");
        System.out.println(""); //This is a space I'm creating between prints



        //Question #6
        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        double findAbsoluteValue = -3.8;

        double absoluteValue = Math.abs(findAbsoluteValue);
        System.out.println("The absolute value is: " + absoluteValue);
        System.out.println(""); //This is a space I'm creating between prints



        //Question #7
        //Find and display a random number between 0 and 1
        System.out.println("The random number is: " + Math.random());
        System.out.println(""); //This is a space I'm creating between prints



        //Question #8
        //Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?
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
