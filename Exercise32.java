//2. ✅ Add Validation in Setter
//      Modify the setAge() method so that it only allows ages between 0 and 120.
//    If the value is invalid, print "Invalid age" and don’t change the age.



package JavaEncapsulations.Exercise2;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise32 {
    public static void main(String[] args){
        person p1 = new person();
        Scanner input = new Scanner(System.in);

        System.out.print("enter you name : ");
        p1.setName(input.next());

        System.out.print("enter you Age : ");
        p1.setAge(input.nextInt());

        p1.getName();
        p1.getAge();


    }
}
