# Jawaban

## Looping For

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

## Looping While

### 5. Jelaskan dan perbaiki jika menemui kesalahan

Kode akan berjalan dan akan memasuki `do-while` loop kemudian `println nilai` dan `increment` `nilai`, jika `nilai <= 10`, program akan terus berjalan hingga `nilai = 10`.

### 6. Setelah mengamati hasil keluaran, sebutkan perbedaan looping dengan menggunakan `for` dan `while`

looping menggunakan `for` akan dijalankan jika `InitializationExpression` dan `LoopCondition` memenuhi. Sedangakn `do-while` akan dijalankan paling tidak sekali dan akan dicek di akhir. Sedangkan `while` akan dilakukan pengecekan di awal dan harus ada nilai yang membuat loop berhenti di dalam `while`, kalau tidak, akan terjadi `infinite loop`.

### 7. Hapus statemen `nilai++` pada baris 6 kemudian amati yang terjadi dan jelaskan

Jika dihapus, `nilai` akan terus berada di `1` dan kode akan looping tanpa berhenti karena `nilai <= 10`.

### 8. Ubah syntaks di atas untuk membuat deret angka kelipatan 2

Jawaban ada di source code `N08LoopingWhile.java`.
