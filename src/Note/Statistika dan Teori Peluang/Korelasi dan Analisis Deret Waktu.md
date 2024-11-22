# Korelasi dan Analisis Deret Waktu

## **1. Korelasi**

### **Pengertian Korelasi**

Korelasi adalah ukuran statistik yang menggambarkan tingkat kekuatan dan arah hubungan antara dua variabel. Korelasi membantu kita memahami sejauh mana perubahan dalam satu variabel terkait dengan perubahan dalam variabel lainnya.

#### **Koefisien Korelasi (r)**

- **Nilai r**: -1 ≤ r ≤ 1.
  - \(r > 0\): Hubungan positif (kedua variabel bergerak searah).
  - \(r < 0\): Hubungan negatif (kedua variabel bergerak berlawanan arah).
  - \(r = 0\): Tidak ada hubungan linier.
- **Rumus Koefisien Korelasi Pearson:**
  \[
  r = \frac{\sum (X_i - \bar{X})(Y_i - \bar{Y})}{\sqrt{\sum (X_i - \bar{X})^2 \sum (Y_i - \bar{Y})^2}}
  \]

#### **Jenis Korelasi**

1. **Korelasi Linier Pearson**:
   - Mengukur hubungan linier antara dua variabel.
   - Cocok untuk data kontinu.
2. **Korelasi Spearman Rank**:
   - Mengukur hubungan monoton, tidak harus linier.
   - Cocok untuk data ordinal.
3. **Autokorelasi**:
   - Mengukur hubungan antara nilai suatu variabel dengan nilai masa lalunya sendiri (lag).

## **2. Analisis Deret Waktu**

### **Pengertian Deret Waktu**

Deret waktu adalah data yang dikumpulkan dalam urutan waktu tertentu, seperti harian, bulanan, atau tahunan. Analisis deret waktu bertujuan untuk memahami pola dalam data dan membuat prediksi untuk masa depan.

### **Langkah-Langkah Analisis Deret Waktu**

#### **1. Visualisasi Data**

- Plot data untuk melihat pola visual.
- Contoh: Grafik garis untuk menganalisis tren naik, turun, atau musiman.

#### **2. Identifikasi Komponen Deret Waktu**

Deret waktu dapat diuraikan menjadi beberapa komponen:

1. **Trend**:
   - Pola umum naik atau turun dalam data, biasanya dalam jangka panjang.
   - Contoh: Kenaikan populasi tahunan.
2. **Seasonal**:
   - Pola berulang dalam periode tertentu (misalnya musiman).
   - Contoh: Penjualan es krim yang meningkat setiap musim panas.
3. **Cyclic**:
   - Fluktuasi yang tidak beraturan tetapi sering terkait dengan siklus ekonomi.
   - Contoh: Resesi ekonomi setiap 7-10 tahun.
4. **Noise (Random)**:
   - Fluktuasi acak yang tidak memiliki pola tertentu.

#### **3. Stasioneritas Data**

- Data deret waktu perlu diuji apakah stasioner (mean dan variansinya konstan sepanjang waktu).
- **Mengapa stasioneritas penting?**
  - Kebanyakan model deret waktu, seperti ARIMA, bekerja dengan asumsi bahwa data stasioner.
- **Tes stasioneritas**:
  - *Augmented Dickey-Fuller Test (ADF)*: Uji statistik untuk mendeteksi stasioneritas.

#### **4. Pemodelan Deret Waktu**

Beberapa model yang sering digunakan:

1. **Model Autoregressive (AR):**
   - Memanfaatkan hubungan antar nilai masa lalu.
   - Contoh: \( Y_t = \phi_1 Y_{t-1} + \phi_2 Y_{t-2} + \epsilon_t \).

2. **Moving Average (MA):**
   - Menggunakan rata-rata dari kesalahan masa lalu.
   - Contoh: \( Y_t = \mu + \theta_1 \epsilon_{t-1} + \theta_2 \epsilon_{t-2} \).

3. **ARIMA (Autoregressive Integrated Moving Average):**
   - Kombinasi AR, MA, dan integrasi untuk data non-stasioner.
   - Notasi: ARIMA(p, d, q), di mana:
     - \(p\): Jumlah lag untuk komponen AR.
     - \(d\): Tingkat differencing untuk stasioneritas.
     - \(q\): Jumlah lag untuk komponen MA.

4. **SARIMA (Seasonal ARIMA):**
   - Memasukkan komponen musiman ke dalam ARIMA.

#### **5. Validasi Model**

- Setelah model dibangun, validasi dilakukan menggunakan data uji atau metrik evaluasi seperti:
  - **Mean Absolute Error (MAE)**
  - **Root Mean Squared Error (RMSE)**
  - **Akaike Information Criterion (AIC)**

### **3. Hubungan Antara Korelasi dan Analisis Deret Waktu**

1. **Autokorelasi dalam Deret Waktu**:
   - Mengukur korelasi antara suatu variabel dengan nilai sebelumnya (lag).
   - **Autocorrelation Function (ACF)**:
     - Menunjukkan autokorelasi pada berbagai lag.
   - **Partial Autocorrelation Function (PACF)**:
     - Menunjukkan autokorelasi langsung pada setiap lag setelah menghilangkan pengaruh lag sebelumnya.

2. **Identifikasi Pola dengan Korelasi**:
   - Korelasi dapat digunakan untuk menentukan hubungan antar variabel dalam deret waktu, misalnya:
     - Apakah perubahan suku bunga memengaruhi inflasi?
     - Apakah nilai mata uang saat ini dipengaruhi oleh nilai masa lalu?

### **Contoh**

Misalkan kita memiliki data bulanan jumlah pengunjung suatu taman selama 5 tahun. Berikut adalah langkah analisis:

1. **Plot Data**:
   - Membuat grafik untuk melihat pola tren dan musiman.
2. **Uji Stasioneritas**:
   - Menggunakan ADF test untuk memastikan apakah data stasioner.
   - Jika tidak, lakukan differencing.
3. **Autokorelasi**:
   - Hitung ACF dan PACF untuk menentukan model ARIMA yang sesuai.
4. **Membangun Model**:
   - Jika ACF menunjukkan autokorelasi signifikan hingga lag 2, gunakan ARIMA(2,1,0).
5. **Evaluasi Model**:
   - Hitung RMSE untuk menilai akurasi prediksi.
