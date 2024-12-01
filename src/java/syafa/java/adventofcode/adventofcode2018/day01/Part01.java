package syafa.java.adventofcode.adventofcode2018.day01;
import java.util.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long frequency = 0l;
        while (input.hasNextLine())
        {
            frequency += Long.parseLong(input.nextLine().replace("+",""));
        }
        input.close();
        System.out.println(frequency);
    }
}