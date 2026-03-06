public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "";
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            System.out.println("left::" + s.charAt(left) + "---- right::" + s.charAt(right));
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not Palidrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome");
    }
}