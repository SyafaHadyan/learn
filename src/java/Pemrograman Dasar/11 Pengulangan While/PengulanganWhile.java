import java.util.*;

public class PengulanganWhile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int angkaAwal = Integer.parseInt(input.nextLine());
        int angkaMaksimal = Integer.parseInt(input.nextLine());
        input.close();
        while (angkaAwal <= angkaMaksimal)
        {
            System.out.println(angkaAwal);
            angkaAwal++
        }
    }
}