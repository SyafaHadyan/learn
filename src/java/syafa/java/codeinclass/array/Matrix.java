package syafa.java.codeinclass.array;
import java.util.*;
import java.util.stream.*;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-55s%-2c","Input matrix size [Row Column] (Separate by space)",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}