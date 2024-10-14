# Bab 3 - Processor Structure and Function

## 1. Tujuan Pembelajaran

- Mahasiswa diharapkan mampu menjabarkan arsitektur dan organisasi dari prosesor (CPU) pada komputer.
- Mempelajari komponen-komponen prosesor, siklus instruksi, serta konsep **instruction pipeline**.

## 2. Struktur Prosesor

Prosesor (CPU) terdiri dari beberapa komponen penting:

- **ALU (Arithmetic and Logic Unit)**: Menjalankan fungsi aritmatika dan logika untuk memproses data.
- **Control Unit (CU)**: Mengontrol operasi prosesor serta sinkronisasi kerja antara komponen-komponen di dalam komputer.
- **Registers**: Penyimpanan internal CPU yang digunakan saat memproses data.

## 3. Organisasi Register

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

## 4. Siklus Instruksi

Siklus instruksi melibatkan beberapa tahap:

- **Fetch**: Mengambil instruksi dari memori ke dalam prosesor.
- **Decode**: Menafsirkan opcode dan menentukan operasi yang akan dilakukan.
- **Execute**: Menjalankan operasi berdasarkan instruksi.
- **Interrupt**: Jika ada interupsi, CPU akan menyimpan status saat ini dan menangani interupsi.

Proses ini berulang untuk setiap instruksi dalam program yang dieksekusi oleh CPU.

## 5. Pipeline Instruksi

Pipeline adalah teknik di mana prosesor melaksanakan beberapa instruksi secara paralel dalam berbagai tahap eksekusi yang berbeda. Pipeline dibagi menjadi beberapa tahap seperti:

- **Fetch Instruction (FI)**: Membaca instruksi dari memori ke buffer.
- **Decode Instruction (DI)**: Menafsirkan opcode dan menentukan operand.
- **Calculate Operand (CO)**: Menghitung alamat operand yang efektif.
- **Fetch Operand (FO)**: Mengambil operand dari memori.
- **Execute Instruction (EI)**: Melaksanakan instruksi dan menyimpan hasilnya.
- **Write Operand (WO)**: Menyimpan hasil ke memori.

Pipeline meningkatkan efisiensi prosesor dengan memungkinkan beberapa instruksi dieksekusi bersamaan, namun pada tahap yang berbeda.

## 6. Alur Data (Data Flow)

Terdapat beberapa siklus alur data yang berbeda:

- **Fetch Cycle**: Alur data dimulai dari mengambil instruksi dari memori.
- **Indirect Cycle**: Jika instruksi menggunakan alamat tidak langsung, CPU harus mengambil alamat operand.
- **Interrupt Cycle**: Jika ada interupsi, CPU menghentikan eksekusi instruksi saat ini untuk menangani interupsi tersebut.
