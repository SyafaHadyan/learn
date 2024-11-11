package syafa.java.codeinclass.javaconstructor;
import java.util.*;
import java.util.stream.*;

public class GetRectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-23s%-2s","Enter width and height",':');
        double[] inputData = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        Rectangle inputRectangleData = new Rectangle(inputData[0],inputData[1]);
        input.close();
    }
}