# Bab 2 - Performance Issues and Top Level View of Computer Function

## 1. Tujuan Pembelajaran

- Mahasiswa diharapkan mampu menjabarkan arsitektur dan organisasi dari prosesor (CPU) pada komputer.
- Mahasiswa juga harus memahami hubungan antara arsitektur dan organisasi pada komputer dengan kinerja (performance)-nya.

## 2. Komponen-Komponen Komputer

Menurut arsitektur Von Neumann, komponen utama hardware komputer terdiri dari tiga elemen:

- **CPU (Central Processing Unit)**: Bertanggung jawab atas eksekusi instruksi, termasuk unit kontrol (CU) dan unit aritmatika logika (ALU).
- **Memori**: Menyimpan data sementara yang dibutuhkan untuk menjalankan program.
- **I/O Module**: Memasukkan data ke sistem dan menampilkan hasilnya.

## 3. Siklus Instruksi

- Siklus dasar instruksi melibatkan beberapa tahap: perhitungan alamat instruksi, pengambilan instruksi, decoding instruksi, perhitungan alamat operand, pengambilan operand, operasi data, dan penyimpanan hasil operand.

## 4. Interrupts

- Interrupt memungkinkan modul I/O atau memori untuk menginterupsi proses normal CPU. Ada mekanisme yang menangani interupsi ini, memungkinkan CPU menangani operasi lain sementara menunggu tugas lain selesai.
- Setelah penanganan interrupt selesai, prosesor melanjutkan eksekusi instruksi pada titik interupsi tersebut.

## 5. Struktur Interkoneksi

- Sistem komputer merupakan jaringan dari modul-modul (prosesor, memori, I/O) yang dihubungkan melalui jalur atau bus. Struktur interkoneksi ini mendefinisikan cara komunikasi antara berbagai modul tersebut.
- Terdapat beberapa skema transfer data antara prosesor, memori, dan perangkat I/O seperti transfer memori ke prosesor, I/O ke prosesor, dan Direct Memory Access (DMA) yang memungkinkan transfer data langsung antara memori dan I/O tanpa intervensi CPU.

## 6. Bus Interconnection Scheme

- Sistem komputer menggunakan beberapa jenis bus yang menghubungkan komponen pada berbagai tingkat hirarki.
- **Data Bus**: Mengangkut data antar komponen, semakin lebar bus (misalnya 32, 64 bit), semakin banyak data yang bisa ditransfer dalam satu waktu.
- **Address Bus**: Digunakan untuk menentukan alamat sumber atau tujuan data. Lebar bus ini menentukan kapasitas memori maksimum.
- **Control Bus**: Mengontrol akses dan penggunaan data dan address bus, mengirimkan sinyal perintah dan sinyal waktu.

## 7. Masalah Performa (Performance Issues)

- Salah satu faktor utama dalam peningkatan performa adalah hukum Moore, yang menyatakan bahwa jumlah transistor pada sebuah chip meningkat dua kali lipat setiap 18 bulan. Konsekuensi dari hukum ini adalah penurunan biaya dan peningkatan kecepatan komputer, serta ukuran yang semakin kecil.
- **Microprocessor Speed**: Kecepatan prosesor meningkat melalui teknik seperti pipelining, branch prediction, data flow analysis, dan speculative execution. Teknik ini memungkinkan prosesor untuk melakukan beberapa tahap pemrosesan secara paralel dan menjalankan instruksi secara spekulatif sebelum benar-benar dibutuhkan.

## 8. Generasi LSI dan VLSI

- Teknologi **LSI (Large Scale Integration)** dan **VLSI (Very Large Scale Integration)** memungkinkan integrasi lebih dari ribuan komponen pada satu chip, yang selanjutnya meningkatkan efisiensi dan kinerja komputer.
