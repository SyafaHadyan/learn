public class Output04CorrectedAdd
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
        System.out.printf("%.2f",x);
    }
}