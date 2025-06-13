//Create a Door class with private field isLocked and private field password.
//Add method unlock(String password) that unlocks only if the password is correct.
//Add method isDoorLocked() to check the door status.

package JavaEncapsulations.Exercise6;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        door d1 = new door();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the password : ");
        d1.setPassword(input.nextInt());
        d1.unlocked();
    }




}
