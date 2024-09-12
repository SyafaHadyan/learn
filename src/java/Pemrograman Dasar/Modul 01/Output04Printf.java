public class Output04Printf
{
    public static void main(String[] args)
    {
        // Kesalahan pada `F` yang seharusnya "7654.123456789f;"
        float x = 7654.123456789f;
        System.out.printf("%d\t%3d\t%8d\n", 1234, -567, 8910);
        System.out.printf("%d\t%3d\t%+8d\n", 1234, -567, 8910);
        
        // Escape sequance tidak valid pada "\ n" yang seharusnya "\n"
        System.out.printf("%f\t%15f\t%15.3f\n", x, x, x);

        // Print nilai 'x' dengan 2 angka di belakang koma
        System.out.printf("%.2f\n",x);

        /*
         * "%g"     General Number: Print nilai 'x' menggunakan notasi ilmiah atau desimal, tergantung dari presisi dan nilai setelah pembulatan [Link docs](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html)
         * "%15e"   Print nilai 'x' dengan spasi 15 karakter rata kanan
         * "%15.3f" Print nilai 'x' dengan spasi 15 karakter rata kanan dan 3 angka di belakang koma
         */
        System.out.printf("%g %15e %15.3f\n",x,x,x);
    }
}