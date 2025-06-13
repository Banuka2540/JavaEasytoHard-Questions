package JavaEncapsulations.Exercise5;

public class Student {
    private String name;
    private int id ;
    private double grade;

    public Student(String name , int id , double grade){
        this.name  = name ;
        this.id = id;
        this.grade = grade;
    }

    String getName(){return name;}
    int getId(){return id;}
    double getGrade(){return grade;}
}
