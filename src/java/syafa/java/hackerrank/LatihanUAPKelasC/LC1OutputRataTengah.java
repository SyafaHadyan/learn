package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC1OutputRataTengah
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        int space = Integer.parseInt(input.nextLine());
        input.close();
        System.out.printf("%s%-" + space + "s%s" + "%-" + space + "s" + "%s","##","",inputString,"","##\n");
    }
}