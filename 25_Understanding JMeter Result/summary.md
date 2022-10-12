# qe_cynthia-veronika-pardede
## **Section 24**<br><br>
### **Understanding JMeter Result**<br><br>

**Cara melakukannya:**<br>
- Open terminal
- Navigate to the bin folder
- Run JMeter<br><br><br>

**Membuat Test plan**<br><br>
1. HTTP Request default: “https://reqress.in/
2. Get List Users: /api/users/3
3. Post User: /api/users
4. CSV Name File, click here (uploaded through Zoom chatbox)
5. Response Assertion:<br>Select Radio Button Response code Fill Pattern to test with 201
6. Before run your test, please save the test plan and save all listener with different name in /desktop/This-is-your-report.jmx<br><br>

>Throughput = (number of requests)/(total time) * conversion<br><br>

Where:<br>
number of requests = number of executed requests<br>
total time = (lastSampleStartTime + lastSampleLoadTime-firstSampleStartTime) conversion: the unit of conversion value, example 1000 will convert the value to the second, 1000*60 will convert the value to the minute, etc.<br><br>

**Quick Analyze**<br><br>
![Soal](/25_Understanding%20JMeter%20Result/screenshots/Screenshot%202022-10-12%20224349.png)<br><br>

**Overview of a Performance Test Report**
1. Pembahasan Data Yang Sudah Dimiliki
    - Summary tentang sistem
    - Kondisi awal sistem 
    - Target yang ingin dicapai
2. Data Performance Test Yang didapatkan 
    - Masukkan data dari metrics yang didapatkan 
3. Interpretasi Data Performance Test 
    - Interpretasi hasil dari matriksnya
4. Saran 
    - Berikan saran agar sistem lebih baik lagi setelah dites<br><br><br>

**Studi Kasus**<br><br>
Penggunaan dalam e-niaga
1. Mengetahui arus beban/kapasitas normal 
    - Fitur baru ditambahkan
    - Hanya mengecek :)
2. Mengetahui kapasitas pada acara khusus 
    - Acara khusus biasa (cth. Lebaran)
    - quick spesialevent

Penggunaan dalam e-niaga
1. Apa endpoints yang biasanya akan dites?
2. Apa alur transaksinya? 
3. Apa kendala yang sering muncul saat performance test?<br><br>

Penggunaan di gateway pembayaran

1. Mengetahui normal load/kapasitas
    - Fitur baru ditambahkan
    - Hanya mengecek :)
2. Ketahui kapasitas pada acara khusus sebuah. 
    - usual  special event
    - quick spesial event<br><br>

Usage in payment gateway
1. Apa endpoints yang biasanya akan dites?
2. Apa alur transaksinya?
3. Apa kendala yang sering muncul saat performance test?

