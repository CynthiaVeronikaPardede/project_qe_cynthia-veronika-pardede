# qe_cynthia-veronika-pardede

## **Section 6** <br><br>

### **Testing Documentation (Test Scenario – Test Case – dll)** <br><br>

**Test Scenario** merupakan sebuah dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun oleh software tester agar sistem yang akan ditest dapat memenuhi ketentuan yang diinginkan oleh user, memenuhi standar tertentu,  serta dapat berfungsi dengan baik. <br><br>
Test Scenario merupakan tingkatan tertinggi dari sebuah testcase (hight-level testcase).<br><br>
Tujuan:<br><br>
1. Memudahkan developer/tester untuk melakukan testing
2. Dasar pengembangan proyek
3. Dasar client/product owner menyesuaikan dengan sistem requirement

Beberapa tools yang digunakan untuk membuat Test Scenario: google spreadsheet, testrail dan testlink, dll<br><br>

**Bagaimana membuat Test Scenario yang baik?** <br><br>
1. In language system requirement => system requirement adalah kunci sehingga dapat menyusun skenario test sesuai flow yang ditentukan. 
2. Give context => User bersikap seolah-olah perlu melakukan hal tersebut
3. Give  detail => memberikan rincian secara spesifik hal-hal yang perlu diketahui oleh user.
4. crystal clear easy to understand => berikan penjelasan secara detail terkait test step dan spesifikasi expected result, sehingga memudahkan dalam melakukan proses testing
5. complete => user dapat melakukan apapun sesuai dengan sistem requirement yang diberikan.
6. khoren => antara scenario yang satu dengan yang lain atau antara step 1 dengan step yang lain harus saling berkesinambungan 
7. prove => dilengkapi dengan hasil yang didapatkan scenario yang telah didapatkan seperti resultnya pass or fail. 
8. konsisten => penggunaan kata haruslah secara konsisten, jika  ingin menggunakan kata failed email maka pada kata  test step selanjutnya harus sesuai dengan kata yang ditulis di awal.
9. end user mine don't assume => dalam pembuatan notifikasi kita harus memastikan client menginginkan notifikasi berupa pop up message atau learn message
10. dont forget cover negative test => tidak semua step dilakukan dalam kondisi positif, tulis kemungkinan yang ada
11. update setiap perubahan dan perbahuhi versi pembuatan <br><br>

Contoh:<br>
**Login to email**<br><br>
Check the Login Functionality<br>
Check the Forget Email Functionality<br>
Check the Create New Account Functionality<br><br>

**Test Case/Uji Kasus** merupakan suatu rancangan atau rangkaian mengenai tindakan yang dilakukan software tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu dari  sebuah perangkat lunak.<br><br>

Tujuan:<br><br>
untuk memastikan bahwa suatu sistem dapat dijalankan dengan baik sesuai dengan kebutuhan awal serta mampu memberikan respon ketika memberikan masukan yang tidak valid.<br><br>

Testcase memiliki beberapa komponen seperti testcase id, test case description, precondition, test steps, expected result, status, dan actual result.<br><br>
Testcase bertindak sebagai titik awal terhadap pelaksanaan pengujian sebuah sistem. dari test case dapat diketahui apakah sistem berjalan normal atau tidak.<br><br>
**Beberapa hal yang perlu diperhatikan dalam membuat test case:**<br><br>
1. dibuat sederhana dan transparan
2. dibuat berdasarkan pikiran/perspektif user
3. hindari pengulangan kasus uji
4. jangan berasumsi mengenai yang sedang diuji
5. pastikan pengujian harus mencakup semuanya
6. test case harus dapat diidentifikasi
7. test case harus menghasilkan hasil yang sama 
8. test case harus dapat ditinjau orang lain<br><br>

Contoh:<br><br>
Test Scenario: Check the Login Functionality<br>
Test Case 1 : Enter valid email and valid password [positif test case]<br>
Test Case 2 : Enter valid email and invalid password [negative test case]<br>
Test Case 3 : Enter invalid email and valid password [negative test case]<br>
Test Case 4 : Enter invalid email and invalid password [negative test case]

