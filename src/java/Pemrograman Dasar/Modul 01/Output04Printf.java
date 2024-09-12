public class Output04Printf
{
    public static void main(String[] args)
    {
        float x = 7654.123456789f; // Kesalahan pada `F` yang seharusnya `7654.123456789f;
        System.out.printf("%d\t%3d\t%8d\n", 1234, -567, 8910);
        System.out.printf("%d\t%3d\t%+8d\n", 1234, -567, 8910);
        System.out.printf("%f\t%15f\t%15.3f\n", x, x, x); // Escape sequance tidak valid pada `\ n` yang seharusnya `\n`
        System.out.printf("%.2f",x);

        /*
         * "%g" General Number: print 
         * Spasi 15 karakter
         * Spasi 15 karakter dan 3 angka di belakang koma
         * Tambah newline
         */
        System.out.printf("%g%15e%15.3f\n",x,x,x);
    }
}