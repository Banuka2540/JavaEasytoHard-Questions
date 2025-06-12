package JavaEncapsulations.Exercise2;

public class person {
    private String name;
    private int age ;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void getName(){
        System.out.println("your name is : " + name);
    }

    void getAge(){
        System.out.println( "your age is : " + age);    }
}
