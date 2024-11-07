package syafa.java.hackerrank.latsolpemdastif24;
import java.util.Scanner;

public class RerataArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] data = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            data[i] = input.nextInt();
        }
        System.out.printf("%.3f",hitungRerata(data));
        input.close();
    }
  
  	public static double hitungRerata(int[] arr)
    {
        double result = 0d;
        for (int i = 0; i < arr.length; i++)
        {
            result += arr[i];
        }
    	return result / arr.length;
    }
}