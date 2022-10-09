# qe_cynthia-veronika-pardede
## **Section 23**<br><br>
### **Introduction JMeter and Tutorial Record with JMeter**<br><br>

**Tools yang digunakan:**<br>
- JMeter
- K6
- Locust
- BlazerMeter
- Smartbear 
- Load Ninja<br><br>

Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya. Semakin dikembangkan.<br><br>

**Keuntungan:**
1. Open Source => bisa melihat code di JMeter  dan melihat permasalahan sendiri
2. Dibuat dengan GUI dan nonGUI (command line)<br><br>

**Melakukan instalasi:**
- Install JDK
- Download JMeter
- Membuka file zip dengan melakukan extra
- Membuka terminal/cmd
navigate ke folder jmeter/bin
- dan menjalankan “jmeter”
- melakukan instalasi plugin dan dipindahkan di dalam folder lib
- Kemudian restart JMeter<br><br>

**Komponen yang ada di JMeter**
1. Test Plan => rencana besar dari sebuah pengujian yang akan dilakukan (parent)
2. Thread Groups => Kumpulan thread yang menjalankan skenario yang sama
3. Samplers => sebutan untuk request yang dikirim ke server
4. Config Element => element yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server
5. Listener => merekam apapun atau data yang dihasilkan dari tes
6. Timer => fitur akan jalan duluan sebelum semua fitur yang lain berjalan
7. Assertion => seperti assert pada API/Web/Testing merupakan kriteria tambahan apakah pass/tidak
8. Pre-post processors => fitur untuk memproses/modifikasi response data sebelum/sesudah tes<br><br>

**Select Template**

1. Click on the Templates... (1) button right next to New file button on the toolbar, or by selecting File | Templates... from the menu.
2. Then, select Select Template as Recording (2).
3. Click on the Create(3) button. Refer to the following screenshot.<br><br>


**Enable HTTP(S) Test**
**Script Recorder**

1. Click on the HTTP(S) Test Script Recorder (1)
2. Then, select Toggle (2) to enable HTTP(S) Test Script Recorder<br><br>

**Run in CLI mode**
1. Buka cmd
2. redirect path ke \apache-jmeter-version\bin
3. Type 'jmeter -n -t [path to jmx file] -l [path to results file in CSV]'<br><br>

**Summary Report**<br>
>Success rate = (jumalah_response_2xx / jumlah_thread)*100%

