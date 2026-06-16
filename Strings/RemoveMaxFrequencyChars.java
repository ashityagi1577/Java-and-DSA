import java.util.*;
public class RemoveMaxFrequencyChars{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, freq[i]);
        }

    StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch - 'a'] != max) {
                ans.append(ch);
            }
        }

        System.out.print(ans);
        sc.close();
    }
}

