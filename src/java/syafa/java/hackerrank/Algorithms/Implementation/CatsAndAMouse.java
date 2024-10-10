package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CatsAndAMouse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int queries = Integer.parseInt(input.nextLine());
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < queries; i++)
        {
            String[] position = input.nextLine().split(" ");
            if (Math.abs((Integer.parseInt(position[2]) - Integer.parseInt(position[0]))) == (Math.abs(Integer.parseInt(position[2]) - Integer.parseInt(position[1]))))
            {
                result.add("Mouse C");
            }
            else if (Math.abs((Integer.parseInt(position[2]) - Integer.parseInt(position[0]))) < (Math.abs(Integer.parseInt(position[2]) - Integer.parseInt(position[1]))))
            {
                result.add("Cat A");
            }
            else if (Math.abs((Integer.parseInt(position[2]) - Integer.parseInt(position[0]))) > (Math.abs(Integer.parseInt(position[2]) - Integer.parseInt(position[1]))))
            {
                result.add("Cat B");
            }
            if (i == queries - 1)
            {
                for (int j = 0; j < result.size(); j++)
                {
                    System.out.print(result.get(j));
                    if (j != result.size() - 1)
                    {
                        System.out.print("\n");
                    }
                }
            }
        }
        input.close();
    }
}