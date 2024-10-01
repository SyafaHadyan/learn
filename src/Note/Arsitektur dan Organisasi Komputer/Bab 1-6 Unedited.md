# Bab 1 - Konsep Dasar dan Evolusi Komputer

## 1. Tujuan Pembelajaran

- Memahami struktur dan fungsi umum dari komputer.
- Menjelaskan evolusi komputer dari generasi ke generasi.
- Menjelaskan evolusi arsitektur Intel x86.
- Menjelaskan konsep **embedded systems** serta batasan-batasan yang terkait.

### 2. **Arsitektur dan Organisasi Komputer**
- **Arsitektur**: Berhubungan dengan atribut sistem komputer yang terlihat oleh programmer, seperti set instruksi, ukuran data, mekanisme I/O, dan teknik pengalamatan memori.
- **Organisasi**: Berhubungan dengan cara berbagai komponen operasional saling berinteraksi, termasuk detail hardware seperti sinyal kontrol dan teknologi memori.

### 3. **Fungsi Komputer**
Ada empat fungsi utama komputer:
- **Pengolahan data (Data Processing)**: Komputer memproses data yang diberikan.
- **Penyimpanan data (Data Storage)**: Komputer menyimpan data dalam jangka pendek (memori) dan jangka panjang (penyimpanan disk).
- **Pemindahan data (Data Movement)**: Data dipindahkan antar komponen, dari dan ke perangkat eksternal.
- **Kontrol (Control)**: Pengaturan ketiga fungsi di atas dilakukan oleh unit kontrol komputer.

### 4. **Struktur Komputer**
Pada komputer single-processor, struktur utamanya terdiri dari:
- **CPU**: Mengatur operasi komputer dan menjalankan pengolahan data.
- **Memori utama (Main Memory)**: Menyimpan data sementara.
- **I/O Devices**: Memindahkan data antara komputer dan perangkat eksternal.
- **Sistem Interkoneksi (System Interconnection)**: Menghubungkan CPU, memori, dan perangkat I/O.

### 5. **Evolusi Komputer**
- **Generasi Pertama (1940-an)**: Komputer berbasis tabung vakum, seperti ENIAC, yang sangat besar dan lambat.
- **Generasi Kedua (1950-an)**: Penggunaan transistor yang lebih kecil dan lebih hemat energi.
- **Generasi Ketiga (1960-an)**: Penggunaan **Integrated Circuit (IC)** yang meningkatkan efisiensi dan mengurangi ukuran.
- **Generasi Keempat (1970-sekarang)**: Era mikroprosesor, dengan chip yang lebih kecil dan cepat seperti Intel 4004 dan 8080.
- **Generasi Selanjutnya**: Pengembangan teknologi seperti **Large Scale Integration (LSI)** dan **Very Large Scale Integration (VLSI)** serta evolusi mikroprosesor Intel x86.

### 6. **Sistem Tertanam (Embedded Systems)**
- **Embedded Systems** adalah sistem komputer yang tertanam dalam perangkat yang lebih besar, dengan batasan waktu nyata.
- Digunakan dalam perangkat sehari-hari seperti smartphone, sistem otomotif, dan sensor.

### 7. **Cloud Computing**
- Model komputasi berbasis awan memungkinkan akses jaringan yang cepat dan mudah ke sumber daya komputasi bersama.
- Memungkinkan skala fleksibel dan metode pembayaran berbasis penggunaan tanpa kontrak jangka panjang.

### 8. **Arsitektur Intel x86 dan ARM**
- **Intel x86**: Desain prosesor **CISC (Complex Instruction Set Computers)** yang digunakan pada komputer kelas atas.
- **ARM**: Desain prosesor **RISC (Reduced Instruction Set Computers)** yang lebih hemat daya dan digunakan di banyak perangkat mobile.

File ini mencakup banyak informasi penting yang berhubungan dengan sejarah dan perkembangan komputer, terutama berfokus pada arsitektur komputer dan organisasi hardware, serta evolusi teknologi dari generasi ke generasi hingga konsep-konsep modern seperti **Cloud Computing** dan **IoT (Internet of Things)**【8†source】.

# Bab 2 - Performance Issues and Top Level View of Computer Function

### 1. **Tujuan Pembelajaran**
- Mahasiswa diharapkan mampu menjabarkan arsitektur dan organisasi dari prosesor (CPU) pada komputer.
- Mahasiswa juga harus memahami hubungan antara arsitektur dan organisasi pada komputer dengan kinerja (performance)-nya.

### 2. **Komponen-Komponen Komputer**
Menurut arsitektur Von Neumann, komponen utama hardware komputer terdiri dari tiga elemen:
- **CPU (Central Processing Unit)**: Bertanggung jawab atas eksekusi instruksi, termasuk unit kontrol (CU) dan unit aritmatika logika (ALU).
- **Memori**: Menyimpan data sementara yang dibutuhkan untuk menjalankan program.
- **I/O Module**: Memasukkan data ke sistem dan menampilkan hasilnya.

### 3. **Siklus Instruksi**
- Siklus dasar instruksi melibatkan beberapa tahap: perhitungan alamat instruksi, pengambilan instruksi, decoding instruksi, perhitungan alamat operand, pengambilan operand, operasi data, dan penyimpanan hasil operand.

### 4. **Interrupts**
- Interrupt memungkinkan modul I/O atau memori untuk menginterupsi proses normal CPU. Ada mekanisme yang menangani interupsi ini, memungkinkan CPU menangani operasi lain sementara menunggu tugas lain selesai.
- Setelah penanganan interrupt selesai, prosesor melanjutkan eksekusi instruksi pada titik interupsi tersebut.

### 5. **Struktur Interkoneksi**
- Sistem komputer merupakan jaringan dari modul-modul (prosesor, memori, I/O) yang dihubungkan melalui jalur atau bus. Struktur interkoneksi ini mendefinisikan cara komunikasi antara berbagai modul tersebut.
- Terdapat beberapa skema transfer data antara prosesor, memori, dan perangkat I/O seperti transfer memori ke prosesor, I/O ke prosesor, dan Direct Memory Access (DMA) yang memungkinkan transfer data langsung antara memori dan I/O tanpa intervensi CPU.

### 6. **Bus Interconnection Scheme**
- Sistem komputer menggunakan beberapa jenis bus yang menghubungkan komponen pada berbagai tingkat hirarki.
- **Data Bus**: Mengangkut data antar komponen, semakin lebar bus (misalnya 32, 64 bit), semakin banyak data yang bisa ditransfer dalam satu waktu.
- **Address Bus**: Digunakan untuk menentukan alamat sumber atau tujuan data. Lebar bus ini menentukan kapasitas memori maksimum.
- **Control Bus**: Mengontrol akses dan penggunaan data dan address bus, mengirimkan sinyal perintah dan sinyal waktu.

### 7. **Masalah Performa (Performance Issues)**
- Salah satu faktor utama dalam peningkatan performa adalah hukum Moore, yang menyatakan bahwa jumlah transistor pada sebuah chip meningkat dua kali lipat setiap 18 bulan. Konsekuensi dari hukum ini adalah penurunan biaya dan peningkatan kecepatan komputer, serta ukuran yang semakin kecil.
- **Microprocessor Speed**: Kecepatan prosesor meningkat melalui teknik seperti pipelining, branch prediction, data flow analysis, dan speculative execution. Teknik ini memungkinkan prosesor untuk melakukan beberapa tahap pemrosesan secara paralel dan menjalankan instruksi secara spekulatif sebelum benar-benar dibutuhkan.

### 8. **Generasi LSI dan VLSI**
- Teknologi **LSI (Large Scale Integration)** dan **VLSI (Very Large Scale Integration)** memungkinkan integrasi lebih dari ribuan komponen pada satu chip, yang selanjutnya meningkatkan efisiensi dan kinerja komputer.

File ini mencakup poin-poin penting mengenai arsitektur komputer, interkoneksi modul, siklus instruksi, manajemen interupsi, serta faktor-faktor yang mempengaruhi performa komputer, terutama seputar peningkatan performa melalui desain prosesor dan penggunaan teknologi bus【14†source】.




Berikut adalah penjelasan rinci dari isi file berjudul **Bab 3 - Processor Structure and Function** untuk mata kuliah **Arsitektur dan Organisasi Komputer**:

### 1. **Tujuan Pembelajaran**
- Mahasiswa diharapkan mampu menjabarkan arsitektur dan organisasi dari prosesor (CPU) pada komputer.
- Mempelajari komponen-komponen prosesor, siklus instruksi, serta konsep **instruction pipeline**.

### 2. **Struktur Prosesor**
Prosesor (CPU) terdiri dari beberapa komponen penting:
- **ALU (Arithmetic and Logic Unit)**: Menjalankan fungsi aritmatika dan logika untuk memproses data.
- **Control Unit (CU)**: Mengontrol operasi prosesor serta sinkronisasi kerja antara komponen-komponen di dalam komputer.
- **Registers**: Penyimpanan internal CPU yang digunakan saat memproses data.

### 3. **Organisasi Register**
- **User-visible Register**: Register yang dapat digunakan oleh programmer untuk meminimalkan referensi ke memori utama. Contoh:
  - **General Purpose Register**: Digunakan untuk berbagai fungsi pemrograman yang lebih fleksibel.
  - **Data Register**: Digunakan untuk menyimpan data, tetapi tidak bisa digunakan untuk kalkulasi atau alamat operand.
  - **Address Register**: Digunakan untuk pengalamatan dalam instruksi.
  - **Condition Codes**: Set kondisi biner yang diatur setelah operasi aritmatika atau logika.
- **Control & Status Register**: Digunakan oleh unit kontrol untuk mengontrol operasi CPU. Contoh:
  - **Program Counter (PC)**: Menyimpan alamat instruksi berikutnya yang akan diambil.
  - **Instruction Register (IR)**: Menyimpan instruksi yang sedang dieksekusi.
  - **Memory Address Register (MAR)**: Menyimpan alamat dari lokasi memori yang sedang diakses.
  - **Memory Buffer Register (MBR)**: Menyimpan data yang akan ditulis atau telah dibaca dari memori.

### 4. **Siklus Instruksi**
Siklus instruksi melibatkan beberapa tahap:
- **Fetch**: Mengambil instruksi dari memori ke dalam prosesor.
- **Decode**: Menafsirkan opcode dan menentukan operasi yang akan dilakukan.
- **Execute**: Menjalankan operasi berdasarkan instruksi.
- **Interrupt**: Jika ada interupsi, CPU akan menyimpan status saat ini dan menangani interupsi.

Proses ini berulang untuk setiap instruksi dalam program yang dieksekusi oleh CPU.

### 5. **Pipeline Instruksi**
Pipeline adalah teknik di mana prosesor melaksanakan beberapa instruksi secara paralel dalam berbagai tahap eksekusi yang berbeda. Pipeline dibagi menjadi beberapa tahap seperti:
- **Fetch Instruction (FI)**: Membaca instruksi dari memori ke buffer.
- **Decode Instruction (DI)**: Menafsirkan opcode dan menentukan operand.
- **Calculate Operand (CO)**: Menghitung alamat operand yang efektif.
- **Fetch Operand (FO)**: Mengambil operand dari memori.
- **Execute Instruction (EI)**: Melaksanakan instruksi dan menyimpan hasilnya.
- **Write Operand (WO)**: Menyimpan hasil ke memori.

Pipeline meningkatkan efisiensi prosesor dengan memungkinkan beberapa instruksi dieksekusi bersamaan, namun pada tahap yang berbeda.

### 6. **Alur Data (Data Flow)**
Terdapat beberapa siklus alur data yang berbeda:
- **Fetch Cycle**: Alur data dimulai dari mengambil instruksi dari memori.
- **Indirect Cycle**: Jika instruksi menggunakan alamat tidak langsung, CPU harus mengambil alamat operand.
- **Interrupt Cycle**: Jika ada interupsi, CPU menghentikan eksekusi instruksi saat ini untuk menangani interupsi tersebut.

Secara keseluruhan, file ini memberikan gambaran mendalam tentang struktur internal dan fungsi dari prosesor, termasuk organisasi register, siklus instruksi, dan konsep pipeline yang penting untuk memahami cara kerja CPU【21†source】.




Berikut adalah penjelasan rinci dari isi file **Bab 4 - Cache Memory** untuk mata kuliah **Arsitektur dan Organisasi Komputer**:

### 1. **Karakteristik Sistem Memori**
- Memori komputer memiliki berbagai jenis dengan karakteristik seperti lokasi, kapasitas, metode akses, dan kecepatan.
- Memori dapat bersifat **internal** (register, cache, memori utama) atau **eksternal** (disk magnetik, disk optik).
- Metode akses data dalam memori dapat berupa **sekuensial**, **langsung**, **acak**, atau **asosiatif**. Memori cache sering kali menggunakan akses asosiatif.

### 2. **Kapasitas dan Kinerja Memori**
- **Waktu akses**: Waktu yang dibutuhkan untuk membaca atau menulis data di memori.
- **Siklus memori**: Waktu akses ditambah waktu tambahan yang diperlukan sebelum akses berikutnya bisa dimulai.
- **Tingkat transfer**: Kecepatan data dipindahkan dari atau ke unit memori, yang menentukan kinerja keseluruhan sistem.

### 3. **Hirarki Memori**
- Hirarki memori dibangun berdasarkan trade-off antara kapasitas, waktu akses, dan biaya.
- Semakin cepat waktu akses, semakin mahal biaya per bit. Semakin besar kapasitas, semakin murah biaya per bit tetapi waktu akses lebih lambat.
- Penggunaan cache dalam hirarki memori mempercepat akses data dengan menyimpan data yang sering digunakan lebih dekat ke CPU.

### 4. **Memori Cache**
- **Cache** adalah memori berkecepatan tinggi yang menyimpan salinan data yang sering diakses dari memori utama.
- Memori cache meningkatkan performa dengan mengurangi waktu yang dibutuhkan CPU untuk mengakses data.
- Cache dapat memiliki beberapa level, seperti **L1 (level 1)** yang lebih cepat dan dekat dengan CPU, **L2**, dan bahkan **L3**, tergantung pada desain sistem.

### 5. **Struktur dan Operasi Cache**
- Ketika CPU memerlukan data, cache pertama kali diperiksa. Jika data ada di cache (**hit**), CPU mengambil data langsung dari cache. Jika tidak ada (**miss**), data diambil dari memori utama dan disimpan ke cache.
- Tiga metode pemetaan cache:
  - **Pemetaan langsung**: Setiap blok memori hanya bisa dipetakan ke satu baris di cache.
  - **Pemetaan asosiatif**: Setiap blok memori dapat dipetakan ke baris mana saja di cache.
  - **Pemetaan set-asosiatif**: Blok memori dapat dipetakan ke salah satu baris dalam set cache tertentu.

### 6. **Algoritma Penggantian Cache**
- Ketika cache penuh dan blok baru perlu dimasukkan, blok lama harus diganti. Algoritma penggantian umum meliputi:
  - **Least Recently Used (LRU)**: Mengganti blok yang paling lama tidak diakses.
  - **First-In-First-Out (FIFO)**: Mengganti blok yang paling lama berada di cache.
  - **Least Frequently Used (LFU)**: Mengganti blok yang paling jarang diakses.

### 7. **Kebijakan Penulisan Cache**
- **Write-through**: Setiap penulisan ke cache juga langsung ditulis ke memori utama. Ini sederhana tetapi menyebabkan lalu lintas memori yang tinggi.
- **Write-back**: Data hanya ditulis ke memori utama saat blok tersebut digantikan. Ini lebih efisien tetapi lebih kompleks.

### 8. **Cache Multilevel**
- Cache multilevel (L1, L2, L3) memanfaatkan cache on-chip dan off-chip untuk mengurangi waktu akses dan meningkatkan performa.
- Cache L1 sering dibagi menjadi cache instruksi dan data untuk meningkatkan efisiensi akses selama eksekusi instruksi.

### 9. **Cache Pentium 4**
- Prosesor seperti **Pentium 4** menggunakan cache multilevel dengan L1, L2, dan L3, serta teknik seperti pemisahan cache instruksi dan data untuk meningkatkan efisiensi eksekusi.

### 10. **Prinsip Desain Cache**
- Desain cache mencakup beberapa elemen penting seperti ukuran cache, fungsi pemetaan, algoritma penggantian, kebijakan penulisan, dan ukuran garis cache.
- Cache multilevel dan pemisahan cache instruksi dan data sangat penting dalam meningkatkan kinerja sistem.

Secara keseluruhan, file ini membahas prinsip dasar memori cache, bagaimana cache diimplementasikan dalam hirarki memori, teknik optimasi seperti pemetaan cache, serta bagaimana penggunaan cache dapat meningkatkan performa komputer secara signifikan【29†source】.

