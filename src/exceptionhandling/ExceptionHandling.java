package exceptionhandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the two nums");


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            double result = (num1) / (num2);
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("You cannot divide a number by zero fool");
        }
        System.out.println("ha ha");

    }
}
