package syafa.java.codeinclass;
import java.util.*;
import java.util.stream.*;

public class Array1DSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}