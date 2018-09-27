package array;

import java.util.Scanner;
import java.util.Random;


public class UseArray {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int [] array = new int[4];
        System.out.println("Enter your array numbers");
        for (int i=0; i<array.length; i++){

            array[i]=random.nextInt(100);
        }

        for (int j=0; j<array.length; j++){
            System.out.print( array[j] + " ");
        }

    }
}

