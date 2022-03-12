package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        int numwheels, result, price;

        System.out.println(" number the wheels: ");
        numwheels = inputData.nextInt();

        if (numwheels < 5) {
           result = numwheels * 30000;
            price = 30000;
        } else {
            if (numwheels >= 5 && numwheels <= 10) {
                result = numwheels * 25000;
                price = 25000;
            } else {
                result = numwheels * 20000;
               price = 20000;
            }
        }
        //resultado
        System.out.println("the result is: " + result + " and the unit price is " + price);
    }
}
