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
            if (arrRow == 1)
            {
                result.add("YES");
                continue;
            }
            arrRow = Integer.parseInt(input.nextLine());
            ArrayList<String> arrayString = new ArrayList<String>();
            ArrayList<String> arrayStringSorted = new ArrayList<String>();
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
                    for (int k = 0; k < args.length; k++)
                    {
                        arrayStringSorted.add(arrayString.get(k));
                    }
                    Collections.sort(arrayStringSorted);
                    ArrayList<Character> checkOrder = new ArrayList<Character>();
                    for (int k = 0; k < arrRow; k++)
                    {
                        /*
                        int substringCounter = 0;
                        for (int l = 0; l < arrayString.get(0).length(); l++)
                        {
                            try
                            {
                                if (arrayString.get(l).charAt(0) == arrayString.get(l + 1).charAt(0))
                                {
                                    substringCounter++;
                                }
                            }
                            catch (IndexOutOfBoundsException e)
                            {
                                break;
                            }
                        }
                            */
                        /*try
                        {
                            //checkOrder.add(arrayString.get(k).charAt(substringCounter));
                        }
                        catch (StringIndexOutOfBoundsException e)
                        {
                            result.add("NO");
                            break;
                        }
                        */
                        if (k == arrRow - 1)
                        {
                            Collections.sort(checkOrder);
                            for (int l = 0; l < arrayStringSorted.size(); l++)
                            {
                                if (arrayString.get(l).equalsIgnoreCase(arrayStringSorted.get(l)));
                                {
                                    //
                                }
                                if (!(arrayString.get(l).equalsIgnoreCase(arrayStringSorted.get(l))))
                                {
                                    result.add("NO");
                                    break;
                                }
                                if ((l == arrayStringSorted.size() - 1) && (arrayString.get(l).equalsIgnoreCase(arrayStringSorted.get(l))))
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