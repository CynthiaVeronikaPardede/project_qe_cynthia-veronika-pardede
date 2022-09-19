# qe_cynthia-veronika-pardede
## **Section 14**
### **Iterable Data Structure** <br><br>

Interable adalah sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan. <br>
![Soal](/14_Iterable%20Data%20Structure/screenshots/summary.png)<br><br>
Hierarchy Interface:
![Soal](/14_Iterable%20Data%20Structure/screenshots/1.png)<br><br>

Method Iterable<br>
- foreach
- iterator => class yang memanage iterator dari sebuah  iterable. Mengelolah bagian mana yang sudah mengelolah pada bagian mana yang sudah melakukan iterasi baru dan mengetahui data mana yang akan diambil. 
- spliterator<br><br>

Collection merupakan kumpulan dari objek atau data yang diletakkan dalam satu tempat yang sama. Dikenal sebagai “Collection of the objects”.<br><br>

List adalah interface yang menyediakan cara untuk menyimpan data secara linear merupakan turunan dari interfase collection. List dapat menerima nilai yang sama. Urutan data tergantung kepada urutan yang dibuat. 
Yang termasuk:<br>
- Array List => menyediakan penyimpanan data yang dinamis(tidak terikat dengan data yang disimpan selama memori komputer dapat menyimpan)
- Linked List => struktur data yang menyimpan setiap elemennya saling terhubung satu sama lain. Dihubungkan dengan menyimpan alamat memori dari masing-masing element baik element setelah atau sebelumnya. <br><br>

Time Complexity
(Array List vs LinkedList)
![Soal](/14_Iterable%20Data%20Structure/screenshots/2.png)<br><br>

Immutable List => datanya tidak dapat diubah atau menambah<br><br>

Stack => menambah data secara linear  dengan proses pengambilan dan penambahan data menggunakan LIFO (Last in first out).<br><br>

**Set**<br><br>
struktur data menyimpan sekumpulan data secara linear tetapi tidak dapat menerima data yang duplicate. 
Hierarchy interface dan implementation<br>
![Soal](/14_Iterable%20Data%20Structure/screenshots/3.png)<br><br>

Perbandingan Set:
![Soal](/14_Iterable%20Data%20Structure/screenshots/4.png)<br><br>
- Hashset struktur  data yang menyediakan langkah tercepat dari proses pencarian data. <br>
- Linked Hash Set, menyimpan insert set order. data yang diinput terlebih dahulu akan diinput terlebih dahulu.
- Enum Set, digunakan untuk menyimpan nilai enum. urutan mengikuti penulisian enum.<br>
- Tree Set<br>

Sorted Set yang mengelolah urutan data. 
Implementasi:
![Soal](/14_Iterable%20Data%20Structure/screenshots/5.png)<br><br>

**Queue**<br>
mengimplementasi FIFO (First in first out). data yang duluan dimmasukkan maka duluan dikeluarkan. <br>
![Soal](/14_Iterable%20Data%20Structure/screenshots/6.png)<br><br>

Implementasi:<br>
![Soal](/14_Iterable%20Data%20Structure/screenshots/7.png)<br><br>

**Deque/double ended  queue)**<br>
sebuah queue yang memiliki 2 ujung.

