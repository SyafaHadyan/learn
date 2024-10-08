# Jawaban

## Looping `For`

### 1. Jelaskan dan perbaiki jika menemui kesalahan

Kode menggunakan input dari user `n` dan akan mengulang `for-loop` hingga `n` mulai dari `0`.

### 2. Apa fungsi dan variabel nilai dalam statemen `for`

Variabel `n` digunakan untuk membatasi `i` sampai mana `loop` berjalan/dihentikan.

### 3. Dalam statemen for hapus StepExpression , kemudian apa yang terjadi, jelaskan

Kode akan terus berjalan tanpa berhenti dengan `print` 0 karena nilai `i` tidak ditambah yang berarti niali `i` akan terus berada di bawah `n` `<=n`.

### 4. Dalam statement `for` hapus satu persatu secara bergantian mulai dari `InitializationExpression`, `LoopCondition`, dan `StepExpression` , amati yang terjadi dan jelaskan

#### - `InitializationExpression`

Jika dihapus, maka kode tidak bisa berjalan karena tidak ada variabel `i`

#### - `LoopCondition`

Jika dihapus, maka kode akan berjalan tanpa henti `infinite loop`.

#### - `StepExpression`

Jika dihapus, maka kode akan berjalan tanpa henti `infinite loop`.

## Looping `While`

### 5. Jelaskan dan perbaiki jika menemui kesalahan

Kode akan berjalan, jika `nilai <= 10` akan memasuki `while` loop kemudian `println nilai` dan `increment` `nilai`, program akan terus berjalan hingga `nilai = 10`.

### 6. Setelah mengamati hasil keluaran, sebutkan perbedaan looping dengan menggunakan `for` dan `while`

looping menggunakan `for` akan dijalankan jika `InitializationExpression` dan `LoopCondition` memenuhi. Sedangakn `do-while` akan dijalankan paling tidak sekali dan akan dicek di akhir. Sedangkan `while` kurang lebih sama seperti `do-while` tetapi pengecekan akan dilakukan di awal. Setiap loop harus ada nilai yang membuat loop berhenti di dalam, kalau tidak, akan terjadi `infinite loop`.

### 7. Hapus statemen `nilai++` pada baris 6 kemudian amati yang terjadi dan jelaskan

Jika dihapus, `nilai` akan terus berada di `1` dan kode akan looping tanpa berhenti karena `nilai <= 10`.

### 8. Ubah syntaks di atas untuk membuat deret angka kelipatan 2

Jawaban ada di source code [`N08LoopingWhile.java`](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/Praktikum/Bab3/N08LoopingWhile.java).

## Looping `Do-While`

### 9. Jelaskan dan perbaiki jika menemui kesalahan

Kode akan println `nilai` yang kemudian `increment` `nilai`. Kode akan terus berjalan hingga `nilai <= 10`.

### 10. Setelah mengamati hasil keluaran, sebutkan perbedaan looping dengan menggunakan for, while dan do while

looping menggunakan `for` akan dijalankan jika `InitializationExpression` dan `LoopCondition` memenuhi. Sedangakn `do-while` akan dijalankan paling tidak sekali dan akan dicek di akhir. Sedangkan `while` kurang lebih sama seperti `do-while` tetapi pengecekan akan dilakukan di awal. Setiap loop harus ada nilai yang membuat loop berhenti di dalam, kalau tidak, akan terjadi `infinite loop`.

### 11. Hapus statement i++ pada baris 6, amati yang terjadi dan jelaskan

Jika dihapus, kode akan terus `println 1`. Karena nilai akan selalu `<= 10` dan kode tidak akan berhenti.

### 12. Ubah nilai dari variabel nilai baris ke 3 menjadi 11, amati yang terjadi dan jelaskan

Jika `nilai` diubah menjadi berapa saja, kode akan tetap dijalankan dan tetap masuk `do-while` paling tidak sekali karena pengecekan akan dilakukan di akhir. Jadi kode akan `println 11`.

## `Break` and `Continue`

### 13. Jelaskan dan perbaiki jika menemui kesalahan

Kode akan dijalankan dan set `nilai = 1`, jika `nilai = 5`, `break` dan keluar, jika tidak, `println nilai`. `For-loop` kedua jika `nilai = 5`, maka continue dan skip kode dibawahnya dan lanjut loop.

#### Output 13

```txt
pernyataan break batas 10
1
2
3
4 < Kode break di 5 dan keluar loop
pernyataan continue batas 10
1
2
3
4 < Kode skip di 5 dan lanjut ke 6
6
7
8
9
10
```

### 14. Jelaskan alur logika untuk pernyataan break dan continue pada program di atas

Kode akan dijalankan dan set `nilai = 1`, jika `nilai = 5`, `break` dan keluar, jika tidak, `println nilai`. `For-loop` kedua jika `nilai = 5`, maka continue dan skip kode dibawahnya dan lanjut loop.

#### Output 14

```txt
pernyataan break batas 10
1
2
3
4 < Kode break di 5 dan keluar loop
pernyataan continue batas 10
1
2
3
4 < Kode skip di 5 dan lanjut ke 6
6
7
8
9
10
```

### 15. Hapus pernyataan break pada baris 7 dan tuliskan kembali pernyataan break setelah else baris ke 8, amati yang terjadi dan jelaskan

#### Output 15

```txt
pernyataan break batas 10

pernyataan continue batas 10
1
2
3
4
6
7
8
9
10
```

Karena `if` tidak menjalankan apa-apa, dan di dalam `else` ada `break`, jadi setiap kali perulangan, `break` akan dijalankan dan tidak akan `println nilai` walaupun saat `nilai = 5` kecuali `println nilai` ada di `else` sebelum `break`.

### 16. Pada `if` penyataan `continue` baris ke 14 ubah pernyataan samadengan `(==)` menjadi pernyataan kurang dari samadengan `(<=)`

```txt
pernyataan break batas 10
1
2
3
4

pernyataan continue batas 10
< di saat nilai <= 5, akan masuk di if dan continue, sehingga tidak println nilai
6
7
8
9
10
```

## Praktikum

### Praktikum 1: Tangga

[`Praktikum0.java`](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/Praktikum/Bab3/Praktikum0.java)

```java
package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-17s%-2c","Masukkan nilai n",'=');
        int staircaseSize = Integer.parseInt(input.nextLine());
        int space = staircaseSize - 1;
        input.close();
        for (int i = 0; i < staircaseSize; i++)
        {
            for (int j = space; j > 0; j--)
            {
                if (j != 0)
                {
                    System.out.print(' ');
                }
                System.out.print(' ');
            }
            space--;
            for (int j = 0; j < i + 1; j++)
            {
                if (j != 0)
                {
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            if (i < staircaseSize)
            {
                System.out.print("\n");
            }
        }
    }
}
```

### Praktikum 2: Huruf

[`Praktikum1.java`](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/Praktikum/Bab3/Praktikum1.java)

```java
package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
        // !(The code is clean and readable)
        int spaceBeforeY = 0;
        int spaceMiddleY = 7;
        int spaceBeforeA = 7;
        int spaceMiddleA = 1;
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 4; i++)
        {
            if (i < 4 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (i == 3)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.print('S');
            if (i < 3)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 3; i++)
        {
            if (i < 3 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (i == 2)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            System.out.print("\n");
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 4; i++)
        {
            if (i < 4 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (i == 3)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                System.out.print("\n");
            }
            if (spaceBeforeY == 0)
            {
                System.out.printf("%-8c%c",'Y','Y');
            }
            else
            {
                String firstSpace = String.format("%" + spaceBeforeY + "s","");
                String secondSpace = String.format("%" + spaceMiddleY + "s","");
                System.out.printf("%s%c%s%c",firstSpace,'Y',secondSpace,'Y');
            }
            System.out.print("\n");
            spaceBeforeY++;
            spaceMiddleY -= 2;
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(' ');
            }
            System.out.print('Y');
            System.out.print("\n");
        }
        for (int i = 0; i < 8; i++)
        {
            String secondSpace = String.format("%" + spaceMiddleA + "s","");
            if (i == 0)
            {
                System.out.print("\n");
                String firstSpace = String.format("%" + spaceBeforeA + "s","");
                System.out.printf("%s%c",firstSpace,'A');
            }
            else if (i == 7)
            {
                System.out.printf("%c%s%c",'A',secondSpace,'A');
            }
            else if (i == 4)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (j == 0)
                    {
                        System.out.printf("%4c",'A');
                    }
                    System.out.print(' ');
                    System.out.print('A');
                }
                spaceMiddleA += 2;
            }
            else
            {
                String firstSpace = String.format("%" + spaceBeforeA + "s","");
                System.out.printf("%s%c%s%c",firstSpace,'A',secondSpace,'A');
                spaceMiddleA += 2;
            }
            System.out.print("\n");
            spaceBeforeA--;
            if (i == 7)
            {
                spaceBeforeA = 7;
                spaceMiddleA = 1;
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 9; i++)
        {
            if (i == 0)
            {
                for (int j = 0; j < 5; j++)
                {
                    if (j != 0)
                    {
                        System.out.print(' ');
                    }
                    System.out.print('F');
                    if (j == 4)
                    {
                        System.out.print("\n");
                    }
                }
            }
            else if ((i > 0) && (i < 4))
            {
                System.out.print('F');
                System.out.print("\n");
            }
            else if (i == 4)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (j != 0)
                    {
                        System.out.print(' ');
                    }
                    System.out.print('F');
                    if (j == 3)
                    {
                        System.out.print("\n");
                    }
                }
            }
            else
            {
                System.out.print('F');
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 8; i++)
        {
            String secondSpace = String.format("%" + spaceMiddleA + "s","");
            if (i == 0)
            {
                System.out.print("\n");
                String firstSpace = String.format("%" + spaceBeforeA + "s","");
                System.out.printf("%s%c",firstSpace,'A');
            }
            else if (i == 7)
            {
                System.out.printf("%c%s%c",'A',secondSpace,'A');
            }
            else if (i == 4)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (j == 0)
                    {
                        System.out.printf("%4c",'A');
                    }
                    System.out.print(' ');
                    System.out.print('A');
                }
                spaceMiddleA += 2;
            }
            else
            {
                String firstSpace = String.format("%" + spaceBeforeA + "s","");
                System.out.printf("%s%c%s%c",firstSpace,'A',secondSpace,'A');
                spaceMiddleA += 2;
            }
            if (i != 7)
            {
                System.out.print("\n");
            }            
            spaceBeforeA--;
        }
    }
}
```

### Praktikum 3: Volume Bentuk

[`Praktikum2.java`](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/Praktikum/Bab3/Praktikum2.java)

```java
package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        double selection = 0d;
        double radius = 0d;
        double height = 0d;
        double firstSide = 0d;
        double secondSide = 0d;
        final double PI = 3.1415926535;
        while (!inputValid)
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%-25s%-2c",
            "MENU",
            "0. KELUAR",
            "1. HITUNG VOLUME BALOK",
            "2. HITUNG VOLUME BOLA",
            "3. HITUNG VOLUME KERUCUT",
            "4. HITUNG VOLUME SILINDER",
            "5. HITUNG VOLUME LIMAS SEGITIGA",
            "MASUKKAN PILIHAN ANDA",':');
            selection = Double.parseDouble(input.nextLine());
            if (selection == 0)
            {
                input.close();
                return;
            }
            else if (selection == 1)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                selection = Math.pow(radius,3);
            }
            else if (selection == 2)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                selection = (4.0 / 3.0) * PI * Math.pow(radius,3);
            }
            else if (selection == 3)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = (1.0 / 3.0) * PI * Math.pow(radius,2) * height;
            }
            else if (selection == 4)
            {
                System.out.printf("%-25s%-2c","Masukkan radius",':');
                radius = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                selection = PI * Math.pow(radius,2) * height;
            }
            else if (selection == 5)
            {
                System.out.printf("%-25s%-2c","Masukkan tinggi",':');
                height = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan sisi pertama",':');
                firstSide = Double.parseDouble(input.nextLine());
                System.out.printf("%-25s%-2c","Masukkan sisi kedua",':');
                secondSide = Double.parseDouble(input.nextLine());
                selection = (1.0 / 3.0) * (firstSide * secondSide) * height;
            }
            else
            {
                System.out.print("\n" + "Pilihan yang anda masukkan salah, silahkan masukkan kembali pilihan anda" + "\n\n");
                inputValid = false;
                continue;
            }
            System.out.printf("%-25s%-2c%.5f\n\n","Hasil",':',selection);
        }
        input.close();
    }
}
```
