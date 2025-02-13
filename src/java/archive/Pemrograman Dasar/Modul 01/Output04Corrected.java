public class Output04Corrected
{
    public static void main(String[] args)
    {
        float x = 7654.123456789f; // Kesalahan pada ` F` yang seharusnya `7654.123456789f tanpa spasi;
        System.out.printf("%d\t%3d\t%8d\n", 1234, -567, 8910);
        System.out.printf("%d\t%3d\t%+8d\n", 1234, -567, 8910);
        System.out.printf("%f\t%15f\t%15.3f\n", x, x, x); // Escape sequence tidak valid pada `\ n` yang seharusnya `\n`
    }
}