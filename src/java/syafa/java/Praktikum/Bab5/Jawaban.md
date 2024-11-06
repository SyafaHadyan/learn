# Jawaban

## Method Void

### 1. Jalankan program method void dan benahi jika menemukan kesalahan

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N01MethodVoid
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int pilih = 3;
        do
        {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih)
            {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
            }
        }
        while (pilih != 3);
        in.close();
    }
    private static void volPrismaSegitiga()
    {
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = in.nextFloat();
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = in.nextFloat();
        luas = (alas * tinggiSegitiga) / 2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = in.nextFloat();
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    private static void volBalok()
    {
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = in.nextFloat();
        System.out.print("Masukkan lebar balok : ");
        lebar = in.nextFloat();
        System.out.print("Masukkan tinggi balok : ");
        tinggi = in.nextFloat();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
    }
}
```

ubah `void volBalok()` menjadi `private static void volBalok()`.

### 2. Apa perbedaan dari kedua method void pada program di atas? Jelaskan

//

### 3. Jelaskan alur kerja program method void tersebut

//

### 4. Gantilah method void volBalok menjadi method yang menghitung luas, keliling dan sisi miring segitiga siku-siku dengan output 2 angka dibelakang koma

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N04MethodVoid
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int pilih = 3;
        do
        {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Luas, keliling, dan sisi miring segitiga (siku-siku)");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = Integer.parseInt(in.nextLine());
            switch (pilih)
            {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
                case 3:
                    propertiSegitiga();
                    break;
            }
        }
        while (pilih != 4);
        in.close();
    }
    private static void volPrismaSegitiga()
    {
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = Float.parseFloat(in.nextLine());
        luas = (alas * tinggiSegitiga) / 2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = Float.parseFloat(in.nextLine());
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    private static void volBalok()
    {
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan lebar balok : ");
        lebar = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan tinggi balok : ");
        tinggi = Float.parseFloat(in.nextLine());
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
    }
    private static void propertiSegitiga()
    {
        double alas = 0d;
        double tinggi = 0d;
        System.out.print("Masukkan nilai alas: ");
        alas = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai tinggi: ");
        tinggi = Double.parseDouble(in.nextLine());
        System.out.printf("%-14s%-2c%.2f\n","Luas segitiga",':',((alas * tinggi) / 2d));
        System.out.printf("%-18s%-2c%.2f\n","Keliling segitiga",':',(alas + tinggi + (Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2)))));
        System.out.printf("%-21s%-2c%.2f\n","Sisi miring segitiga",':',(Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2))));
    }
}
```

### 5. Gantilah method void volPrismaSegitiga menjadi method yang menghitung luas, keliling segitiga sembarang dengan output 2 angka dibelakang koma

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N05MethodVoid
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int pilih = 3;
        do
        {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Luas, keliling, dan sisi miring segitiga (siku-siku)");
            System.out.println("4. Luas dan keliing segitiga sembarang");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = Integer.parseInt(in.nextLine());
            switch (pilih)
            {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
                case 3:
                    propertiSegitiga();
                    break;
                case 4:
                    kelilingLuasSegitigaSembarang();
                    break;
            }
        }
        while (pilih != 5);
        in.close();
    }
    private static void volPrismaSegitiga()
    {
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = Float.parseFloat(in.nextLine());
        luas = (alas * tinggiSegitiga) / 2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = Float.parseFloat(in.nextLine());
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    private static void volBalok()
    {
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan lebar balok : ");
        lebar = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan tinggi balok : ");
        tinggi = Float.parseFloat(in.nextLine());
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
    }
    private static void propertiSegitiga()
    {
        double alas = 0d;
        double tinggi = 0d;
        System.out.print("Masukkan nilai alas: ");
        alas = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai tinggi: ");
        tinggi = Double.parseDouble(in.nextLine());
        System.out.printf("%-14s%-2c%.2f\n","Luas segitiga",':',((alas * tinggi) / 2d));
        System.out.printf("%-18s%-2c%.2f\n","Keliling segitiga",':',(alas + tinggi + (Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2)))));
        System.out.printf("%-21s%-2c%.2f\n","Sisi miring segitiga",':',(Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2))));
    }
    private static void kelilingLuasSegitigaSembarang()
    {
        double alas = 0d;
        double tinggi = 0d;
        double sisiMiring = 0d;
        System.out.print("Masukkan nilai alas: ");
        alas = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai tinggi: ");
        tinggi = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai sisi miring: ");
        sisiMiring = Double.parseDouble(in.nextLine());
        System.out.printf("%-14s%-2c%.2f\n","Luas segitiga",':',((alas * tinggi) / 2d));
        System.out.printf("%-18s%-2c%.2f\n","Keliling segitiga",':',(alas + tinggi + sisiMiring));
    }
}
```

## Method Return Value

### 6. Jalankan program method return value dan benahi jika menemukan kesalahan

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N06MethodReturnValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2;
        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        in.close();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1));
        System.out.print(showData(nim2, nama2, jur2));
    }
    public static String showData(String nim, String nama, String jurusan)
    {
        String show = "\nnim : " + nim + "\nnama : " + nama + "\nJurusan : " + jurusan;
        return show;
    }
}
```

### 7. Jelaskan alur kerja program method return value tersebut

Kode input ke variabel `nimN`, `NamaN`, dan `jurN` yang kemudian diberikan ke `public static String showData();` kemudian buat `String` `show` yang berisi nim, nama, dan jurusan yang dipisah newline dan kemudian return `String` `show` yang kemudian di print di `main` `method` (di `main` `method` ada 2 kali pemanggilan (untuk data mahasiswa pertama dan yang kedua)).

### 8. Tambahkan masukan untuk menambahkan tempat tanggal lahir untuk menentukan umur. Apabila umur >20 berstatus “Adult” , umur < 20 berstatus “teen”

//

### 9. Jelaskan perbedaan penggunaan method void dengan return value

## Method Return Value Berparameter Array

### 10. Jalankan program method return value berparameter array dan benahi jika menemukan kesalahan

//

### 11. Jelaskan alur kerja program method return value berparameter array tersebut

//

### 12. Tambahkan method untuk mengurutkan angka dari yang terbesar ke terkecil

//

### 13. Jelaskan perbedaan penggunaan method return value dengan method return value yang berparameter array

## Method Rekursif

### 14. Jalankan kelas Input dan benahi jika menemukan kesalahan

//

### 15. Jelaskan alur kerja program method rekursif tersebut

//

### 16. Ubahlah program tersebut menjadi program interaktif menggunakan input user

//

### 17. Buatlah program yang mencetak deret Fibonacci yang di dalamnya terdapat method rekursif. Deret Fibonacci merupakan suatu deret dimana bilangan berikutnya adalah hasil dari penjumlahan 2 bilangan sebelumnya

//

### 18. Jelaskan perbedaan penggunaan method return value dengan method rekursif

//

## Praktikum

### Praktikum 1 (Permutasi dan Kombinasi)

#### Kode Praktikum 1

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;


public class Praktikum0
{
    static final String WELCOME_MESSAGE = "Program Penghitung Kombinasi dan Permutasi";
    static final String[] OPTION =
    {
        "Menghitung Permutasi",
        "Menghitung Kombinasi",
        "Keluar"
    };
    static final char[] VALUE =
    {
        'n',
        'r'
    };
    public static double[] permutation(double[] number)
    {
        number[1] = number[0] - number[1];
        for (int i = 0; i < 2; i++)
        {
            number[i + 2] = 1;
            for (double j = number[i]; j > 0; j--)
            {
                number[i + 2] *= j;
            }
        }
        return new double[]{number[2],number[3]};
    }
    public static double combination(double[] number)
    {
        number[2] = number[1];
        number[4] = 1;
        for (double i = number[2]; i > 0; i--)
        {
            number[4] *= i;
        }
        double[] result = permutation(number);
        return result[0] / (result[1] * number[4]);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        double[] nr = {0,0,1,1,1};
        double[] result = new double[2];
        while (true)
        {
            System.out.println(WELCOME_MESSAGE);
            for (int i = 0; i < OPTION.length; i++)
            {
                System.out.printf("%d%-2s%s\n",(i + 1),'.',OPTION[i]);
            }
            System.out.printf("%-22s%-2c","Masukkan pilihan anda",':');
            menuChoose = Integer.parseInt(input.nextLine());
            if (menuChoose == 1)
            {
                for (int i = 0; i < VALUE.length; i++)
                {
                    System.out.printf("%-15s%-2c%-2c","Masukkan nilai",VALUE[i],':');
                    nr[i] = Double.parseDouble(input.nextLine());
                }
                result = permutation(nr);
                nr[4] = result[0] / result[1];
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%.0f\n%12s\n%-31s%-2c%.0f\n\n",
                    'n',
                    "nPr",'=',"------",'=',nr[4],
                    "(n-r)!",
                    "Maka Hasil Permutasinya adalah",':',nr[4]
                );
            }
            else if (menuChoose == 2)
            {
                for (int i = 0; i < VALUE.length; i++)
                {
                    System.out.printf("%-15s%-2c%-2c","Masukkan nilai",VALUE[i],':');
                    nr[i] = Double.parseDouble(input.nextLine());
                }
                result[0] = combination(nr);
                System.out.printf
                (
                    "%12c\n%-4s%-2c%-12s%-2c%.0f\n%17s\n%-31s%-2c%.0f\n\n",
                    'n',
                    "nCr",'=',"-----------",'=',result[0],
                    "(n-r)! x r!",
                    "Maka Hasil Kombinasinya adalah",':',result[0]
                );
            }
            else if (menuChoose == 3)
            {
                input.close();
                System.exit(0);
            }
        }
    }
}
```

#### Penjelasan Kode Praktikum 1

//

### Praktikum 2 (Bilangan Prima)

#### Kode Praktikum 2

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class Praktikum1
{
    static final int MAX_PRIME_NUMBER = 100;
    public static String checkPrime(int number)
    {
        if (number <= 1)
        {
            return "Bukan prima";
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return "Bukan prima";
            }
        }
        return "Prima";
    }
    public static void primeToN()
    {
        for (int i = 2; i <= MAX_PRIME_NUMBER; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print("\n");
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s%-2c","Masukkan nomor",':');
        int number = Integer.parseInt(input.nextLine());
        input.close();
        System.out.printf("%d%c%s\n",(number),' ',checkPrime(number));
        System.out.print("Bilangan prima hingga" + " " + MAX_PRIME_NUMBER);
        primeToN();
    }
}
```

#### Penjelasan Kode Praktikum 2

//
