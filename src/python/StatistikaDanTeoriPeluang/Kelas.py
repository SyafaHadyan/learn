#Pengelompokan Data dengan Sturtges
import numpy as np
import pandas as pd
import statistics
import math

# Data tunggal
data = [5.3, 12.7, 17.2, 24.6, 45.4, 64.1, 75.9, 85.6, 95.3, 100.2, 110.5, 120.2, 125.4]

# Data Berkelompok
# Langkah 1: Menghitung jumlah kelas menggunakan rumus Sturges
N = len(data)
k = 1 + 3.322 * math.log10(N)
k = int(math.ceil(k))  

print('Data : ',data)
print('Banyak kelas :',k)
# Langkah 2: Menghitung rentang data
data_min    = min(data)
data_max    = max(data)
data_range  = data_max - data_min
data_rerata = statistics.mean(data)
data_var    = statistics.variance(data)

print('Banyak data : ',len(data))
print('\nInfo data Tunggal : ')
print('Nilai minimum  : ',data_min)
print('Nilai maksimum : ',data_max)
print('Nilai mean     : ',round(data_rerata,5))
print('Nilai Varian   : ',round(data_var,5))

# Langkah 3: Menghitung lebar kelas
class_width = math.ceil(data_range / k)  
print('Lebar Kelas : ',round(class_width,5))
# Langkah 4: Membuat kelas dan mengelompokkan data
bins = [data_min + i * class_width for i in range(k + 1)]  

labels = [f'{bins[i]} - {bins[i+1]}' for i in range(k)]    

# Menggunakan pandas untuk mengelompokkan data
df = pd.DataFrame(data, columns=['Data'])
df['Kelas'] = pd.cut(df['Data'], bins=bins, labels=labels, include_lowest=True)
kelas = df['Kelas']