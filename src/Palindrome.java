public class Palindrome {

    public static Boolean palindrome(String check) {
        if (check.length() <= 1) return true;
        if (check.charAt(check.length() - 1) != check.charAt(check.length() - (check.length() - 2))) return false;
        StringBuffer sb = new StringBuffer(check);
        sb.deleteCharAt(check.length() - 1);
        sb.deleteCharAt((check.length() - 1) - (check.length() - 2));
        String res = sb.toString();
        return palindrome(res);
    }

    public static void main(String[] args) {
        if (palindrome("alala")) System.out.println("аааа");
        if (!palindrome("ala")) System.out.println("ммммм");
    }
}
