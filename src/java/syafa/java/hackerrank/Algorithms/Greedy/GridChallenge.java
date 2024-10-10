package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;

public class GridChallenge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int arrRow = 0;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < testCase; i++)
        {
            arrRow = Integer.parseInt(input.nextLine());
            ArrayList<String> arrayString = new ArrayList<String>();
            for (int j = 0; j < arrRow; j++)
            {
                char[] arrChar = input.nextLine().toCharArray();
                Arrays.sort(arrChar);
                StringBuilder appendString = new StringBuilder();
                for (int k = 0; k < arrChar.length; k++)
                {
                    appendString.append(arrChar[k]);
                    if (k == arrChar.length - 1)
                    {
                        arrayString.add(String.valueOf(appendString));
                    }
                }
                if (j == arrRow - 1)
                {
                    ArrayList<Character> checkOrder = new ArrayList<Character>();
                    for (int k = 0; k < arrRow; k++)
                    {
                        checkOrder.add(arrayString.get(k).charAt(0));
                        if (k == arrRow - 1)
                        {
                            Collections.sort(checkOrder);
                            for (int l = 0; l < checkOrder.size(); l++)
                            {
                                if (arrayString.get(l).charAt(0) == checkOrder.get(l))
                                {
                                    //
                                }
                                else if (arrayString.get(l).charAt(0) != checkOrder.get(l))
                                {
                                    result.add("NO");
                                    break;
                                }
                                result.add("YES");
                            }
                        }
                    }
                }
            }
        }
        input.close();
        for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }
    }
}