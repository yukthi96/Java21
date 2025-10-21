import java.util.Arrays;

public class StringUtils {
    public static String reverse(String s) { return new StringBuilder(s).reverse().toString(); }
    public static boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return t.equals(reverse(t));
    }
    public static int countVowels(String s) {
        int c=0; String v="aeiouAEIOU";
        for (char ch: s.toCharArray()) if (v.indexOf(ch) >= 0) c++;
        return c;
    }
    public static boolean isAnagram(String a, String b) {
        char[] x = a.replaceAll("\\s+","").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\\s+","").toLowerCase().toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        return Arrays.equals(x,y);
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
        System.out.println(isPalindrome("Madam, I'm Adam"));
        System.out.println(countVowels("Hello World"));
        System.out.println(isAnagram("Listen","Silent"));
    }
}
