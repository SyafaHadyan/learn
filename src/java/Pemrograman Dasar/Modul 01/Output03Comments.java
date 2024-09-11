public class Output03Comments {
    public static void main(String[] args)
    {
        System.out.printf("%s%c\n", "Pemrograman Java", '|'); // Pemrograman Java |
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|'); // Pemrograman java "rata kanan 30 karakter" + |
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|'); // Pemgrograman Java + "spasi 30 karakter" + |
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|'); // Pemro (5 karakter pertama) "rata kanan 30 karakter" + "" 
    }
}