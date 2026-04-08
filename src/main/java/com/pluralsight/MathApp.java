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

        System.out.println("Area of the circle is: " + area);
    }
}
