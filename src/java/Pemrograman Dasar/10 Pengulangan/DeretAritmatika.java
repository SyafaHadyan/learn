import java.util.*;

public class DeretAritmatika
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan suku pertama",':');
        int sukuPertama = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan beda",':');
        int beda = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan batas deret",':');
        int batasDeret = Integer.parseInt(input.nextLine());
        input.close();
    }
}