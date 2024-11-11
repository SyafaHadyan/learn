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
        System.out.print(getArea(this.width,this.height));
    }
    public BigDecimal getArea(BigDecimal inputWidth,BigDecimal inputHeight)
    {
        return this.width.multiply(this.height);
    }
}