import java.util.Scanner;

public class mean {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input nilai, mis: 1,2,3,dst = ");
        String inputan =  myObj.nextLine();
        String[] list = inputan.split(",");
        System.out.println(list);

        int n = list.length;
        float jumlah = 0;
        for (String i : list) {
            float angka = Float.parseFloat(i);
            jumlah = jumlah + angka;
            System.out.println(i);
        }

        System.out.println("Nilai rata-rata = " + jumlah/n);
    }
}
