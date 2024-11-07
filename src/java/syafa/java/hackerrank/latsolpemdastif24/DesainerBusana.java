package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class DesainerBusana
{
    static final double[] CLOTH = {1.2,1.5,2.0};
    static final double[] RIBBON = {0.8,1.0,1.3};
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double clothAmount = Double.parseDouble(input.nextLine());
        double ribbonAmount = Double.parseDouble(input.nextLine());
        input.close();
        System.out.printf
        (
            "%s%.1f\n%s%.1f",
            "Jumlah Kain: ",clothAmount,"Jumlah Pita: ",ribbonAmount
        );
    }
}