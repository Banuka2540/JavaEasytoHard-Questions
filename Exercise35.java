//Make a class Student with private fields id, name, and grade.
//Add a constructor that sets all values.
//Use getters to print the values from main().


package JavaEncapsulations.Exercise5;

public class Exercise35 {

    public static void main(String[] args){
        Student st = new Student("yuthila",21,75);
        System.out.println(st.getGrade());
        System.out.println(st.getId());
        System.out.println(st.getName());
    }
}
