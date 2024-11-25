package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4EPenilaianSoal
{
    static final String[] ANSWER_KEY =
    {
        "D","B","D","C","C","D","A","E","A","D"
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int studentAmount = Integer.parseInt(input.nextLine());
        String[][] studentAnswerList = new String[studentAmount][ANSWER_KEY.length];
        int[] studentGrade = new int[studentAmount];
        for (int i = 0; i < studentAnswerList.length; i++)
        {
            studentAnswerList[i] = input.nextLine().split("\s");
            for (int j = 0; j < studentAnswerList[i].length; j++)
            {
                if (studentAnswerList[i][j].equalsIgnoreCase(ANSWER_KEY[j]))
                {
                    studentGrade[i]++;
                }
            }
        }
        input.close();
        for (int i = 0; i < studentGrade.length; i++)
        {
            System.out.println("Siswa ke-" + (i + 1) + " benar " + studentGrade[i] + " soal");
        }
    }
}