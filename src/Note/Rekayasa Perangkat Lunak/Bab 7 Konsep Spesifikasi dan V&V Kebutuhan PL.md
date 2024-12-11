# BAB 7 KONSEP SPESIFIKASI DAN V&V KEBUTUHAN PL

## Requirement Specification

### Spesifikasi Kebutuhan (*s/w req. specification*)

- Idealnya, kebutuhan harus jelas, tidak ambigu, mudah dipahami, lengkap, dan konsisten.
- Dalam prakiknya, hal ini **hampir mustahil** untuk dicapai.
- Pemangku kepentingan menafsirkan kebutuhan dengan cara yang berbeda-beda, dan seringkali terdapat knoflik dan inkonsistensi yang melekat dalam kebutuhan tersebut.

#### Definisi

Proses unutk menjelaskan kebutuhan PL yang telah didefinisikan sebelumnya secara **lebih detil dan tepat** yang akan menjadi dasar bagi perancangan dan implementasi

#### Notasi

- Kalimat bahasa natural
- Bahasa natural terstruktur (template)
- Pemodelan dengan grafis/diagram -> use case diagram
- Pemodelan formal dengan notasi matematika

## User vs System Requirements

**User requirements** are statements, in a natural language plus diagrams, of what services the system is expected to provide to system users and the constrains under which it must operate.

**System requirements** are move **detailed description** of the software system's functions, services, and operational constraints.

### User Requirements Definition

1\. The Mentcare systemc shall generate monthly management reports showing the cost of drugs prescribed by each clinic during that month.

### System requirements specification

1.1\. On the last working day of each month, a summary of the drugs prescribed, their cost and the prescribing clinics shall be generated.

1.2\. The system shall generate the report for printing after 17.30 on the last working day of the month.

1.3\. A report shall be created for each clinic and shall list the individual drug names, the total number of prescriptions, the number of doses prescribed and the total cost of the prescribed drugs.

1.4\. If drugs are available in different dose units (e.g. 10mg, 20mg, etc.) separate reports shall be created for each dose unit.

1.5\. Access to drug cost reports shall be restricted to authorized users as listed on a management access control list.

## Contoh Spesifikasi Kebutuhan

- Definisi kebutuhan (*req. definition*)

  1\. PL harus mampu menyediakan sarana untuk menampilkan dan mengakses file-file yang dibuat oleh tool yang lain. (SRS_PRJ_100)

- Spesifikasi kebutuhan (*req. specification*)

  1.1\. Pengguna harus disediakan fasilitas untuk mendefinisikan tipe file.

  (SRS_PRJ_101)

  1.2\. Setiap tipe file direpresentasikan denga ikon tertentu pada layar pengguna.

  (SRS_PRJ_102)

## Validasi dan Verifikasi

### Validasi & verifikasi kebutuhan (*s/w req. validation and verification*)

- Proses pengecekan untuk menjamin bahwa pernyataan kebutuhan yang telah didefinisikan dan dispesifikasikan adalah benar, akurat, dan lengkap.
- Dilakukan bersama-sama antara kustomer dan developer
- Sangat penting dilakukan karena kesalahan di dalam menentukan kebutuhan akan berdampak pada keseluruhan proses yang mengikutinya

- Validasi: ***do we make the right product ...?***
- Verifikasi: ***do we make the product right ...?***
- Teknik:
  - *Review*: *Software Specification Review (SSR)*
  - *Prototyping*: *executable model of the system/software*

## Parameter

- Parameter validasi:
  - ***Validity*** -> *does the system provide the functions which best support the customer's needs ?*
  - ***Consistency*** -> *are there any requirements conflicts ?*
  - ***Comprehensibility*** -> *are all the functions required by the customer included ?*
- Parameter verifikasi:
  - ***Readability***
  - ***Completeness***
  - ***Ambiguity***
  - ***Testability***
  - ***Indentifiability***
