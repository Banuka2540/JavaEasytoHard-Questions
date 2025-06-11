//Write a program that takes a temperature in Celsius (as a double), converts it to Fahrenheit, and prints both values.
//Formula: F = (C * 9/5) + 32

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        {
            Scanner input = new Scanner(System.in);
            System.out.print("enter celcius : ");
            int celsius = input.nextInt();
            int Farenheit = (celsius * (9/5)) + 32;
            System.out.println("Farenheit : " + Farenheit);
    }

}
}
