package syafa.java.section0;

import java.util.*;

public class Learn01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int n = input.nextInt();
        input.close();
        if (h < 0 || h > 23 || n < 0 || n > 1000)
        {
            return;
        }
        int x = (h + n) % 24;
        System.out.println("Dengklek tidur pada jam" + ' ' + h + ' ' + "selama" + ' ' + n + ' ' + "jam, dan akan bangun pada jam" + ' ' + x);
    }
}