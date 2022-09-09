# qe_cynthia-veronika-pardede

## **Section 11**<br><br>

### **Introduction Basic Programming**<br><br>

JAVA Language
Java adalah bahasa pemograman independent yang berorientasi pada objek. Program java disusun berdasarkan class yang terdiri dari satu atau beberapa metode dan kumpulan class nya disebut dengan java application programming interface. Sekumpulan class ini juga disebut dengan package. <br>

Java 
1. Termasuk kepada bahasa yang cukup sederhana
2. Syntax yang digunakan mirip dengan C++
3. Hanya berfokus pada objek
4. Exception Handling
5. Mendukung native method<br><br>

Tools yang digunakan untuk menggunakan bahasa JAVA:<br>
- JDK dan IDE<br>JDK (Java Development Kit) -> Java Development Kit, terdapat JRE (Java Runtime Environment)<br><br>
Antara lain:<br>
    - Developing
    - Debugging
    - Monitoring
- IDE (Integrated Development Enviroment) -> Tools yang membantu developer untuk membangun software/ membuat program<br><br>
Antara lain:<br>
    - BlueJ
    - NetBeans
    - Eclipse
    - IntelliJ IDEA<br><br>

**Basic Programming**<br><br>
Terdiri dari:<br>
1. Type Data<br>
Terdiri dari
    - Integer (int)
    - Float (desimal (0.2))
    - Double (desimal (0.2345))
    - Boolean (True/False)
    - Char (‘A’, ‘B’)
    - String (‘’alterra”)<br><br>Array<br><br>
	Contoh: <br>
    char[] alterra = new char[] {'a', '1', 't', 'e', 'r', 'r', 'a'};<br>char[] alterra = new char [7];<br><br>
alterra [0]='a';<br>
alterra [1]='1';<br>
alterra [2]='t';<br>
alterra [3]='e';<br>
alterra [4]='r';<br>
alterra [5]='r';<br>
alterra [6]='a';<br><br>


2. Branching<br>
Branching/Percabangan
Percabangan if .. else memiliki ada pilihan alternatif kalau conditionnya salah.<br><br> 
Percabangan dibagian menjadi 3 bagian:
- If-Then hanya memiliki satu pilihan dan akan dikerjakan kalau kondisinya benar. Apabila kondisi salah maka tidak akan melakukan apa-apa atau dapat dikatakan eksekusi ke perintah berikutnya.<br><br>
    >if( suatu_kondisi ) {<br>
        // lakukan sesuatu kalau kondisi benar<br>
    }

- If-Then- Else memiliki pilihan alternatif kalau kondisinya salah.<br><br>
    - If => apabila kondisi benar maka kerjakan ini, kalau tidak silahkan lanjut
    - If-Else => apabila kondisi benar maka kerjakan ini, kalau salah maka kerjakan yang itu, setelah itu lanjut <br><br>
        >if( suatu_kondisi ) {<br>
            // lakukan sesuatu kalau kondisi<br> 
        }else{<br>
        // lakukan suatu kondisi<br>
        }<br>

- Switch/If-Else-If => Apabila percabangan If-Else hanya memiliki dua pilihan saja. Maka percahangan If-Else-if memiliki lebih dari dua pilihan.<br><br>
    >if (suatu kondisi) {<br>
        // maka kerjakan ini<br>
        // kerjakan perintah ini juga<br>
        // …<br>
    } else if (kondisi lain) {<br>
        // kerjakan ini<br>
        // kerjakan ini juga<br>
        // …<br>
    } else if (kondisi yang lain lagi) {<br>
        // kerjakan perintah ini<br>
        // kerjakan ini juga<br>
        // …<br>
    } else {<br>
        // kerjakan ini kalau<br>
        // semua kondisi di atas<br>
        // tidak ada yang benar<br>
        // …<br>
    }<br><br><br><br>
    >switch(variabel){<br>
        case 1:<br>
            // kerjakan kode ini<br>
            // kode ini juga<br>
            break;<br>
        case 2:<br>
            // kerjakan kode ini<br>
            // kode ini juga<br>
            break;<br>
        case 3:<br>
            // kerjakan kode ini<br>
            // kode ini juga<br>
            break;<br>
        default:<br>
            // kerjakan kode ini<br>
            // kode ini juga<br>
            break;<br>
    }
<br><br>
3. Looping/perulangan<br>
Perulangan dalam pemrograman dibagi menjadi dua jenis:<br>
    - Counted loop: Perulangan yang jumlah pengulangannya terhitung atau tentu. Terdiri dari 
        - For untuk perintah yang diketahui jumlahnya
            > for( int hitungan = 0; hitungan <= 10; hitungan++ ){<br>
                // blok kode yang akan diulang<br>
            }

        - For each untuk menampilkan isi dari array
            > for ( int item : dataArray ) {<br>
                // blok kode yang diulang<br>
            }

    - Uncounted loop: Perulangan yang jumlah pengulangannya tidak terhitung atau tidak tentu.<br><br>
    Terdiri dari:<br>
        - While “selama” seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true.
            >while ( kondisi ) {<br>
                // blok kode yang akan diulang<br>
            }
        - Do/While sebenarnya sama seperti perulangan While.
        Bedanya, Do/While melakukan satu kali perulangan dulu. Kemudian mengecek kondisinya.
            > do {<br>
                // blok kode yang akan diulang<br>
            } while (kondisi);<br>

4. Input Output<br>![Soal](/11_Introduction%20Basic%20Programming/screenshots/summary.png)<br><br>

5. Operator<br>
Terdiri dari: 
    - Assignment (=)
    - Arithmetic (+. -, *, /, %)
    - Unary (+, -, ++, --, !)
    - Equality and Relational (==, !=, >, >=, <, <=)
    - Conditional (&&, ||)

