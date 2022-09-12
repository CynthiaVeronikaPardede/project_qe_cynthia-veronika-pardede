public class asterisk {
    private static void playWithAsterisk(int n){
        // your code here
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        playWithAsterisk(5);
    }
}
