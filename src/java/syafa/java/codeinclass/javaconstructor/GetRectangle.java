package syafa.java.codeinclass.javaconstructor;
import java.util.*;
import java.math.*;

public class GetRectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-23s%-2s","Enter width and height",':');
        BigDecimal inputWidth = input.nextBigDecimal();
        BigDecimal inputHeight = input.nextBigDecimal();
        input.close();
        Rectangle inputRectangleData = new Rectangle(inputWidth,inputHeight);
        System.out.println("Rectangle data" + "\n" + Arrays.toString(inputRectangleData.GetRectalngleProperty()));
        System.out.printf("%-12s%-2c%.3f\n%-17s%-2c%.3f","The area is",':',inputRectangleData.getArea(),"The perimeter is",':',inputRectangleData.getPerimeter());
    }
}