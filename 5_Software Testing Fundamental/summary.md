# qe_cynthia-veronika-pardede

## **Section 5**
### **Software Testing Fundamental** <br> <br>

Software  Testing adalah proses menganalisis sebuah item perangkat lunak untuk mendeteksi perbedaan antara kondisi yang sekarang dengan kondisi yang akan diperlukan untuk mengevaluasi fitur dari software item (Standar ANSI/IEEE 1059). <br> <br>
### **Seberapa penting software Testing?**<br><br>
**Story 1** <br>
(Suncorp Bank) Pada bulan Februari 2017, terdapat kegagalan pemakaian setelah melakukan upgrade versi software. Hal ini menyebabkan hilangnya uang dari rekening bank pelanggan. Keluhan pelanggan bertambah terutama terkait penarikan berlebih pada akun mereka dan terkuncinya akun mereka.

**Story 2** <br>
Pada tahun 1985, Terdapat bug yang halus disebut race condition. seorang teknisi tidak sengaja dapat mengkonfigurasi Therac-25 sehingga berkas elektron akan menembak dalam modus kekuasaan tinggi tanpa melindungi pasien yang tepat. Sehingga menyebabkan 3 orang meninggal dan 3 orang lainnya luka parah.

Kesimpulan:<br>
>Software Testing sangat penting karena  dapat: <br><br>
**menghemat uang (save money) | menjamin kualitas produk (product quality) | keamanan terjaga (security) | kepuasan customer (customer satisfaction)** 
<br><br>

Software  bugs dapat sangat berbahaya dengan adanya bug dalam aplikasi atau software. Dapat menyebabkan krisis moneter dan manusia. <br><br> 

### Testing Platform
Dibedakan menjadi 4:
- API (Application Programming Interface) yaitu sekumpulan definisi dan protokol untuk membangun dan mengintegrasikan aplikasi software. Singkatnya, pengembangan dar inovasi software yang memungkinkan berbagai aplikasi bertukar data dan fungsionalitas dengan mudah dan aman. 
- Web yaitu sekumpulan halaman yang berisi informasi tertentu dan dapat diakses dengan banyak orang melalui internet. dapat dibuka dengan menuliskan URL/alamat website di browser
- Mobile, di dalam software testing platform mobile dibedakan menjadi 2 yaitu  android dan IOS
- Desktop

**Tipe Software Testing** <br>
Dibagi menjadi 3:
1. Functional Testing adalah  jenis pengujian yang memverifikasi bahwa setiap fungsi aplikasi sesuai  dengan requirement application. <br>
Contoh:<br>
Pintu yang terbuka dan tertutup secara otomatis pada jarak tertentu. <br><br>
Dibagi menjadi:
    - Manual testing adalah langkah yang digunakan untuk  mencari bug pada program perangkat lunak. Disini penguji berperan sebagai pengguna akhir untuk pengecekan semua fitur aplikasi bekerja dengan benar. Pengecekan secara manual tanpa menggunakan tools atau script. <br>
    Tujuan untuk memastikan aplikasi yang diuji bebas dari bug dan bekerja sesuai dengan yang diharapkan.
    - Automation testing adalah sebuah pengujian software yang menggunakan software testing dengan tujuan membandingkan antara output yang diprediksi dengan output yang dihasilkan sistem. <br><br>


    Perbedaannya: <br>
    - Manual itu software  tester yang akan menjalankan test case sedangkan automation software tester membuat script atau kode untuk testcase lalu dijalankan melalui automation tools.
    - Manual test cycles nya lebih lambat daripada automation.
    - Manual dapat membantu dalam memberikan opini maupun input mengenai tampilan UI sedangkan automation terbatas <br><br>

    Kelebihan dan kekurangan: <br><br>
    Pemilihan tools  automation testing yang tepat, proses testing, dan tim merupakan peranan penting supaya automation berhasil. Metode manual  dan automation berjalan secara beriringan untuk menghasilkan pengujian yang berhasil. <br><br>

2. Non-Functional Testing adalah pengujian dari aspek non-fungsional suatu aplikasi seperti kinerja, keandalan, kegunaan, keamanan dsb. Dilakukan setelah fungsional testing selesai. Dapat meningkatkan kualitas software.<br><br>
Contohnya:<br>
Performance Testing merupakan jenis pengujian software testing yang bertujuan untuk memastikan aplikasi bekerja dengan baik dibawah beban kerja yang diharapkan.<br><br>
Hasil: <br>
    >Speed (kecepatan) | Scalability (n user load yang dapat dihandle apk) | Stability

3. Maintenance Testing adalah dilakukan setelah sebuah aplikasi atau perangkat lunak di release ke konsumen. Diperlukan untuk mempertahankan atau meningkatkan karakteristik kualitas non fungsional dari komponen atau sistem selama masa pakainya terutama efisiensi kerja, kompatibilitas, keandalan, keamanan,  dan probabilitas. <br><br>
Contoh:<br>
Regression Testing
Setiap kali ada fungsionalitas yang baru ditambahkan atau yang lama dihapus dalam aplikasi maka harus dilakukan regresi testing untuk memastikan tidak ada bug baru. <br><br>

**Level of Testing** <br>
1.  Unit Testing merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah software. dilakukan pada masa development dari sebuah perangkat lunak oleh developer. Komponen yang diuji adalah unit-unit software. Unit dapat berupa fungsi, method,  prosedur, modul maupun objek. <br><br>
Tujuan:<br>
Untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan. <br><br>
Automation tools yang tersedia JUnit, NUnit, PHP unit dll<br><br>
2. Integration Testing merupakan pengujian dari penggabungan unit-unit yang ada di dalam software. Biasanya software tester menguji  bagaimana unit-unit bekerja sebagai kombinasi. Sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika  terjadi kesalahan error atau bug. <br><br>
Tujuan:<br>
Memeriksa aplikasi atau software dapat  berfungsi atau berjalan dengan baik.
Memeriksa kinerja dari aplikasi atau software
Mengetes struktur program yang sudah dirancang <br><br>

3. System Testing merupakan testing  yang dilakukan pada satu keseluruhan sistem yang dilakukan “end to end” testing. Untuk memverifikasi keseluruhan scenario telah berjalan dengan baik. Cakupannya akan mengetes aspek-aspek fungsional dan nonfungsional dari  sebuah perangkat lunak.<br><br>

4. Acceptance Testing digunakan untuk menentukan apakah sistem yang di develop telah memenuhi kebutuhan pengguna. Dalam beberpaa projek, acceptance testing dilakukan diakhir proses pengujian sebelum sistem dilepas ke pengguna. <br><br>
Tujuan:<br>
Apakah aplikasi sudah sesuai dengan proses bisnis dengan kebutuhan atau tidak. 

