package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionBilanganPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberCheck = Integer.parseInt(input.nextLine());
        input.close();
        if (numberCheck == 1)
        {
            System.out.print("Bukan prima");
            return;
        }
        for (int i = 2; i < numberCheck; i++)
        {
            if (numberCheck % i == 0)
            {
                System.out.print("Bukan prima");
                return;
            }
        }
    }
}