package syafa.java.Praktikum.Bab4;

public class N13Array3D
{
    public static void main(String args[])
    {
        int a[] = {2,7,6,8,1};
        int b[] = {3,4,2,8,9,7,2,7,5};
        int pjg;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        int banyakBilanganGenap = 0;
        int banyakBilanganGanjil = 0;
        pjg = Math.max(a.length,b.length); 
        int c[] = new int[pjg];
        for (int i = 0; i < pjg; i++)
        {
            if(a.length < i + 1)
                c[i] = b[i];
            else if(b.length < i + 1) 
                c[i] = a[i];
            else
                c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] % 2 == 0)
            {
                jumlahGenap += c[i];
                banyakBilanganGenap++;
            }
            else if (c[i] % 2 != 0)
            {
                jumlahGanjil += c[i];
                banyakBilanganGanjil++;
            }
        }
        System.out.print
        (
            "\nJumlah bilangan genap" + "\n" +
            jumlahGenap + "\n" +
            "Jumlah bilangan ganjil" + "\n" +
            jumlahGanjil + "\n" +
            "Banyak bilangan genap" + "\n" +
            banyakBilanganGenap + "\n" +
            "Banyak bilangan ganjil" + "\n" +
            banyakBilanganGanjil
        );
    }
}
