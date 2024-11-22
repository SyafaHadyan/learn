# Penjelasan

## `main` `Method`

Input banyak mahasiswa kemudian buat `Array` 2d yang akan diisi di dalam `for` loop yang menggunakan `input.nextLine()` kemudian di split spasi (`\s` -> regex). Panggil `setStudentData()` dengan mengirimkan `array` tadi. Kemudian panggil `getStudentAboveAverage()` yang disimpan di `array` `studentAboveAverageAmount`

### Penjelasan isi dari `studentAboveAverageAmount`

|Elemen ke-n|Penjelasan|
|:---:|:---|
|0|Indikator jumlah siswa yang ada di atas rata-rata (Data disimpan sebagai `String`)|
|1|Nama mahasiswa yang di atas rata-rata|
|n|Nama mahasiswa yang di atas rata-rata|

`printf` Rata-rata kemudian diikuti dengan `getAverage()` kemudian `print` Praktikan di atas rata-rata yang dilanjutkan dengan `print` nama setiap mahasiswa yang ada di atas rata-rata.

## `Student` `Class`

### `setStudentData()`

Digunakan untuk set nilai dari `String[][] studentDataGrade`

### `getAverage()`

`for` loop (batas hingga banyak mahasiswa) yang menghitung total nilai keseluruhan mahasiswa yang disimpan di `totalGrade` yang kemudian nilai `average` dihitung (harus dibagi dengan 2 begitu juga di `getStudentAboveAverage()` yang harus dikalikan dengan 2 karena pemanggilan `getAverage()` di `getStudentAboveAverage()` harus dilakukan, jika tidak, nilai dari `average` saat di `getStudentAboveAverage()` adalah `0` yang menyebabkan seluruh mahasiswa masuk ke daftar di atas rata-rata)

### `getStudentAboveAverage()`

### `sortStudentGrade()`
