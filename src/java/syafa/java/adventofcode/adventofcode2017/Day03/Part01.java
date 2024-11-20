package syafa.java.adventofcode.adventofcode2017.Day03;
import java.util.*;

public class Part01
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        /*
         * 37  36  35  34  33  32  31
         * 38  17  16  15  14  13  30
         * 39  18   5   4   3  12  29
         * 40  19   6   1   2  11  28
         * 41  20   7   8   9  10  27
         * 42  21  22  23  24  25  26
         * 43  45  46  47  48  49  50
         */
        Scanner input = new Scanner(System.in);
        int numberRequest = Integer.parseInt(input.nextLine());
        input.close();
        int step = 0;
        int currentNumber = numberRequest;
        int ring = (int) Math.ceil(Math.sqrt(numberRequest));
        if (ring % 2 == 0)
        {
            ring++;
        }
        System.out.println(ring);
        while (currentNumber != 1)
        {
            currentNumber--;
            step++;
        }
    }
}