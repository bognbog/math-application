package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // determine who has the highest salary
        double bobSalary = 55000;
        double garySalary = 63000;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: $" + highestSalary);



        // determine lowest price of car vs truck
        double carPrice = 35000;
        double truckPrice = 42000;
        double lowestPrice;

        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: $" + lowestPrice);


        //find display area of circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);


        // find and display the square root of a variable after it is set to 5.0
        double initialNum = 5.0;
        double squareRoot = Math.sqrt(initialNum);

        System.out.println("The square root is: " + squareRoot);


        // find and display the distance between the points
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double pointDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance is: " + pointDistance);


        //find and display the absolute value of a variable
        double negativeNum = -3.8;
        double absoluteValue = Math.abs(negativeNum);

        System.out.println("This is the absolute number: " + absoluteValue);


        //display random number
        double randomNumber = Math.random();

        System.out.println("Random number: " + randomNumber);


        //Calculate how many minutes in days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int totalHours = days * hoursPerDay;
        int totalMinutes = totalHours * minutesPerHour;

        System.out.println("Total minutes in 24 days: " + totalMinutes);

    }
}
