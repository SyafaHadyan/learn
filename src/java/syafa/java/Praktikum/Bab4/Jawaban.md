# Bab 4 - Array

## Array 1D

### 1. Jelaskan dan perbaiki jika menemui kesalahan

Kesalahan pada `i+` yang seharusnya `i++`.

### 2. Jalankan kelas `Array1` dan benahi jika menemukan kesalahan

iterasi 10 kali (mulai dari 0 sampai 9) dan elemen ke-`i` dari `bil[]` akan diisi dengan $1+(Random)\space\text{antara}\space0.0\space\text{hingga}\space1.0$ menggunakan `Math.random()` yang akan menggenerate `float` antara `0.0` hingga `1.0` kemudian dikali dengan `100` yang hasilnya di `cast` menjadi `int` yang disimpan pada `bil[i]`.

### 3. Pada baris ketiga, hapus angka `10` kemudian amati apa yang terjadi dan jelaskan

Kode tidak akan bisa berjalan karena ukuran `int[]` tidak diinisialisasi.

### 4. Pada baris 5, kode tersebut diubah menjadi `for (i = 2; i <= 8; i++)` kemudian amati apa yang terjadi dan jelaskan

Karena `i` mulai dari 2 hingga 8, maka `bil[]` hanya akan diisi mulai dari 2 hingga 8 dengan `Math.random() * 100` dan elemen yang lainnya nilainya 0.
