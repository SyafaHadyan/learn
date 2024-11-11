package syafa.java.codeinclass.javaconstructor;
import java.math.*;

public class Rectangle
{
    BigDecimal width;
    BigDecimal height;
    public Rectangle(BigDecimal inputWidth,BigDecimal inputHeight)
    {
        this.width = inputWidth;
        this.height = inputHeight;
        System.out.printf("%-12s%-2c%.3f\n%-17s%-2c%.3f","The area is",':',getArea(),"The perimeter is",':',getPerimeter());
    }
    public BigDecimal getArea()
    {
        return this.width.multiply(this.height);
    }
    public BigDecimal getPerimeter()
    {
        return (this.width.add(this.height)).multiply(BigDecimal.TWO);
    }
}