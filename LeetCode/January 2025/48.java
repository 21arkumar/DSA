/*
 * 48. Rotate Array
 * Time Complexity = O(n^2)
 
 * Solution: Create a transpose matrix then reverse the order of elements in each row
 */

class Solution {
    void swap(int[][] mat, int i, int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    void reverse(int[][] mat, int i, int col){
        for(int j=0; j<(col/2); j++){
            int temp = mat[i][j];
            mat[i][j] = mat[i][col-j-1];
            mat[i][col-j-1] = temp;
        }
    }

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length; 
        for(int i = 0; i<row; i++){
            for(int j = i; j<col; j++){
                swap(matrix, i, j);
            }
        }

        for(int i = 0; i<row; i++){
            reverse(matrix, i, col);
        }
    }
}