package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CatsAndAMouse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int queries = Integer.parseInt(input.nextLine());
        ArrayList<String> result = new ArrayList<String>();
        /*
         * Cat A Cat B Mouse C
         * 
         * 2
         * 1 2 3
         * 1 3 2
         * 
         * Output:
         * 
         * Cat B
         * Mouse C
         */
        for (int i = 0; i < queries; i++)
        {
            String[] position = input.nextLine().split(" ");
            if ((Integer.parseInt(position[2]) - Integer.parseInt(position[0])) == (Integer.parseInt(position[2]) - Integer.parseInt(position[1])))
            {
                result.add("Mouse C");
                continue;
            }
            else if ((Integer.parseInt(position[2]) - Integer.parseInt(position[0])) < (Integer.parseInt(position[2]) - Integer.parseInt(position[1])))
            {
                result.add("Cat A")
                continue;
            }
        }
        input.close();
    }
}