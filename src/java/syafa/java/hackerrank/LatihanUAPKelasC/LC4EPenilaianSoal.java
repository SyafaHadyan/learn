package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4EPenilaianSoal
{
    static final char[] ANSWER_KEY =
    {
        'D','B','D','C','C','C','D','A','E','A','D'
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int studentAmount = Integer.parseInt(input.nextLine());
        int[][] studentGrade = new int[studentAmount][ANSWER_KEY.length];
        for (int i = 0; i < studentGrade.length; i++)
        {
            for (int j = 0; j < studentGrade[i].length; j++)
            {
                studentGrade[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        input.close();
    }
}