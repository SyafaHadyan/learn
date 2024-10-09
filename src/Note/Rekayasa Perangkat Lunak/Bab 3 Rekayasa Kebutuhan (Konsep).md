# BAB 3 REKAYASA KEBUTUHAN (KONSEP)

## Pengertian Kebutuhan

### R.J Abott

Setiap fungsi, batasan, atau properti lainnya yang harus disediakan, dimiliki atau dipenuhi untuk mencapai kebutuhan dari sistem yang dimaksudkan oleh pengguna.

### CMMI (Capability Maturity Model Integration) version 1.3

- (i) A condition or capability needed by a user to solve a problem or achieve an objective,
- (ii) A condition or capability that must be met/possessed by a product, service, product component or service component to satisfy a supplier agreement, standard, specification or other formally imposed documents,
- A documented representation of a condition or a capability as in (i) or (ii) above.

### IEEE

- Suatu kondisi atau kemampuan yang dibutuhkan oleh pengguna untuk menyelesaikan permasalahan atau untuk mencapai sebuah tujuan.
- Sebuah kondisi atau kemampuan yang harus dipenuhi atau dimiliki oleh sebuah sistem, untuk memenuhi sebuah kontrak, standard, spesifikasi, atau dokumen-dokumen formal lainnya.
- A statement that identifies a product or process operational, functional, or design characteristic or constraint, which is unambiguous, testable or measurable, and necessary for product or process acceptability (by consumers or internal quality assurance guidelines) (IEEE-STD-1220-1998).

## Requirements Statements

Requirements are often written in **natural language** (e.g., English, Bahasa).
Natural language is inherently **ambiguous**.
A natural language SRS should be **reviewed** by an independent party to identify ambiguous use of language so that it can be corrected.

## User vs System Requirements

**User requirements** are statements, in a natural language plus diagrams, of what services the system is expected to provide to system users and the constraints under which it must operate.

**System requirements** are more detailed descriptions of the software system’s functions, services, and operational constraints.

### Contoh Requirements

![User vs System Requirements](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/UserVSSystemRequirements.png)

## Kategori Kebutuhan

### Functional (what a system does)

- deskripsi proses, masukan dan keluaran

### Non-functional (constraint or quality of a system)

- performance
- availability
- security
- reliability
- implementation & design constraints
- storage size

### Usability (constraint to use)

- Acceptance criteria
- end-user characteristics
- system environments

## Level Kebutuhan

### Normal Requirement

- Kebutuhan yang harus dipenuhi dan dinyatakan secara eksplisit
- Fungsionalitas sistem, unjuk kerja

### Expected Requirement

- Kebutuhan yang tidak dinyatakan secara eksplisit tetapi menentukan kepuasan customer
- Kemudahan interaksi dengan sistem, correctness

### Exciting Requirement

- Kebutuhan yang melebihi dari kebutuhan normal untuk lebih memuaskan customer
- Fungsionalitas tambahan sistem

## Pengertian Rekayasa Kebutuhan

### RE – requirements engineering (istilah lain dari requirements analysis)

> The process of establishing the services that the customer requires from a system and the constraints under which it operates and is developed

[Ian Sommerville]

### Each software development process goes through the phase of RE

> The broad spectrum of tasks and techniques that lead to an understanding of requirements

[Roger S. Pressman]

## Fungsi Rekayasa Kebutuhan

Requirements form the basis for:

![Fungsi Rekayasa Kebutuhan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/FungsiRekayasaKebutuhan.png)

## Proses Rekayasa Kebutuhan

- Penggalian dan analisis kebutuhan (*s/w req. elicitation and analysis*)
- Spesifikasi kebutuhan (*s/w req. specification*)
- Validasi & verifikasi kebutuhan (*s/w req. validation and verification*)
- Manajemen kebutuhan (*s/w req. management*)

### Requirement Elicitation & Analysis

#### Penggalian dan analisis kebutuhan (*s/w req. elicitation and analysis*)

![Penggalian dan Analisis Kebutuhan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/PenggalianDanAnalisisKebutuhan.png)

#### Spesifikasi kebutuhan (*s/w req. specification*)

![Spesifikasi Kebutuhan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/SpesifikasiKebutuhan.png)

#### Validasi & verifikasi kebutuhan (*s/w req. validation and verification*)

![Validasi & Verifikasi Kebutuhan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/ValidasiDanVerifikasiKebutuhan.png)

#### Manajemen kebutuhan (*s/w req. management*)

![Manajemen Kebutuhan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/ManajemenKebutuhan.png)

## Permasalahan dalam Rekayasa Kebutuhan

### Organizational-based

- Lack of customer and user communication
- Lack of developer communication
- Lack of training
- Inappropriate skills
- Lack of defined responsibility
- Unstable workforce (low staff retention)
- Poor time and resource allocations

### RE Proces-based

- Complexity of application
- Undefined RE process
- The actual requirements
- Poor user understanding
- Incomplete requirements
- Inconsistent (changing) requirements
- Indadequate requirements traceability
- Ambiguous requirements

## Konsep Pemodelan

- A model is a **simplification** of reality.
- A model provides the blueprints of a system (Grady Booch)

![Konsep Pemodelan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/KonsepPemodelan.png)

## Mengapa Pemodelan?

- Modelling achieves four aims:
- Helps you **to visualize a system** as you want it to be.
- Permits you **to specify the structure or behavior** of a system.
- Gives you a **template that guides** you in constructing a system.
- **Documents** the decisions you have made.

## Konsep Pemodelan Kebutuhan

![Konsep Pemodelan](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/KonsepPemodelanKebutuhan.png)

## Tujuan Utama Model Kebutuhan

- Menjelaskan apa yang dibutuhkan oleh customer
- Menjadi dasar bagi perancangan PL
- Menjadi referensi dalam melakukan validasi kebutuhan

## Prinsip Pemodelan Kebutuhan

- Model yang dibuat harus fokus pada kebutuhan yang relevan dengan domain permasalahan -> **WHAT**
- Setiap model kebutuhan harus bisa dilacak ke model perancangan -> **traceability**
- Setiap elemen dalam model kebutuhan harus mampu memperjelas pemahaman secara utuh terhadap kebutuhan PL -> domain masalah, fungsionalitas dan perilaku sistem
- Minimalisasi kopling -> antar klas
- Memastikan bahwa model kebutuhan memiliki nilai manfaat untuk seluruh *stakeholders*
- Model dibuat sesederhana mungkin -> notasi yang sederhana, non duplikasi informasi.
