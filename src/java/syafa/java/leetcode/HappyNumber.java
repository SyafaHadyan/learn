package syafa.java.leetcode;
import java.util.HashMap;

public class HappyNumber
{
    class Solution
    {
        public boolean isHappy(int n)
        {
            int currentNumber = n;
            HashMap<Integer,Boolean> registeredNumbers = new HashMap<>();
            while (true)
            {
                String[] numberString = String.valueOf(currentNumber).split("");
                currentNumber = 0;
                for (int i = 0; i < numberString.length; i++)
                {
                    currentNumber += Math.pow(Integer.parseInt(numberString[i]),2);
                }
                if (currentNumber == 1)
                {
                    return true;
                }
                if (!(registeredNumbers.containsKey(currentNumber)))
                {
                    registeredNumbers.put(currentNumber,true);
                    continue;
                }
                return false;
            }
        }
    }
}