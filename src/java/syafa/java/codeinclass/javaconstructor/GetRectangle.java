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
        Rectangle inputRectangleData = new Rectangle(inputWidth,inputHeight);
        input.close();
    }
}