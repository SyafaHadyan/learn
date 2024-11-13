import java.util.*;

public class Test
{
    public static void addNumber(int firstNumber,int secondNumber)
    {
        //int hasilPenjumlahan = firstNumber + secondNumber;
        //String[] hasil = {"Hasil adalah",String.valueOf(hasilPenjumlahan)};
        System.out.print(firstNumber + secondNumber);
        //return firstNumber + secondNumber;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pertama = Integer.parseInt(input.nextLine());
        int kedua = Integer.parseInt(input.nextLine());
        addNumber(pertama,kedua);
        //System.out.print(addNumber(pertama,kedua));
        input.close();
        //https://www.w3schools.com/
    }
}