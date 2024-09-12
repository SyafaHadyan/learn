public class Output03Comments {
    public static void main(String[] args)
    {
        // Print "Pemrograman Java" rata kiri dan char '|' tanpa tambahan formatting dan diakhiri dengan line baru "\n".
        System.out.printf("%s%c\n", "Pemrograman Java", '|');

        // Print "Pemrograman Java" rata kanan dengan spasi 30 karakter ditambah char '|' dan diakhiri dengan line baru "\n".
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');

        // Print "Pemrograman Java" rata kiri ditambah spasi 30 karakter kemudian print char '|' dan diakhiri dengan line baru "\n".
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');

        // Print "Pemro" rata kanan dengan spasi 30 karakter dan hanya dibatasi 5 karakter String dan ditambah char '|' dan diakhiri dengan line baru "\n".
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
    }
}