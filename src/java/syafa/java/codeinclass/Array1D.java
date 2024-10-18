package syafa.java.codeinclass;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;

public class Array1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        input.close();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            array[i] = i;
        }
    }
}