package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;

public class GridChallenge
{
    /*
     * TODO: 1. Fix if string is only a letter.
     */
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
                    for (int k = 0; k < arrayString.get(0).length(); k++)
                    {
                        int substringCounter = 1;
                        try
                        {
                            if (arrayString.get(k).charAt(0) == arrayString.get(k).charAt(0))
                            {
                                arrayString.set(k,arrayString.get(k).substring(substringCounter));
                                arrayString.set(k + 1,arrayString.get(k + 1).substring(substringCounter));
                            }
                        }
                        catch (IndexOutOfBoundsException e)
                        {
                            break;
                        }
                    }
                    ArrayList<Character> checkOrder = new ArrayList<Character>();
                    for (int k = 0; k < arrRow; k++)
                    {
                        try
                        {
                            checkOrder.add(arrayString.get(k).charAt(0));
                        }
                        catch (StringIndexOutOfBoundsException e)
                        {
                            result.add("NO");
                            break;
                        }
                        if (k == arrRow - 1)
                        {
                            Collections.sort(checkOrder);
                            for (int l = 0; l < checkOrder.size(); l++)
                            {
                                if (arrayString.get(l).charAt(0) == checkOrder.get(l))
                                {
                                    //
                                }
                                if (arrayString.get(l).charAt(0) != checkOrder.get(l))
                                {
                                    result.add("NO");
                                    break;
                                }
                                if ((l == checkOrder.size() - 1) && (arrayString.get(l).charAt(0) == checkOrder.get(l)))
                                {
                                    result.add("YES");
                                }
                            }
                        }
                    }
                }
            }
        }
        input.close();
        for (int i = 0; i < result.size(); i++)
        {
            System.out.print(result.get(i));
            if (i != result.size() -1)
            {
                System.out.print("\n");
            }
        }
    }
}