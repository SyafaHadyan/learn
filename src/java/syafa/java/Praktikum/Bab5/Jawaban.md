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
        do {
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

ubah `void volBalok()` menjadi `private static void volBalok()`

### 2. Apa perbedaan dari kedua method void pada program di atas? Jelaskan

//

### 3. Jelaskan alur kerja program method void tersebut

//

### 4. Gantilah method void volBalok menjadi method yang menghitung luas, keliling dan sisi miring segitiga siku-siku dengan output 2 angka dibelakang koma

//

### 5. Gantilah method void volPrismaSegitiga menjadi method yang menghitung luas, keliling segitiga sembarang dengan output 2 angka dibelakang koma

//

## Method Return Value

### Jalankan program method return value dan benahi jika menemukan kesalahan

//

### 7. Jelaskan alur kerja program method return value tersebut

//

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
