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
        int[][] studentGradeList = new int[studentAmount][ANSWER_KEY.length];
        int[] studentGrade = new int[studentAmount];
        for (int i = 0; i < studentGradeList.length; i++)
        {
            for (int j = 0; j < studentGradeList[i].length; j++)
            {
                studentGradeList[i][j] = input.nextInt();
                if (studentGradeList[i][j] == ANSWER_KEY[j])
                {
                    studentGrade[i]++;
                }
            }
            input.nextLine();
        }
        input.close();
    }
}