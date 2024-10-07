package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class NumberLineJumps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> positionJump = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        if ((Integer.parseInt(positionJump.get(1)) == Integer.parseInt(positionJump.get(3))) && (Integer.parseInt(positionJump.get(0)) == Integer.parseInt(positionJump.get(2))))
        {
            System.out.print("NO");
            return;
        }
        for (int i = 0; i < positionJump.size(); i++)
        {
            //
        }
    }
}