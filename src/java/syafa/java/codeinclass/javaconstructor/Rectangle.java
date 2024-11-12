package syafa.java.codeinclass.javaconstructor;
import java.math.*;

public class Rectangle
{
    private BigDecimal width;
    private BigDecimal height;
    public Rectangle(BigDecimal inputWidth,BigDecimal inputHeight)
    {
        this.width = inputWidth;
        this.height = inputHeight;
    }
    public BigDecimal[] GetRectalngleProperty()
    {
        return new BigDecimal[]{this.width,this.height};
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