package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC1JamDengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hourStart = input.nextInt();
        int minuteStart = input.nextInt();
        input.nextLine();
        int duration = Integer.parseInt(input.nextLine());
        input.close();
        int hourEnd = (hourStart + (duration / 60)) % 23;
        int minuteEnd = (minuteStart + duration) % 60;
        String hourStartString = String.format("%02d",hourStart);
        String minuteStartString = String.format("%02d",minuteStart);
        String hourEndString = String.format("%02d",hourEnd);
        String minuteEndString = String.format("%02d",minuteEnd);
        System.out.println("Dengklek belajar pukul " + hourStartString + ":" + minuteStartString + " selama " + duration + " menit dan selesai pada pukul " + hourEndString + ":" + minuteEndString + ".");
    }
}