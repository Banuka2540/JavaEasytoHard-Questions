package JavaEncapsulations.Exercise6;

public class door {
    private String islocked;
    final private int lockedpassword = 12345678;
    private int password;

    void setPassword(int password) {
        this.password = password;
        if(password == lockedpassword){
            islocked = "opened";

        }else{
            islocked = "closed";

        }
    }

    void unlocked(){
        System.out.println("locked status : " + islocked);

    }
}
