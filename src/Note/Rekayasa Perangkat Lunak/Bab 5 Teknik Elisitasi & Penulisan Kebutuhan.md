# BAB 5 TEKNIK ELISITASI & PENULISAN KEBUTUHAN

## Teknik-teknik Elisitasi

- *Interview*
  - rapat, meeting
  - paling banyak digunakan
  - memerlukan teknik dan kemampuan khusus, perlu persiapan yang matang (pra, proses, paska)
  - Kuisioner bisa digunakan sebagai pengganti jika sumber informasi berada pada lokasi geografis yang berbeda/jauh (opsi: bisa dengan *online meeting*)
  - Pros: informasi lebih dalam dan lengkap digali secara langsung
  - Cons: butuh waktu dan biaya yang cukup besar, beda sumber bisa berbeda informasi
- *Background reading*
  - memahami problem domain (organisasi, orientasi bisnis)
  - *task analysis, company reports, policy manuals, form analysis, job descriptions, documentation of existing systems*
  - Pros: membantu pemahaman sebelum *interview/meeting*
  - Cons: dokumen tertulis mungkin berbeda dengan realitas yang berjalan
- *Ethnography*
  - analisis pekerjaan riil dari *stakeholders*
  - analisis terlibat langsung
- *Observation*
  - mengamati orang dalam menjalankan tugasnya pada lingkungan kerja yang sebenarnya: apa yang dikerjakan, siapa yang mengerjakan, bagaimana dilakukan, berapa lama, ... dst.
  - Pros: bisa mengalami sendiri, data diperoleh secara langsung
  - Cons: tidak setiap orang nyaman untuk diamati, kendala biaya dan waktu (jika orang yang diamati melakukan tugas luar kota)
- *Derivation from the existing system*
  - studi banding dari beberapa sistem lain yang sejenis
- *Prototyping*
  - mulai dari kebutuhan awal untuk lebih memahami kebutuhan yang utuh
- *Questionnaries*
  - menggali informasi melalui pernyataan tertulis: *open-ended* dan *closed-ended questions*
  - pemilihan responded yang tepat dan jumlah yang cukup
  - Pros: ekonomis, jangkauan luas
  - Cons: potensi tidak direspon, kurang bisa menggali aspek-aspek yang lebih luas

## Penulisan Pernyataan Kebutuhan

- Kebutuhan yang baik adalah **SMART**
- **S**pecific
  - Membahas satu aspek yang jelas dari sistem
  - Menyatakan apa (dan kualitas) yang dibutuhkan klien (*what* dan *how well*), bukan solusi (*how*)
- **M**easurable
  - Mampu dilakukan pengujian sehingga terukur
  - Contoh: untuk kerja, ditentukan seberapa cepat (dalam angka) sehingga ukurannya jelas untuk diuji
- **A**chievable
  - Mampu dipenuhi secara rasional (biaya, waktu, teknis)
  - Contoh: karena kendala implementasi, sebuah kebutuhan diabaikan
- **R**elevant
  - Sesuai dengan konteks sitem yang sedang dibahas
  - Contoh: kebutuhan solar cells tidak relevan untuk konteks pesawat ruang angkasa
- **T**raceable
  - Hirariki kebutuhan memeiliki struktur yang jelas: kebutuhan pada level yang lebih rendah (*childeren*) harus berasal dari dan mendukung kebutuhan pada level yang lebih tinggi (*parents*).
  - Kebutuhan yang tidak memiliki induk harus ditinjau ulang
- Requirements have mandatory characteristics:
  - Needed
  - Verifiable
  - Attainable: technically, cost, schedule
- Each requirement should
  - Express one thought
  - Be concise and simple
  - Be stated positively
  - Be gramatically correct; free of typos and misspellings
  - Be understood only one way; they are unambiguous
  - Use consistent terminology to refer to the system/product and its lower level entities
  - Comply with the project's template and style rules
- What a requirement must state
  - WHO is responsible
  - WHAT shall be done
  - Or **HOW WELL** something shall be done
  - Or under what **CONSTRAINTS** something shall be done
- Requirement format: "WHO shall WHAT"
  - Uses active not pasive voice
- Example product requirements:
  - The system shall operate at a power level of ...
  - The software shall acquire data from the ...
  - The structure shall withstand loads of ...
  - The hardware shall have a mass of ...

## Bahasa Kebutuhan

- Using the following key words to indicate different priorities:
  - shall
  - should
  - may
- A typicla form to express capability requirements int the problem domain:

  **The `<stakeholder type>` shall be able to `<capability>`**.

- Associating performance and constraint aspects to a requirement:

  **The `<stakeholder type>` shall be able to `<capability>` within `<performance>` of `<event>` while `<operational condition>`**.

- Example:

  **The weapons operation shall be able to fire a missle within 3 seconds of radar sighting while in severe sea conditions**.

- A typicla constraint requirement takes the following form:

  **The `<stakeholder type>` shall not be placed in breach of `<applicable law>`**.

- Example:

  The ambulance driver shall not be placed in breach of national road regulations.

- A typical form to express function requirements associated with performance and constraint aspects in the solution domain:

  **The `<system>` shall `<function>` not less than `<quantity>` `<object>` while `<operational condition>`**

  Example:

  The communications system shall sustain telephone contact with not less than 10 callers while in absence of external power.

- Introductin a periodicity constraint:

  **The `<system>` shall `<function>` `<object>` every `<performance>` `<units>`**.

  Example:

  The coffee machine shall produce a hot drink every 10 seconds.

## Capturing Constraint Requirements

- Collect all capability requirements first.
- Construct a list of all the different kinds of constraint that may need to be expressed.
  - If this list is based of past experience of the same kind of system, then boilerplates should exist for each kind. Otherwise suitable boiler-plates may have to be defined.
- For each capability, consider each kind of constraint, and determine wheter a constraint needs to be captured.
  - A large table could be useful for this; in each cell, indicate where constraints exist by entering the appropriate sub-ordinate clauses to the requirement; where no constraint is necessary, enter "N/A" in the appropriate cell.
- Select the boilerplate that best matches the constraint to be expressed, and instantiate it.
- The process is finished when every "cell" has been considered.

## Requirement Boilerplates

|Type of Constraint|Boiler-Plate|
|:---|:---|
|Performance/capability|The `<system>` shall be able to `<function>` `<object>` **not less than `<performance>` times per `<units>`**.|
|Performance/capability|The `<system>` shall be able to `<function>` `<object>` **of type `<qualification>` within `<performance>` `<units>`**.|
|Performance/capacity|The `<system>` shall be able to `<function>` **Not less than `<quantity>`** `<object>`|
|Performance/timeliness|The `<system>` shall be able to `<function>` `<object>` **within `<performance>` `<units>` from `<event>`**.|
|Performance/periodicity|The `<system>` shall be able to `<function>` **not less than `<quantity>`** `<object>` **within `<performance>` `<units>`**.|
|Interoperability/capacity|The `<system>` shall be able to `<function>` `<object>` **composed of not less than `<performance>` `<units>` with `<external entity>`**.|
|Sustainability/periodicity|The `<system>` shall be able to `<function>` `<object>` **for `<performance>` `<units>` every `<performance>` `<units>`**.|
|Environmental/operability|The `<system>` shall be able to `<function>` `<object>` **while `<operational condition>`**.|
