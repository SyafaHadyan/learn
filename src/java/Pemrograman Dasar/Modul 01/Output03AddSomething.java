public class Output03AddSomething
{
    public static void main(String[] args)
    {
        System.out.printf("%s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30.8s%c\n","Pemrograman Java",'|'); // perbedaan di tanda `-` (rata kiri) dan print 8 karakter pertama
    }
 }