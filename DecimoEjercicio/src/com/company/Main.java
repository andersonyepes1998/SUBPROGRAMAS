package com.company;
import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        float FirstSide, SecondSide, ThirdSide, semiperimeter, perimeter, area, height;

        System.out.println("input First Side: ");
        FirstSide = inputData.nextFloat();

        System.out.println("input Second Side: ");
        SecondSide = inputData.nextFloat();

        System.out.println("input Third Side: ");
        ThirdSide = inputData.nextFloat();

        System.out.println("input height: ");
        height = inputData.nextFloat();

        semiperimeter = (FirstSide +  SecondSide + ThirdSide) / 2;
        perimeter = FirstSide +  SecondSide + ThirdSide;
        area = (ThirdSide * height) / 2;

        System.out.println("the perimeter is the: "+ perimeter);
        System.out.println("the semiperimeter is the: "+ semiperimeter);
        System.out.println("the area is the: "+ area);
    }
}
