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
        System.out.print(getArea() + "\n" + getPerimeter());
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