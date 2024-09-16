package syafa.java.chapter01;

import java.util.*;

public class Learn01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int n = input.nextInt();
        int x = 0;
        input.close();
        if (h < 0 || h > 23 || n < 0 || n > 1001)
        {
            return;
        }
        else if (h + n > 23)
        {
            x = h + n - 24;
        }
        else
        {
            x = h + n;
        }
        System.out.println("Dengklek tidur pada jam" + ' ' + h + ' ' + "selama" + ' ' + n + ' ' + "jam, dan akan bangun pada jam" + ' ' + x);
    }
}