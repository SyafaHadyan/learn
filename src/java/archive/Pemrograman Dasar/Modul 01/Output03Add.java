public class Output03Add
{
    public static void main(String[] args)
    {
        System.out.printf("%s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');
        
        // Print "Pemro" rata kanan spasi 30 karakter dan dibatasi 5 karakter ditambah char '|' dan diakhiri dengan line baru "\n".
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
        
        // Print "Pemrogra" rata kiri ditambah spasi 30 karakter dan dibatasi 8 karakter ditabmbah char '|' dan diakhiri dengan line baru "\n".
        System.out.printf("%-30.8s%c\n","Pemrograman Java",'|');
    }
}