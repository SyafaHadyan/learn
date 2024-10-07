package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class NumberLineJumps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> positionJump = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int currentMatchPosition = 0;
        int object0 = Integer.parseInt(positionJump.get(0));
        int object1 = Integer.parseInt(positionJump.get(2));
        if ((Integer.parseInt(positionJump.get(1)) == Integer.parseInt(positionJump.get(3))) && (Integer.parseInt(positionJump.get(0)) == Integer.parseInt(positionJump.get(2))))
        {
            System.out.print("NO");
            return;
        }
        for (int i = 0; i < 10; i++)
        {
            object0 += Integer.parseInt(positionJump.get(1));
            object1 += Integer.parseInt(positionJump.get(3));
            System.out.println(object0 + " " + object1);
        }
    }
}