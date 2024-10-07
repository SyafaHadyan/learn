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

Kode akan dijalankan dan set `nilai = 1`, jika `nilai = 5`, `break` dan keluar, jika tidak, `println nilai`. `For-loop` kedua jika `nilai = 5`, maka continue dan skip kode dibawahnya dan lanjut loop.

### Output

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
