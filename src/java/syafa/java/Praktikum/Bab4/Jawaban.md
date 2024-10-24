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
