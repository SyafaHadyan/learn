public class Output04
{
    public static void main(String[] args)
    {
        float x = 7654.123456789 F; // Kesalahan pada `F` yang seharusnya `7654.123456789f;
        System.out.printf("%d	%3d %8d\n", 1234, -567, 8910);
        System.out.printf("%d	%3d %+8d\n", 1234, -567, 8910);
        System.out.printf("% f % 15 f % 15.3 f\ n ", x, x, x);
    }
}