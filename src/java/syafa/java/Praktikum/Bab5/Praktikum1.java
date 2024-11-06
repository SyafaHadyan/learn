package syafa.java.Praktikum.Bab5;
import java.util.*;

public class Praktikum1
{
    public static String checkPrime(int number)
    {
        return "Prima";
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.printf("%d%s",number,"a");
        input.close();
    }
}