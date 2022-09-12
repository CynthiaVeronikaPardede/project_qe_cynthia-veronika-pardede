public class palindrome {

    private static boolean palindrome(String value){
        // your code here
        int i = 0, j = value.length() - 1;

        while (i < j) {
            if (value.charAt(i) != value.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main (String[] args)  {
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
        System.out.println(palindrome("lion")); // false
    }
}
