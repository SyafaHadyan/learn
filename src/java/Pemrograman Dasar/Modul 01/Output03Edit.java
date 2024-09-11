public class Output03Edit
{
    public static void main(String[] args)
    {
        System.out.printf("%s%c\n", "Pemrograman Java", 'ab'); // error karena bukan char
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
    }
 }