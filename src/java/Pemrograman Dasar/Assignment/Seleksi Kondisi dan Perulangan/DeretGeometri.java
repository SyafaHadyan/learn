import java.util.*;

public class DeretGeometri
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan suku pertama",':');
        int sukuPertama = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan rasio",':');
        int rasio = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan batas deret",':');
        int batasDeret = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = sukuPertama; i < batasDeret; i *= rasio)
        {
            System.out.println(i);
        }
    }
}