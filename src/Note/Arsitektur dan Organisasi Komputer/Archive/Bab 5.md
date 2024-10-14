# Bab 5 Memori Internal

## Jenis Memori

Teknologi RAM dibagi menjadi dua teknologi

- RAM Dinamisd (DRAM)
- RAM Statis (SRAM)

### RAM Dinamis (DRAM)

- Dibuat dengan sel yang menyimpan data sebagai muatan pada kapasitor.
- Ada atau tidaknya muatan dalam kapasitor diartikan sebagai biner 1 atau 0.
- Membutuhkan penyegaran biaya berkala untuk menjaga penyimpanan data.
- Syarat *dinamis* mengacu pada kecenderungan muatan yang disimpan bocor, bahkan dengan daya yang terus menerus diterapkan.

### RAM Statis (SRAM)

- Perangkat digital yang menggunakan elemen logika yang sama digunakan dalam prosesor.
- Nilai biner disimpan menggunakan konfigurasi gerbang logika flip-flop tradisional.
- Akan menyimpan datanya selama daya dipasok ke sana

### SRAM vs DRAM

#### Keduanya volatile

- Listrik harus terus menerus disuplai ke memori untuk mempertahankan nilai bit.

#### Sel Dinamis

- Lebih sederhana untuk dibangun, lebih kecil.
- Lebih padat (sel yang lebih kecil = lebih banyak sel per satuan luas).
- Lebih murah.
- Membutuhkan sirkuit penyegaran pendukung.
- Cenderung dipilih untuk kebutuhan memori yang besar.
- Digunakan untuk memori utama.

#### Sel Statis

- Lebih cepat.
- Digunakan untuk memori cache (baik on dan off chip)

## 1. Jenis Memori Semikonduktor

- **RAM (Random-Access Memory)**: Memori yang dapat diakses secara acak dan bersifat volatil. Terdiri dari:
  - **DRAM (Dynamic RAM)**: Menyimpan data sebagai muatan listrik pada kapasitor, tetapi memerlukan penyegaran terus-menerus.
  - **SRAM (Static RAM)**: Menggunakan konfigurasi gerbang logika flip-flop dan menyimpan data selama ada daya.
- **ROM (Read-Only Memory)**: Memori non-volatile yang hanya bisa dibaca dan berisi data permanen. Varian ROM meliputi:
  - **PROM**: ROM yang dapat diprogram sekali.
  - **EPROM**: Dapat dihapus dengan sinar UV dan diprogram ulang.
  - **EEPROM**: Dapat dihapus dan diprogram ulang secara elektrik.
  - **Flash Memory**: Memori non-volatile yang bisa dihapus dalam blok.

## 2. Perbandingan SRAM dan DRAM

- **SRAM** lebih cepat dan digunakan untuk memori cache.
- **DRAM** lebih padat, lebih murah, dan digunakan untuk memori utama.

## 3. Koreksi Kesalahan

- **Kegagalan Keras**: Kegagalan permanen yang mengakibatkan sel memori tidak dapat berfungsi dengan baik.
- **Kesalahan Lunak**: Kesalahan sementara yang dapat diakibatkan oleh gangguan eksternal, seperti partikel alfa atau masalah daya.

## 4. Teknologi Memori Lainnya

- **SDRAM (Synchronous DRAM)**: Sinkron dengan sinyal jam eksternal, digunakan untuk kecepatan transfer tinggi.
- **DDR SDRAM (Double Data Rate SDRAM)**: Menggunakan kedua tepi sinyal jam untuk meningkatkan kecepatan data.

## 5. Memori Flash

- Digunakan baik untuk memori internal maupun aplikasi eksternal.
- Flash memory terbagi menjadi dua jenis: **NOR** (untuk eksekusi kode) dan **NAND** (untuk penyimpanan file).

## 6. Teknologi Memori Nonvolatile Baru

- **STT-RAM, PCRAM, ReRAM**: Teknologi baru yang menawarkan kinerja tinggi dan daya tahan lebih baik dibandingkan memori tradisional.
