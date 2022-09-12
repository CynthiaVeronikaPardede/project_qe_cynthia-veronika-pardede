public class ubahHuruf {
    public static final String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String ubahHuruf(String s) {
        // your code here
        String cipherText = " ";
        int shiftKey = 10;
        for (int i = 0; i < s.length(); i++) {
            int letak = huruf.indexOf(s.charAt(i));
            int keyVal = (shiftKey + letak) % 26;
            char replace = huruf.charAt(keyVal);
            cipherText += replace;
        }
        return cipherText;
    }

    public static void main (String[] args)  {
        System.out.println(ubahHuruf("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA")); // SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG")); // QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER")); // ZBYQBKWWOB
    }
}
