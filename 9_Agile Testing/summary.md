# qe_cynthia-veronika-pardede

## **Section 9**<br><br>
### **Agile Testing** <br><br>
**SDLC (Software Development Life Cycle** <br><br>
SDLC adalah proses yang digunakan untuk merancang, mengembangkan dan menguji software yang berkualitas tinggi. <br><br>
Tujuan:<br><br>
Untuk menyediakan alur terstruktur dalam membantu organisasi untuk menghasilkan software berkualitas tinggi yang diselesaikan dengan perkiraan waktu yang singkat dan biaya yang lebih rendah namun tetap memenuhi atau melebihi harapan pelanggan. <br><br>
Dalam prakteknya SDLC, akan dimulai dengan mengevaluasi sistem yang ada untuk mendefinisikan persyaratan pada sistem yang baru. Baru setelah itu software akan dibuat berdasarkan tahapan SDLC yang ada. SDLC dapat mengantisipasi kemungkinan adanya kesalahan sehingga mengurangi kemungkinan adanya pekerjaan ulang atau perbaikan software setelah jadi. SDLC merupakan metodologi yang berulang sehingga harus memastikan kualitas kode yang ada di setiap siklusnya. Sangat sulit membangun software dengan perancangan yang maksimal beberapa teknik terus dikembangkan hingga kini. Masih banyak perdebatan mengenai metode yang lebih baik dan paling sesuai untuk segala tipe perangkat lunak. <br><br>
Fungsi SDLC:<br><br>
1. Sarana komunikasi antara tim developer dan pemegang kepentingan
2. Membagi peranan dan tanggung jawab antara developer, designer, bisnis analis dan manajer proyek
3. Dapat memberikan gambaran input dan output yang jelas dari suatu tahap menuju tahap selanjutnya.
4. Menggambarkan alur terstruktur dalam fase siklus software dan urutan bagaimana fase itu dilaksanakan untuk membuat software yang berkualitas dengan waktu yang cepat, setiap fase akan menghasilkan apa yang dibutuhkan oleh fase berikutnya dalam life cycle tersebut lalu diterjemahkan kedalam design. <br><br>

Tahapan SDLC:<br><br>
1. Requirements Gathering => sistem akan dianalisis bagaimana akan dijalankan nantinya. Hasilnya analisis berupa kelebihan dan kekurangan,  fungsi sistem, pembaharuan yang dapat diterapkan. Bagian ini termasuk dalam perencanaan. Alokasi sumber daya, perencanaan kapasitas, pendaulat proyek,  estimasi biaya dan  penetapan.<br><br>
Hasilnya rencana proyek, jadwal estimasi biaya, dan ketentuan
2. Design, membuat model, cara kerja aplikasi atau software, membuat prototype
Ada beberapa aspek yang diperhatikan:
    - Komunikasi, mendefinisikan metode/cara aplikasi berkomunikasi dengan aset lainnya seperti server pusat atau aplikasi lainnya. 
    - Programing, menentukan bahasa pemrograman, metode pemecahan masalah dan tugas-tugas yang ada didalam aplikasi.
    arsitektur -> menentukan bahasa pemrograman praktik dalam industri desain keseluruhan dan menetapkan template tertentu, 
    - User interface -> bagaimana cara pelanggan berinteraksi dengan software dan bagaimana software tersebut dapat merespon input yang ada
    - Platform -> dimana software akan dijalankan. Mis: android, linux, OS,dll
    - Security -> langkah-langkah mengamankan aplikasi
3. Development (CODE), dimana program atau code ditulis. Bisa digunakan source code management, penulisan dokumentasi (memakan waktu yang panjang. Disini rancangan bisa berubah karena satu atau banyak hal.
4. Testing, setelah selesai dikembangkan maka dilakukan pengujian untuk melihat apakah sesuai dengan yang dirancang. Testing yang harus dilewati adalah kualitas kode, fungsional testing, integration testing, performa testing dan security testing. 
5. Deployment, tahap ini apalikasi sudah siap untu digunakan. Beberapa feedback harus didengarkan supaya ada perbaikan kedepannya
6. Maintenance, betul-betul sudah selesai dan siap untuk digunakan. Disini masih memungkinkan ditemukan bugs sehingga kesalahan perlu diperbaiki.

Ada beberapa model untuk menjalankan SDLC:
1. Waterfall model, model tertua dan tersingkat dalam penerapannya. Setelah 1 fase selesai maka fase selanjutnya harus segera dimulai. Setiap fase memiliki rencana kerja dan menurun ke fase berikutnya. <br><br>
Kekurangan:<br>
Jika ada 1 detail kecil yang tertinggal maka dapat mempengaruhi keseluruhan rencana dan berakhir berantakan. <br><br>
2. Agile model, model SDLC yang dapat memisahkan produk dengan proses dan waktu pengerjaannya secara tepat. Diyakini sangat efektif untuk keberhasilan penciptaan suatu product. Tim akan mencoba setiap proses yang selesai untuk meminimalisir kesalahan <br><br>
Kelemahan:<br>
Memicu proyek kearah yang salah dan tidak sesuai dengan kemauan dan ekspektasi dari customer<br><br>
3. Iteratif model, metode yang dimiliki repetisi tinggi. Developer akan menciptakan produk dengan versi cepat dan murah setelah itu akan mencoba produk dan merepisinya <br><br>
Kelemahan:<br>
Dapat mengkonsumsi bahan baku jika ada satu detail yang tertinggal untuk dikerjakan <br><br>
4. Visup SDLC model merupakan lanjutan dari waterfall. Akan mencoba setiap fase proses pengembangan setiap produk 
5. Feedbang model merupakan model yang diklaim memiliki resiko tinggi saat dijalankan karena dalam pengerjaannya tim akan menginvestasikan semua bahan baku kedalam proyek tersebut sehingga hanya berhasil ketika mengerjakan proyek kecil. 
6. Spiral model merupakan metode yang paling fleksibel dan mirip dengan iteratif model. fokus dalam repetisi dalam pengerjaannya. <br><br>


**Agile Testing Manifesto**<br><br>
QA dapat mengevaluasi dan mengukur seberapa baik dalam melakukan testing.<br><br>

**5 Keys Testing Manifesto**<br><br>
Testing is an activity not a phase 
Prevent bugs rather than finding bugs
Don't be a checker, be a  tester
Don't try to break the system, instead help build the best possible system
The whole team is responsible  for quality, not just the tester<br><br>

**Testing Pyramid**<br><br>
Testing Pyramid adalah strategi yang dapat membantu tim developer dan automation dalam membuat  software testing  yang berkualitas tinggi dan andal. Testing yang beroperasi terhadap 3 tingkat dapat mengurangi waktu yang dihabiskan tim automation dalam mengeksekusi test case dengan mengkategorikan setiap fitur baru. <br><br>
**3 level testing pyramid  yang dimulai dari level yang paling bawah**<br>
- Unit Test => pengujian yang menguji setiap unit atau komponen dari sebuah perangkat lunak. Dilakukan pada masa pengembangan. Yang diuji adalah unit-unit yang ada pada perangkat lunak dapat berupa fungsi, method, fitur, modul maupun objek. <br><br>
Tujuan<br>
Untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan<br><br>

- Integration testing => pengujian dari hasil penggabungan unit-unit yang ada di dalam software. QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi. Sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran terjadi kesalahan error atau bug<br>
- UI test atau end  to end test adalah test yang paling dekat dengan interaksi pengguna. User input harus  memicu tindakan yang  tepat data harus disajikan kepada pengguna. Status UI harus berubah seperti yang diharapkan.<br><br>
Berdasarkan test ini kita dapat lebih mudah melihat seperti semakin tinggi level maka semakin sedikit test yang harus dilakukan karena semakin tinggi level untuk membuat test yang dijalankan memerlukan banyak biaya




