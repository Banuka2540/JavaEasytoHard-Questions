//3. ✅ Encapsulate a Rectangle
//Create a Rectangle class with private fields: length and width.
//Add setters and getters.
//Add a method calculateArea() that returns the area.
//Use the class in main() to print the area of a rectangle.

package JavaEncapsulations.Exercise3;
import java.util.Scanner;
public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r1 = new Rectangle();

        System.out.print("Enter a Length : ");
        r1.setLenght(input.nextDouble());

        System.out.print("Enter a Width : ");
        r1.setWidth(input.nextDouble());

        r1.calculateArea(r1.getLenght(),r1.getWidth());
    }
}

