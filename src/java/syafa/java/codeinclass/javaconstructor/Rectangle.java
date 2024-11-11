package syafa.java.codeinclass.javaconstructor;

public class Rectangle
{
    double width;
    double height;
    public Rectangle(double inputWidth,double inputHeight)
    {
        this.width = inputWidth;
        this.height = inputHeight;
        System.out.print(getArea(this.width,this.height));
    }
    public double getArea(double inputWidth,double inputHeight)
    {
        return this.width * this.height;
    }
}