package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // determine who has the highest salary
        int bobSalary = 55000;
        int garySalary = 63000;
        int highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: $" + highestSalary);



        // determine lowest price of car vs truck
        int carPrice = 35000;
        int truckPrice = 42000;
        int lowestPrice;

        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: $" + lowestPrice);


        //find display area of circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);


        // find and display the square root of a variable after it is set to 5.0
        double initialNum = 5.0;
        double squareRoot = Math.pow(initialNum, 2);

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
    }
}
