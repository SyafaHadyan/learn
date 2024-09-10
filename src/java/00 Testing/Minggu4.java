import java.util.*;

public class Minggu4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer A" + ":" + " ");
        int inta = input.nextInt();
        System.out.print("Enter Integer B" + ":" + " ");
        int intb = input.nextInt();
        System.out.print("Enter Double A" + ":" + " ");
        double douba = input.nextDouble();
        System.out.print("Enter Double B" + ":" + " ");
        double doubb = input.nextDouble();
        System.out.println("\n" + "Integer" + " " + "A / B" + ":" + " " + inta/intb);
        System.out.print("Dobule" + " " + "A / B" + ":" + " " + douba/doubb);
        input.close();
    }
}