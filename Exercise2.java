//Write a program to swap the values of two variables using a third variable.

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        int a ;
        int b ;
        int temp;

        System.out.print("Enter first number : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        System.out.print("Enter second number : ");
        b = input.nextInt();

        //swapping the numbers
        temp = a ;
        a = b ;
        b = temp ;

        System.out.println("swapped numbers : " );
        System.out.println(" number 1  : " + a);
        System.out.println(" number 2  : " + b );


    }
}
