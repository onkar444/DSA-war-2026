package Arrays_Hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class AllAnagramsInAString {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";

        var ans = new ArrayList<Integer>();
        int sArr[] = new int[26];
        int pArr[] = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sArr, pArr)) {
            ans.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            sArr[s.charAt(i - p.length()) - 'a']--;
            sArr[s.charAt(i) - 'a']++;
            if (Arrays.equals(sArr, pArr)) {
                ans.add(i - p.length() + 1);
            }
        }

        System.out.println(ans);
    }

}
