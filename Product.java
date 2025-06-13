package JavaEncapsulations.Exercise7;

import java.sql.SQLOutput;

public class Product {
    private String name;
    private double price ;
    private double discount = 0;
    private double newPrice;

    Product(String name , double price , double discount){
        this.name = name ;
        this.price = price ;
        this.discount = discount ;

        if(discount > 50 ){
            System.out.println("***** discount is rejected ****");
            newPrice = price ;
            discount = 0;
        }else {
            newPrice = price - (price * (discount/100));
        }

    }
    void getFinalPrice(){
        System.out.println("price os the product : " + price);
        System.out.println("your entered discount is : " + discount);
        System.out.println("your final price is : " + newPrice);
    }
}
