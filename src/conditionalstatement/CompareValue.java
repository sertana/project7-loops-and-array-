package conditionalstatement;
import java.util.Scanner;

public class CompareValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers:");


        int num1 = sc.nextInt(), num2 = sc.nextInt();
        int diff;
        if (num1 > num2) {
            diff = num1-num2;
            System.out.println("Num1 is greater than Num2 by" + diff );

        } else {
            diff= num1 - num2;
            System.out.println("Num2 is greater than Num1 by" + -(diff));

        }
    }
}