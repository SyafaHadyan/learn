package syafa.java.codeinclass.javaconstructor;
import java.util.*;

public class Rectangle
{
    static Scanner input = new Scanner(System.in);
    double width;
    double height;
    public Rectangle()
    {
        //
    }
    public double getArea(double input)
    {
        return this.width * this.height;
    }
}