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
        if (gradeAmount <= 0)
        {
            System.out.print("input tidak valid");
            input.close();
            return;
        }
        String[] subject = input.nextLine().split(" ");
        String[] grade = input.nextLine().split(" ");
        String search = input.nextLine();
        input.close();
        for (int i = 0; i < subject.length; i++)
        {
            if (search.equalsIgnoreCase(subject[i]))
            {
                System.out.print("Nilai dari mata kuliah" + " " + search + " " + "adalah" + " " + grade[i] + ".");
                return;
            }
        }
    }
}