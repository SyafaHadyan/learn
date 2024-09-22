package syafa.java.learn.chapter2;
import java.util.*;

public class DisplayTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Enter time (in second(s))",':');
        int initialTime = Integer.parseInt(input.nextLine());
        input.close();
        int minute = initialTime / 60;
        int remainingSecond = initialTime % 60;
        System.out.printf("%-20s%-2c%s%s%-20s%-2c%s","Minute",':',minute,"\n","Remaining seconds",':',remainingSecond);

    }
}