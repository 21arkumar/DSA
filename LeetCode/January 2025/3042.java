/*
 * 3042. Count prefix and suffix pairs I
 * Time Complexity = O(n^2)
 */

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        //run two loops
        for(int i = 0; i<words.length-1; i++){  //traverses from 0 to end of array
            for(int j = i+1; j<words.length; j++){  //traverses from i+1 to end of array
                if(isSuffixAndPrefix(words[i], words[j])){      //pass current word and the word to check suffix prefix for
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSuffixAndPrefix(String s1, String s2){
        return s2.startsWith(s1) && s2.endsWith(s1);   //Use of startsWith and endsWith methods to return true or false
    }

}


//Below code is similar to above in terms of time complexity but the above code is faster by 2ms because of lesser calculations

/*

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        
        for(int i = 0; i<words.length-1; i++){
            for(int j = i+1; j<words.length; j++){
                int len1 = words[i].length();
                int len2 = words[j].length();

                if(len1 <= len2){ 
                //use of substring method to find the prefix and suffix
                    String str1 = words[j].substring(0, len1);
                    String str2 = words[j].substring((len2-len1), len2);

                    if(words[i].equals(str1) && words[i].equals(str2)){
                        count++;
                    }
                }
            }
        }

        return count;
    }

}

 */