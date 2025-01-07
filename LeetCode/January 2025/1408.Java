/*
1408. String Matching in an Array
Time Complexity = O(n^2)

*/

class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        ArrayList<String> answer = new ArrayList<>();

        //run a loop to check entireity of string array
        for(int i = 0; i<n; i++){
            if(subCheck(words, words[i], i)){   //create helper function 
                answer.add(words[i]);   //add word to arraylist if true
            }
        }
        return answer; //output
    }

    //parameters take string array, current word and index to not check
    public Boolean subCheck(String[] words, String check, int exclude){
        for(int j = 0; j<words.length; j++){
            if(exclude == j)  //skips the word being checked for substring
                continue;
            
            if(words[j].contains(check)){   //returns true if substring found
                return true;
            }
        }
        return false;
    }
}