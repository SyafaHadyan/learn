package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class KHS
{
    /*
     * 5
     * pemdas aok kalkulus pemlan asd
     * A B+ B+ A B
     * aok
     * 
     * Nilai dari mata kuliah aok adalah B+.
     * 
     * -10
     * input tidak valid
     * 
     * if (x < 0)
     * sout input tidak valid.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gradeAmount = Integer.parseInt(input.nextLine());
        String[] subject = input.nextLine().split(" ");
        int[] grade = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String search = input.nextLine();
        input.close();
        for (int i = 0; i < subject.length; i++)
        {
            //
        }
    }
}