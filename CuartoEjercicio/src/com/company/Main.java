package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int number, result;

        System.out.println("Input number: ");
        number = inputData.nextInt();

        result = number * -1;
        System.out.println("the result is the following: " + result);
    }
}
