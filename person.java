package JavaEncapsulations;

public class person {
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void getName(){
        System.out.println("Your name is : " + name);
    }

    void setAge(int age){
        this.age = age;
    }

    void getAge(){
        System.out.println("your age is : "+ age );
    }
}
