# qe_cynthia-veronika-pardede
## **Section 22**<br><br>
### **Fundamental Performance Test**<br><br>

Performance Test adalah teknik non fungsional testing untuk menentukan parameter sistem dalam hal responsif dan disabilitas dibalik berbagai load kerja.  Mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan dan penggunaan resource. Hasil pengujian biasanya berupa number of virtualize, section per second. <br><br>

**Apa Yang Diukur Dari Performance Test?**<br>
Performa suatu aplikasi sampai suatu batas tertentu. • Bukan merupakan functional-test
Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada environment-nya. contoh:
Mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak
Melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.<br><br>


**Mengapa Performance Test Jarang Dilakukan?**

Pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. Hal ini disebabkan karena pengetesannya memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production. Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.

Yang diperlukan dari performance test adalah **throughput** dan **response**.<br><br>

**Contoh Kasus Performance Test**

Sebuah sistem baru yang akan di launch ke production, namun sebelum masuk ke production perlu dilakukan performance test untuk mengetahui throughput dan response time dari sistem tersebut. Untuk informasi endpoint yang akan di test adalah: 
 - /login
 - /beli-pulsa
- /cek-out<br><br>

Langkah yang harus dilakukan:
1. Membuat test plan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test<br><br>

**Metode**<br>
1. Membuat Test Plan<br>
Kenali yang dibutuhkan :<br>
Endpoint yang akan ditest :<br>
    - /login
    - /beli_pulsa
    - /cek_out<br>

    Kebutuhan masing-masing endpoint:
    - Username dan password untuk endpoint /login
    - Produk, denom dan nomor untuk pengetesan untuk endpoint /beli_pulsa
    - Metode pembayaran yang dipilih untuk endpoint /cek_out <br> <br>
2. Menentukan Metode Test<br>
    - Pilih berdasarkan kondisi sistem, apakah belum pernah di tes atau sudah 
        - Selalu awali dengan load test untuk tahu kondisi awal sistem
    - Pilih berdasarkan situasi yang akan dihadapi<br><br>


**Type**<br>
![Soal](/22_Fundamental%20Performance%20Test/screenshots/summary.png)<br><br>
1. Smoke Testing<br>
Testing yang pertama kali dilakukan setelah software di bangun. Fungsinya untuk memastikan fungsi penting berhasil dibangun. Dilakukan untuk verify script yang sudah dibuat, apakah sistem dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUs.
2. Load Testing
Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya. Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.<br>
**Bagaimana jika sistem belum pernah masuk ke production dan tidak diketahui idealnya?**<br>
Menggunakan **Tabel Tier8** => dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production<br>
![Soal](/22_Fundamental%20Performance%20Test/screenshots/tabel.png)
3. Stress Testing<br>
Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery. Tools: JMeter
4. Spike Testing<br>
Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.
5. Soak Testing<br>
Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb.<br><br>
**Tips:**<br> metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di production.
<br><br>

**Istilah penting!!**
![Soal](/22_Fundamental%20Performance%20Test/screenshots/istilah.png)<br><br>


