/*
1930. Unique Length-3 Palindromic Subsequences

Faster Solution
Time Complexity: O(n);
Algo: 
1. Create letters, a hash set of all letters in s.
2. Initialize ans = 0.
3. Iterate over each letter in letters:
    3a. Calculate i as the first index in which letter appears in s and j as the final index in which letter appears in s:
        3aa. Initialize i = -1 and j = 0. Iterate over each index k in s. If s[k] = letter, set i = k if i = -1, and set j = k.
    3b. Initialize a hash set between.
    3c. Iterate k over the indices between i and j:
        3ca. Add s[k] to between.
4. Add the length of between to ans.
5. Return ans.
*/

class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet<>();

        // Add all unique characters from the string to the HashSet
        for (Character c : s.toCharArray()) {
            letters.add(c);
        }

        int total = 0;

        // Iterate through each unique character in the HashSet
        for (Character letter : letters) {
            int i = -1, j = 0;

            // Find the first and last occurrence of the character in the string
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == letter) {
                    if (i == -1) {
                        i = k; // Record the first occurrence
                    }
                    j = k; // Update the last occurrence
                }
            }

            // Collect all characters between the first and last occurrence
            Set<Character> between = new HashSet<>();
            for (int k = i + 1; k < j; k++) {
                between.add(s.charAt(k));
            }

            // Add the count of unique characters between i and j to the total
            total += between.size();
        }

        return total; // Return the total count of palindromic subsequences
    }
}


/*
Note: Code is Correct but exeeds time limit for larger testcases.
Time Complexity: O(n^3)

class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length()-2; i++){
            for(int j = s.length()-1; j>i+1; j--){
                if(s.charAt(i) == s.charAt(j) && !map.containsKey(s.charAt(i))){    
                    map.put(s.charAt(i), 1);
                    for(int k=i+1; k<j; k++){
                        StringBuilder sub = new StringBuilder();
                        sub.append(s.charAt(i)).append(s.charAt(k)).append(s.charAt(j));

                        if(!count.containsKey(sub)){
                            count.put(sub.toString(), 1);
                        }
                    }
                }
            }
        }
        return count.size();
    }
}
*/