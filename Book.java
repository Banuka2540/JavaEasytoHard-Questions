package JavaEncapsulations.Exercise8;

public class Book {
    private String title ;
    private String author ;
    private int availableCopies;
    private int newAvaliableCopies;
    private int finalCopies;


    Book(String title, String author, int availableCopies) {
        this.title = title ;
        this.author = author ;
        this.availableCopies = availableCopies;
    }
    void returnBooks(int y){
        newAvaliableCopies = availableCopies + y;
        System.out.println("total book copies : " + newAvaliableCopies);

    }
    void borrowBooks(int x ){
        if (x > newAvaliableCopies){
            System.out.println("dosent have that much copies");
        }else{
            finalCopies = newAvaliableCopies - x;
            System.out.println(finalCopies);
        }

    }
    void bookStatus(){
        System.out.println("Book status : " +finalCopies);
    }
}
