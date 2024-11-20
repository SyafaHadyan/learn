package syafa.java.adventofcode.adventofcode2017.Day03;
import java.util.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberRequest = Integer.parseInt(input.nextLine());
        input.close();
        int step = 0;
        int currentNumber = numberRequest;
        int ring = (int) Math.ceil(Math.sqrt(numberRequest));
        System.out.println(ring);
        while (currentNumber != 1)
        {
            currentNumber--;
            step++;
        }
    }
}