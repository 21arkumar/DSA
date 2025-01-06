/*
1769: Minimum Number of Operations to Move All Balls to Each Box

Optimal Code Below:
Time Complexity: O(n)
*/
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        char[] ch = boxes.toCharArray();
        int[] answer = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        int count = 0, preValue = 0;

        // Calculate the left array: total operations from left to right
        for (int i = 0; i < n; i++) {
            left[i] = preValue + count; 
            if (ch[i] == '1') count++; // Increment count if current box contains a ball (i.e. 1)
            preValue = left[i];
        }

        // Reset for calculating the right array
        preValue = 0;
        count = 0;

        // Calculate the right array: total operations from right to left
        for (int i = n - 1; i >= 0; i--) {
            right[i] = preValue + count; 
            if (ch[i] == '1') count++; // Increment count if current box contains a ball (i.e. 1)
            preValue = right[i];
        } 

        // Combine left and right arrays to get the answer
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] + right[i];
        } 

        return answer;
    }
}


/*
Brute Force Solution:
Time Complexity: O(n^2)
s
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        char[] box = boxes.toCharArray();
        
        for(int i = 0; i<n; i++){
            int total = 0;
            for(int j=0; j<n; j++){
                if(i != j && box[j] == '1'){
                    total += Math.abs(i-j);
                }
            }
            answer[i] = total;
        }

        return answer;
    }
}
*/

