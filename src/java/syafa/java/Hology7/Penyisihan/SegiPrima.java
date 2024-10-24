package syafa.java.Hology7.Penyisihan;
import java.util.*;
import java.util.stream.*;
import java.math.*;

@SuppressWarnings("unused")
public class SegiPrima
{
    public static void main(String[] args)
    {
        /*
         * 5
         * 5 4 1 5 2
         * 
         * 3
         * 
         * start = 5
         * 
         * st
         * ch = st
         * 5 go to index 5 = 2
         * 2 go to index 2 = 4
         * 4 go to index 4 = 5 = st break;
         * 
         * counter = 3;
         */
        Scanner input = new Scanner(System.in);
        int peopleAmount = Integer.parseInt(input.nextLine());
        int[] people = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        //for (int i = 0; i < people.length; i++)
        //{
            int start = people[0];
            int check = start;
            counter = 0;
            for (int j = 0; j < people.length; j++)
            {
                try
                {
                    int temp = check;
                    check = people[temp - 1];
                    counter++;
                    if (check == start)
                    {
                        if (BigInteger.valueOf(counter).isProbablePrime(10))
                        {
                            System.out.print(counter);
                            return;
                        }
                        System.out.print(-1);
                        return;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        //}
        System.out.print(counter);
    }
}