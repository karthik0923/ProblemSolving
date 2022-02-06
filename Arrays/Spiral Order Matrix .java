Spural Order Matrix
----------------------

Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Problem Constraints

1 <= A <= 1000



Input Format

First and only argument is integer A


Output Format

Return a 2-D matrix which consists of the elements in spiral order.



Example Input

Input 1:

1
Input 2:

2


Example Output

Output 1:

[ [1] ]
Output 2:

[ [1, 2], [4, 3] ]


Example Explanation

Explanation 1:

 
Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3


Solution
-----------

public class Solution {
    public int[][] generateMatrix(int A) {
       int top = 0,
            bottom = A - 1,
            left = 0,
            right = A - 1;
     int [][] mat=new int[A][A]; 
        int index = 1;
     
        while (true)
        {
            if (left > right)
                break;
     
            // print top row
            for (int i = left; i <= right; i++)
                mat[top][i] = index++;
            top++;
     
            if (top > bottom)
                break;
     
            // print right column
            for (int i = top; i <= bottom; i++)
                mat[i][right] = index++;
            right--;
     
            if (left > right)
                break;
     
            // print bottom row
            for (int i = right; i >= left; i--)
                mat[bottom][i] = index++;
            bottom--;
     
            if (top > bottom)
                break;
     
            // print left column
            for (int i = bottom; i >= top; i--)
                mat[i][left] = index++;
            left++;
        }return mat;
    }
}
