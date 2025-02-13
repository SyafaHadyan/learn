public class Kuis02
{
    public static void main(String[] args)
    {
        int angkaAwal = 5;
        int angkaAkhir = 20;
        int hasil = 0;
        for (int i = angkaAwal; i <= angkaAwal * angkaAkhir; i += angkaAwal)
        {
            hasil += i;
            System.out.println(i);
        }
        System.out.printf("%-20s%-2c","Total penjumlahan",':');
        System.out.print(hasil);
    }
}