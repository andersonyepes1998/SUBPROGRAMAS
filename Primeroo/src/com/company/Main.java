package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        double SalaryStupid, RetentionAtSource, SalaryNet;

        SalaryStupid = 48 * 5000;
        RetentionAtSource = SalaryStupid * 0.125;
        SalaryNet = SalaryStupid - RetentionAtSource;

        System.out.println("the salary stupid is the: " + SalaryStupid);
        System.out.println("the Retention At Source is the: " + RetentionAtSource);
        System.out.println("the Salary Net is the: " + SalaryNet);
    }
}
