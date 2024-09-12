public class Output03EditCorrected
{
    public static void main(String[] args)
    {
        // Error karena 'ab' bukan char dan progarm tidak bisa berjalan
        System.out.printf("%s%c\n", "Pemrograman Java", "ab");
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
    }
 }