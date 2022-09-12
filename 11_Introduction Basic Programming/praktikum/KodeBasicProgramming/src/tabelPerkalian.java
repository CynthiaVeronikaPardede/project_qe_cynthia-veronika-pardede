public class tabelPerkalian {
    private static void cetakTablePerkalian(int n) {
        for (int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++){
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        cetakTablePerkalian(3);
    }
}
