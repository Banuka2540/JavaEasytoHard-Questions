package JavaEncapsulations.Exercise3;

public class Rectangle {
    private double lenght ;
    private double Width;

    void setLenght(double lenght){
        this.lenght = lenght ;
    }

    void setWidth(double Width){
        this.Width = Width;
    }

    double getLenght(){
        return lenght ;
    }

    double getWidth(){
        return Width;
    }

    void calculateArea(double lenght , double width ){
        double Area = lenght * Width;
        System.out.println("Area is : " + Area );
    }
}
