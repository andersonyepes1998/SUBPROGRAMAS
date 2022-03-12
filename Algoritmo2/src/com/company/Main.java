package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        int hourNumber, BasicSalary, amountOfYear, stupidSalary, bonusValue, valueOfDeductions, NetSalary;

        System.out.println("input Dijite el numero de horas trabajadas: ");
        hourNumber = inputData.nextInt();

        System.out.println("input Dijite el salary basico de horas: ");
        BasicSalary = inputData.nextInt();

        System.out.println("input Dijite la cantidad de years old trabajados: ");
        amountOfYear = inputData.nextInt();

        System.out.println("input Dijite el valor que le deducen mensualmente: ");
        valueOfDeductions = inputData.nextInt();

        bonusValue = 30000 * amountOfYear;
        stupidSalary = hourNumber * BasicSalary;
        NetSalary = stupidSalary - valueOfDeductions + bonusValue;

        System.out.println("el salario neto seria:" +  NetSalary );
    }
}
