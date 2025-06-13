//8. 🛒 Encapsulated Product with Discount Logic
//Create a Product class with private fields: name, price, discount.
//Add validation: if discount is over 50%, reject it.
//Add method getFinalPrice() that calculates discounted price.
//Use this in main() to show the real cost.

package JavaEncapsulations.Exercise7;
import java.util.Scanner;
public class Exercise37 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Product p1 = new Product("wheat",1000,49);

        p1.getFinalPrice();

    }
}
