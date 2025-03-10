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

Ubah `void volBalok()` menjadi `private static void volBalok()`.

### 2. Apa perbedaan dari kedua method void pada program di atas? Jelaskan

Kedua `method` `void` di atas sama-sama berfungsi untuk menghitung tanpa `return` value. `volPrismaSegitiga()` digunakan untuk menghitung volume prisma segitiga dengan mengambil input dari user di dalam `method` ini. `volBalok()` sama alur jalan kodenya tapi variabel dan perhitungannya yang berbeda (untuk volume balok).

### 3. Jelaskan alur kerja program method void tersebut

#### `volPrismaSegitiga()`

buat variabel `float` `alas`, `tinggiSegitiga`, `luas`, `tinggiPrisma`, dan `volume` yang kemudian mengambil input dari user untik dimasukkan di `alas` dan `tinggiSegitiga` yang kemudian langsung hitung nilai `luas` dengan cara `(alas * tinggiSegitiga) / 2` kemudian minta user untuk memasukkan nilai `tinggiPrisma` kemudian langsung kalkulasi `volume` dengan `(luas * tinggiPrisma)` kemudian print nilai dari `volume`.

#### `volBalok()`

Buat variabel `float` `panjang`, `lebar`, `tinggi`, dan `volume` yang kemudian akan diberi nilai dari input dari user, kemudian kalulasi nilai `volume` dengan mengalikan `panjang`, `lebar`, dan `tinggi` kemudian print nilai `volume`.

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

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N07MethodReturnValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2, umur1, umur2;
        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.print("Masukkan Tempat, Tanggal Lahir Mahasiswa 1 : ");
        umur1 = in.nextLine();
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.print("Masukkan Tempat, Tanggal Lahir Mahasiswa 2 : ");
        umur2 = in.nextLine();
        in.close();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, umur1));
        System.out.print(showData(nim2, nama2, jur2, umur2));
    }
    public static String showData(String nim, String nama, String jurusan, String umur)
    {
        String show = "\nnim : " + nim + "\nnama : " + nama + "\nJurusan : " + jurusan + "\nUmur : " + (2024 /* change in 2025 */ - Integer.parseInt(umur.substring(umur.length() - 4,umur.length())) < 20 ? "Teen" : "Adult");
        return show;
    }
}
```

### 9. Jelaskan perbedaan penggunaan method void dengan return value

`method` `void` tidak `return` value apa pun, sedangkan `method` yang `return` `value` akan mengembalikan hasil dari apa saja yang dilakukan di dalam `method` yang `return` `value`. `method` yang `return` `value` dan `void` keduanya bisa digunakan tergantung dari keperluan program. Contoh, `method` `void` `defaultExit()` yang isinya adalah print terima kasih telah menggunakan program ... kemudian `System.exit(0)` untuk keluar dari program. Contoh untuk `method` `return` `value` adalah di kode Praktikum yang pertama, di kode permutasi, di situ, `method` `permutation()` akan return `array` `double` nilai dari pembilang dan penyebut. Karena kita juga perlu untuk menghitung nilai dari kombinasi yang ada di `method` `combination()` dan yang membedakan perhitungan permutasi dan kombinasi adalah di bagian pembaginya, kita tidak perlu lagi menghitung ulang permutasi dari awal lagi, tetapi, kita tinggal memanggil saja `method` dari permutasi yang kemudian nilai dari penyebutnya kita kalikan dengan faktorial dari r kemudian kita `return` nilai dari perhitungan itu tanpa perlu membuat kode yang sama berulang kali yang artinya, jika ada kesalahan di kode permutasi, kita tinggal memperbaiki di satu tempat saja tanpa perlu meng copy dan menaruhnya di tempat kalkulasi kombinasi.

## Method Return Value Berparameter Array

### 10. Jalankan program method return value berparameter array dan benahi jika menemukan kesalahan

`method` `sort` untuk mengurutkan `array` `int` yang kemudian diurutkan dari yang terbesar hingga yang terkecil kemudian `return` `array` yang sudah diurutkan. Jika ingin mengurutkan dari yang terkecil hingga yang terbesar, ganti `if (acak[bil1] < acak[bil2])` menjadi `if (acak[bil1] > acak[bil2])` agar bilangan yang diurutkan dari yang terkecil hingga yang terbesar dan di dalam kode, ada `import java.util.*;` yang tidak digunakan sama sekali.

### 11. Jelaskan alur kerja program method return value berparameter array tersebut

`sort()` dengan parameter `array` `int` yang akan mengurutkan bilangan dari yang terbesar ke yang terkecil (dengan menggunakan `while` dengan variabel counter untuk menghitung indeks ke n dan jika indeks ke n itu lebih kecil, dari n + 1, swap dengan variabel sementara dan lanjut (Algoritma Bubble Sort akan loop 2 kali untuk memastikan seluruh elemen sudah dicek)) dengan algoritma Bubble Sort. Di dalam `sort()` kemudian `return` `array` yang sudah di sort tadi kemudian di `main` `method`, akan di print dengan `for-loop` array yang sudah di sort tadi.

### 12. Tambahkan method untuk mengurutkan angka dari yang terbesar ke terkecil

```java
package syafa.java.Praktikum.Bab5;

public class N12MethodReturnValueBerparameterArray
{
    public static void main(String[] args)
    {
        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
        arr = sortBesarKecil(arr);
        System.out.println("Sort besar ke kecil");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Index ke " + (i + 1) + " : " + arr[i]);
        }
        arr = sortKecilBesar(arr);
        System.out.print("Sort kecil ke besar");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("\n");
            System.out.print("Index ke " + (i + 1) + " : " + arr[i]);
        }
    }
    private static int[] sortBesarKecil(int[] acak)
    {
        int bil1 = 0;
        int bil2 = 0;
        while (bil1 < acak.length)
        {
            bil2 = bil1;
            while (bil2 < acak.length)
            {
                if (acak[bil1] < acak[bil2])
                {
                    int temp = acak[bil1];
                    acak[bil1] = acak[bil2];
                    acak[bil2] = temp;
                }
                bil2++;
            }
            bil1++;
        }
        return acak;
    }
    private static int[] sortKecilBesar(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0 + i; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
```

### 13. Jelaskan perbedaan penggunaan method return value dengan method return value yang berparameter array

`method` `return` `value` atau `array` keduanya sama saja dan harus ditaruh di variabel yang sesuai, jika ingin mengambil indeks ke n dari `method` yang `return` valuenya adalah `array`, maka kita tinggal tambahkan `variabel = contohMethod(array)[n]`. `method` yang mengambil `array` harus diberi `array` juga, jika masih belum ada `array`, kita harus membuat `array` baru sebelum memanggil `method` yang mengambil nilai `array`.

## Method Rekursif

### 14. Jalankan kelas Input dan benahi jika menemukan kesalahan

```txt
Nilai dari 5! adalah 120
```

### 15. Jelaskan alur kerja program method rekursif tersebut

Di `method` `faktorial()`, mengambil nilai `int` . jika nilai dari `int` adalah 1, maka langsung `return 1`, jika tidak, maka akan memanggil dirinya sendiri dengan cara memberi nilai `bil` - 1 yang nilai dari `return` nya adalah `bil` dikalikan dengan nilai pemanggilan tadi.

### 16. Ubahlah program tersebut menjadi program interaktif menggunakan input user

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N16MethodRekursif
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = Integer.parseInt(input.nextLine());
        input.close();
        int hasil;
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
    }
    private static int faktorial(int bil)
    {
        if (bil == 1)
            return 1;
        else
            return (bil * faktorial(bil-1));
    }
}
```

### 17. Buatlah program yang mencetak deret Fibonacci yang di dalamnya terdapat method rekursif. Deret Fibonacci merupakan suatu deret dimana bilangan berikutnya adalah hasil dari penjumlahan 2 bilangan sebelumnya

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N17MethodRekursif
{
    public static void fibonacci(int firstNumber,int secondNumber,int max,int currentCounter)
    {
        currentCounter++;
        int currentNumber = firstNumber + secondNumber;
        if (currentCounter != max)
        {
            if (currentCounter == 1)
            {
                System.out.println("0\n1\n1");
            }
            else
            {
                System.out.println(currentNumber);
            }
            fibonacci(secondNumber,currentNumber,max,currentCounter);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan fibonacci" + " : ");
        fibonacci(0,1,Integer.parseInt(input.nextLine()),0);
        input.close();
    }
}
```

### 18. Jelaskan perbedaan penggunaan method return value dengan method rekursif

`method` `return` `value` bisa dipanggil sekali dan juga bisa dijadikan `rekursif` yang mana sama. Contoh method `faktorial()` yang jika dipanggil sekali akan `return` value dengan `for loop` di dalamnya bukan termasuk `method` `rekursif` karena tidak memanggil dirinya sendiri. Jika kita ubah `for` yang ada di dalam `faktorial()` dengan memanggil dirinya sendiri dengan -1, maka kita bisa memanggil itu sebagai `method` `rekursif`.

## Praktikum

### Praktikum 1 (Permutasi dan Kombinasi)

#### Kode Praktikum 1

```java
package syafa.java.Praktikum.Bab5;
import java.util.*;
import java.math.*;

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
    public static BigInteger[] permutation(BigInteger[] number)
    {
        number[1] = number[0].subtract(number[1]);
        for (int i = 0; i < 2; i++)
        {
            number[i + 2] = BigInteger.ONE;
            for (BigInteger j = number[i]; (j.compareTo(BigInteger.ZERO) == 1); j = j.subtract(BigInteger.ONE))
            {
                number[i + 2] = number[i + 2].multiply(j);
            }
        }
        return new BigInteger[]{number[2],number[3]};
    }
    public static BigInteger combination(BigInteger[] number)
    {
        number[2] = number[1];
        number[4] = BigInteger.ONE;
        for (BigInteger i = number[2]; (i.compareTo(BigInteger.ZERO) == 1); i = i.subtract(BigInteger.ONE))
        {
            number[4] = number[4].multiply(i);
        }
        BigInteger[] result = permutation(number);
        return result[0].divide(result[1].multiply(number[4]));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menuChoose = 0;
        BigInteger[] nr = {BigInteger.ZERO,BigInteger.ZERO,BigInteger.ONE,BigInteger.ONE,BigInteger.ONE};
        BigInteger[] result = new BigInteger[2];
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
                    nr[i] = input.nextBigInteger();
                }
                input.nextLine();
                result = permutation(nr);
                nr[4] = result[0].divide(result[1]);
                System.out.printf
                (
                    "%9c\n%-4s%-2c%-7s%-2c%d\n%12s\n%-31s%-2c%d\n\n",
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
                    nr[i] = input.nextBigInteger();
                }
                input.nextLine();
                result[0] = combination(nr);
                System.out.printf
                (
                    "%12c\n%-4s%-2c%-12s%-2c%d\n%17s\n%-31s%-2c%d\n\n",
                    'n',
                    "nCr",'=',"-----------",'=',result[0],
                    "(n-r)! x r!",
                    "Maka Hasil Kombinasinya adalah",':',result[0]
                );
            }
            else if (menuChoose == 3)
            {
                System.out.print("Keluar...");
                input.close();
                System.exit(0);
            }
        }
    }
}
```

#### Penjelasan Kode Praktikum 1

Kode akan print menu untuk memberi pilihan user nilai yang akan dihitung (apakah permutasi atau kombinasi), kemudian kode meminta input user untuk memasukkan pilihan (jika 1 atau 2, maka akan masuk ke proses selanjutnya (akan dijelaskan nanti)), jika pilihan adalah 3, maka akan close `Scanner` dan kemudian keluar.

##### Pilihan 1

kode akan meminta user untuk memasukkan nilai n dan r yang akan dimasukkan ke `array` `BigInteger` `nr` indeks ke 0 dan 1. Kemudian akan memanggil `method` `permutation()` dengan memberikan `array` `nr`.

###### Fungsi Setiap Elemen di `array` `nr`

|Elemen Ke|nilai|Fungsi|
|:---:|:---:|:---|
|0|0|Untuk menaruh value dari input user|
|1|0|Untuk menaruh value dari input user|
|2|1|Untuk menaruh hasil dari kalkulasi permutasi (pembilang)|
|3|1|Untuk menaruh hasil dari kalkulasi permutasi (penyebut)|
|4|1|Untuk menaruh hasil dari kalkulasi kombinasi (penyebut yang r!) dan juga hasil dari pembagian pembilang dan penyebut hasil dari kalkulasi permutasi|

> Note: nilai dari setiap indeks ke n akan berubah tergantung dari `method` yang dipanggil.

Di dalam `permutation()` akan set nilai `nr` (indeks ke 1) dengan indeks 0 dikurangi indeks ke 1 $n-r$ yang kemudian masuk 2 `for loop`. `for loop` yang terluar untuk menaruh hasil kalkulasi di pembilang dan penyebut (ref ke tabel). `for loop` di dalam akan hitung faktorial dengan cara dikalikan $n*\left(n-1\right)$. Setelah menghitung nilai dari pembilang dan penyebut, akan `return` value dari pembilang dan penyebut (`return` `array` karena agar nilai dari pembilang dan penyebut bisa digunakan lagi ketika `method` `combination()` dipanggil). Di dalam `main` `array` pembilang dan penyebut akan dimasukkan ke indeks terakhir dari `nr` (indeks ke 4) kemudian `printf` nilai dari pembagian tadi kemudian kembali ke menu utama (dengan print pilihan menu yang sama).

##### Pilihan 2

Di dalam pilhan ke 2, fungsi dari bagian kode ini sama saja seperti di bagian kode yang pilihan 1, tetapi, yang membedakan adalah ketika melakukan kalkulasi, kita memanggil `method` `combination()` dengan cara menghitung nilai dari faktorial dari `r` saja kemudian memanggil `method` `permutation()` yang akan disimpan di variabel baru (`result[]`) kemudian akan return `double` saja (bukan `array`) karena `method` `combination()` tidak bisa dipakai ulang seperti `method` `permutaion()`. yang pembilang dan penyebutnya bisa dipakai lagi di `combination()`.

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
            if (checkPrime(i).equalsIgnoreCase("Prima"))
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

Kode input dari user ke variabel `number`. Kemudian panggil `checkPrime()` di print dengan pass nilai `number`, jika `number` <= 1, langsung `return` Bukan Prima, jika bukan <= 1, masuk ke for loop yang mencoba untuk membagi `number` dengan nilai `i` (yang dimulai dari 2 hingga `number` - 1). Jika `number` berhasil dibagi dengan nilai `i`, maka `number` bukanlah bilangan prima dan langsung `return` Bukan Prima. Jika tidak bisa dibagi dari semua nilai dari `i`, `return` Prima (yang ada di luar `for loop`).

`method` `primeToN()` akan print bilangan prima hingga <= 100 yang menggunakan  `for loop` untuk membatasi nilai prima yang akan dicek (<= 100). `for loop` (menggunakan `if` yang memanggil `method` `checkPrime()`), jika hasilnya adalah `String` "Prima", maka print nilai dari `i`, jika tidak, maka lanjut.
