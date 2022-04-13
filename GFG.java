
import java.util.*;

class GFG
{

    public static int findMobilePin(String input1,String input2){
        String s1 = input1;
        String s2 = input2;
        int n1 = s1.length();
        int n2 = s2.length();
        String commonChars = "";
        int count = countPairs(s1, n1, s2, n2);
        for (int i = 0; i < s1.length(); i++) 
            for (int j = 0; j < s2.length(); j++) 
                if (s1.charAt(i) == s2.charAt(j)) 
                    commonChars += s1.charAt(i);

        for(int i = 0; i < commonChars.length(); i ++) {
            String charToRemove = commonChars.charAt(i)+"";
            s1 = s1.replace(charToRemove, "");
            s2 = s2.replace(charToRemove, "");
        }
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        //ascii value sum of all characters in s1 and s2
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < s1.length(); i ++) 
            sum1 += s1.charAt(i) - 'A' + 1;
        for(int i = 0; i < s2.length(); i ++) 
            sum2 += s2.charAt(i) - 'A' + 1;
        
        String k = String.valueOf(count) + String.valueOf(sum1) + String.valueOf(sum2);
        return Integer.parseInt(k);
        
    }
static int countPairs(String s1, int n1,
						String s2, int n2)
{

	int []freq1 = new int[26];
	int []freq2 = new int[26];
	Arrays.fill(freq1, 0);
	Arrays.fill(freq2, 0);

	int i, count = 0;
	for (i = 0; i < n1; i++) freq1[s1.charAt(i) - 'a']++;
	for (i = 0; i < n2; i++) freq2[s2.charAt(i) - 'a']++;

	for (i = 0; i < 26; i++)
		count += (Math.min(freq1[i], freq2[i]));

	return count;
}

public static void main(String args[])
{
	String s1 = "wipro", s2 = "limited";
	int n1 = s1.length(), n2 = s2.length();
	System.out.println(findMobilePin(s1, s2));
}
}

// This code is contributed by
// Surendra_Gangwar
