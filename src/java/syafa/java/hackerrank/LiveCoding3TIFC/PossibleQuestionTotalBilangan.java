package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionTotalBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberInput = Integer.parseInt(input.nextLine());
        input.close();
        int totalNumber = 0;
        for (int i = 1; i <= numberInput; i++)
        {
            totalNumber += i;
        }
        System.out.print(totalNumber);
    }
}