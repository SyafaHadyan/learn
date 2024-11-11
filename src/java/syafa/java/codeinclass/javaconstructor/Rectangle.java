package syafa.java.codeinclass.javaconstructor;
import java.util.*;

public class Rectangle
{
    double width;
    double height;
    public Rectangle()
    {
        //
    }
    public double getArea()
    {
        return this.width * this.height;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.close();
    }
}