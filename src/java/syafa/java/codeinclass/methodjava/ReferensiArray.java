package syafa.java.codeinclass.methodjava;
import java.util.*;
import java.util.stream.*;;

public class ReferensiArray
{
    static class arrayOperation
    {
        public static int sumArray(int[] array)
        {
            return IntStream.of(array).sum();
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        System.out.println("The sum is" + " " + arrayOperation.sumArray(array));
        input.close();
    }
}