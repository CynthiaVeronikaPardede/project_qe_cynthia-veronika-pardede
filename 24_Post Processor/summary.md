# qe_cynthia-veronika-pardede
## **Section 24**<br><br>
### **Post Processor**<br><br>

Post Processor merupakan bagian dari aksi yang berjalan saat proses setelah dilakukan. proses  request ke dalam sebuah halaman web. Elemen test plan yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler/ sampler request. Post processor ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler, mis. kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya. <br><br>
Biasa digunakan JSON extractor “https://jsonpath.com/”. <br><br>
JSON Path digunakan untuk ekstrak isi dari json response. Beberapa ekspresi yang umum digunakan :
- $ =root element (seluruh data JSON)
- . = child operator (object)
- [] = child operator (array)
- ..= recursive descent (langsung ke objek) * = - wildcard (all things)
- [start:end] = array slice operator borrowed<br><br>

Pada “Match No. {0 for random}” apabila membuat 1 maka akan dicetak 1 buah saja sedangkan apabila ingin mencetak semuanya maka dibuat -1 karena JMeter akan menganggapnya sebagai random. <br><br>
Apabila ingin mengambil data yang lain maka akan dilakukan(akan mendapatkan ID dan email dari keseluruhan JSON):<br>
>Name of created variables: ID, EMAIL
JSON Path expression: $..data.id;$..data.email
Match No. {0 for random}: -1;-1
Default Value: Notfound;notfound

