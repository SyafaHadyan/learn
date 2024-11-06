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

```

#### Penjelasan Kode Praktikum 1

//

### Praktikum 2 (Bilangan Prima)

#### Kode Praktikum 2

```java

```

#### Penjelasan Kode Praktikum 2

//
