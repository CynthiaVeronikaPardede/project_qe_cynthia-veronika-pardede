public class drawXYZ {
    public static void DrawXYZ(int n) {
        int count = 1;
        char s[] = { 'Y', 'Z', 'X' };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count % 3 == 0) {
                    System.out.print(s[2]);
                } else if (count % 2 == 0) {
                    System.out.print(s[1]);
                } else if (count % 2 != 0) {
                    System.out.print(s[0]);
                }
                System.out.print(" ");
                count++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        DrawXYZ(3);
        System.out.println("-->><<--\n");

        DrawXYZ(5);
        System.out.println("-->><<--\n");

        DrawXYZ(1);
        System.out.println("-->><<--\n");
    }
}
