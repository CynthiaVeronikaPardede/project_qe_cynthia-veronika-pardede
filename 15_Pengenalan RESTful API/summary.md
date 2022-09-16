# qe_cynthia-veronika-pardede
## Section 15 <br><br>
### Basic RESTful API<br><br>
API (Application Programming Interface 
merupakan penghubung yang memungkinkan suatu suatu aplikasi untuk berelasi dengan aplikasi lainnya dengan berbagai data.<br><br>
Tujuan<br>
>untuk mempercepat proses  development dengan menggunakan function secara terpisah sehingga developer tidak perlu menggunakan fitur yang sama.

<br>
API berperan sebagai pembawa pesan dari pengguna dan memberitahu sistem apa yang harus dilakukan dan memberikan respon sesuai dengan permintaan tersebut. <br><br>

**REST (Representational State Transfer)**
Standar arsitektur komunikasi berbasis web yang sering digunakan untuk pengembangan berbasis web. Umumnya menggunakan HTTP method. Salah satu implementasi dari web service sebagai standar pertukaran data antar aplikasi maupun sistem. berisi batasan kepada programmer untuk mengakses atau melakukan tindakan apapun untuk mengakses database. REST yang membuat keinginan programmer dalam merancang web server. Data biasanya berupa json. <br><br>
![Soal](/15_Pengenalan%20RESTful%20API/screenshots/summary.png)<br><br>
**HTTP method**<br>
terdapat 4 method yang sering digunakan:<br>
![Soal](/15_Pengenalan%20RESTful%20API/screenshots/1.png)<br><br>
**Komponen REST API:**
- method
- URL (base URL + path) => kata kunci ke server
- Header => pesan itu sah
- Body => informasi

Json adalah urunan JavaScript yang digunakan dalam transfer dan penyimpanan data.

**HTTP RESPON CODE**<br>
- 200 OK => request sukses
- 201 Created => request sukses dan resoursenya berhasil dibuat (POST dan PUT)
- 400 Bad Request => terjadi ketika melakukan request POST dan PUT, data tidak sesuai
- 404 Not  Found => ketika respon found tidak ditemukan 
- 401 Unauthorized => tidak melakukan autentifikasi terlebih dahulu 
- 405 Method  Not Allowed=> HTTP tidak respon  
- 500 Internal => Kesalahan server
<br><br>
Untuk mengetes Rest API menggunakan Postman<br><br>

**API testing**<br> adalah test yang dilakukan pada layer dimana API yang didesain untuk berinteraksi  atau komunikasi pada aplikasi dengan memperhatikan functional tesnya.  Diharapkan dapat memberikan gambaran bagaimana respon dari aplikasi sebelum GUI siap. <br><br>

API testing dibedakan menjadi 3:
- Functionality => test untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum 
- Load Test => untuk menguji kekuatan suatu sistem apakah mampu mengolah data  dari beban yang diberikan. 
- Security => test untuk menguji keamanan dari suatu sistem <br><br>

Tools yang digunakan untuk API:
- Postman
- Frisby.js
- Jmeter
- Rest-assured

Perbedaan API test dan Unit test:<br>

![Soal](/15_Pengenalan%20RESTful%20API/screenshots/2.png)<br><br>

API testing Process
- Specification review => meriew API dan documen
- Specification Development
- framework Development
- Test Case development
- Execution dan report<br><br>

Test Cases for API Testing
- Mendapatkan balikan (response) yang sesuai dengan inputan.
- Apakah memberikan balikan atau tidak.
- Apakah mengganggu fitur yang lain atau tidak.
- Update struktur data.
- Memodifikasi data yang ada.<br><br>

Best Practices of API Testing
- Kelompokkan test case kedalam beberapa kategori.
- Beri judul yang sesuai pada setiap test.
- Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API
