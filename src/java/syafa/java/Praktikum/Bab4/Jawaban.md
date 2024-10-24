# Bab 4 - Array

## Array 1D

### 1. Jelaskan dan perbaiki jika menemui kesalahan

Kesalahan pada `i+` yang seharusnya `i++`.

### 2. Jalankan kelas `Array1` dan benahi jika menemukan kesalahan

Iterasi 10 kali (mulai dari 0 sampai 9) dan elemen ke-`i` dari `bil[]` akan diisi dengan $1+(Random)\space\text{antara}\space0.0\space\text{hingga}\space1.0$ menggunakan `Math.random()` yang akan menggenerate `double` antara `0.0` hingga `1.0` kemudian dikali dengan `100` yang hasilnya di `cast` menjadi `int` yang disimpan pada `bil[i]`.

### 3. Pada baris ketiga, hapus angka `10` kemudian amati apa yang terjadi dan jelaskan

Kode tidak akan bisa berjalan karena ukuran `int[]` tidak diinisialisasi.

### 4. Pada baris 5, kode tersebut diubah menjadi `for (i = 2; i <= 8; i++)` kemudian amati apa yang terjadi dan jelaskan

Karena `i` mulai dari 2 hingga 8, maka `bil[]` hanya akan diisi mulai dari 2 hingga 8 dengan `Math.random() * 100` dan elemen yang lainnya nilainya 0.

### 5. Pada baris 5 – 7, jelaskan arti dari kode tersebut dan bila kode tersebut diubah menjadi `bil[i] = 1 + (Math.random() * 100);` kemudian amati apa yang terjadi dan jelaskan

#### `For-loop` pertama

Karena tidak ada cast ke `int` dan tipe data dari `bil[]` adalah `int`, maka kode tidak bisa berjalan karena tidak bisa convert `double` ke `int`. kecuali tipe data `bil[]` diubah menjadi `double`.

#### `For-loop` kedua

Pada `for-loop` kedua digunakan untuk `print` seluruh nilai dari `bil[]`

### 6. Pada baris 8, kode tersebut diubah menjadi `for (i = 0;i <= 10; i++)` kemudian amati apa yang terjadi dan jelaskan

Pada saat kode akan mengakses elemen ke 10, Java akan `throw` [`IndexOutOfBoundsException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IndexOutOfBoundsException.html) karena elemen yang akan diakses diluar range dari `bil[]`

## Array 2D

### 7. Jalankan kelas Array2 dan benahi jika menemukan kesalahan

Tidak ada kesalahan

### 8. Pada baris 5, syntax `int[][] coba` diganti `int coba[][]` amati yang terjadi dan jelaskan

Tidak ada yang berubah karena keduanya sama

### 9. Pada baris 6, syntax `double[][] bank` diganti `float bank[]` dan amati apa yang terjadi, jelaskan

Kode akan error karena array menjadi 1D dan error pada `for` ke 2 karena tidak bisa convert `double` ke `float` kecuali cast jadi `float`.

### 10. Tambahkan variabel dengan nama `nilaiRata2` yang bertipe data double dan diberi nilai awal 0 kemudian carilah nilai rata – rata dari array coba dan dicetak di akhir program

```java
package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class N10Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiRata2 = 0d;
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = i * 0.5 + j * 0.25;
                nilaiRata2 += i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        System.out.println("\nCara manual");
        System.out.println(nilaiRata2 / (bank[0].length + bank[1].length));
        System.out.println("Cara lain");
        System.out.print(((DoubleStream.of(bank[0]).sum() + DoubleStream.of(bank[1]).sum()) / ((bank[0].length + bank[1].length))));
    }
}
```

### 11. Tambahkan variabel dengan nama `nilaiMax` dan `nilaiMin` yang bertipe data `double` kemudian lakukan pencarian nilai minimal dan maksimal dari array `bank` lalu cetaklah di akhir program

```java
package syafa.java.Praktikum.Bab4;
import java.util.*;

public class N11Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiMin = Double.MAX_VALUE;
        double nilaiMax = Double.MIN_VALUE;
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        for (int i = 0; i < bank.length; i++)
        {
            for (int j = 0; j < bank[i].length; j++)
            {
                if (bank[i][j] > nilaiMax)
                {
                    nilaiMax = bank[i][j];
                }
                if (bank[i][j] < nilaiMin)
                {
                    nilaiMin = bank[i][j];
                }
            }
        }
        System.out.print("Nilai max" + "\n" + nilaiMax + "\n" + "Nilai min" + "\n" + nilaiMin);
    }
}
```

## Array 3D

### 12. Jalankan kelas Array3 dan benahi jika menemukan kesalahan

Tidak ada kesalahan

### 13. Jelaskan maksud dari statement baris ke-7

Pada baris ke 7, membuat array `Integer` `c[]` dengan panjang `pjg = 9`

### 14. Jelaskan perbedaan indeks array dan panjang array! Berikan contoh di kelas Array3

A

### 15. Tambahkan variabel dengan nama jumlahGenap dan jumlahGanjil yang bertipe data integer kemudian lakukan penambahan untuk bilangan genap dan ganjil

A
