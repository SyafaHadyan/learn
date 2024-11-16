package syafa.java.projecteuler;

public class Problem1MultiplesOf3Or5
{
    static final int MAX_CHECK_BELOW = 1000;
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i < MAX_CHECK_BELOW; i++)
        {
            if (i % 3 == 0|| i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}