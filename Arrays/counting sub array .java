COUNTING SUB ARRAY
--------------------

Problem Description
Given an array A of N non-negative numbers and you are also given non-negative number B.

You need to find the number of subarrays in A having sum less than B. We may assume that there is no overflow.



Problem Constraints
1 <= N <= 103

1 <= A[i] <= 1000

1 <= B <= 107



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the number of subarrays in A having sum less than B.



Example Input
Input 1:

 A = [2, 5, 6]
 B = 10
Input 2:

 A = [1, 11, 2, 3, 15]
 B = 10


Example Output
Output 1:

 4
Output 2:

 4


Example Explanation
Explanation 1:

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Explanation 2:

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}

SOLUTION
----------

public class Solution {
    public int solve(int[] A, int B) {
        int [] pre=new int[A.length];
        pre[0]=A[0];
        for(int i=1;i<A.length;i++)
        pre[i]=pre[i-1]+A[i];
        int count=0,sum=0;
        for(int j=0;j<A.length;j++){
            for(int k=j;k<A.length;k++){
                if(j==0)
                sum=pre[k];
                else
                sum=pre[k]-pre[j-1];
                if(sum<B)
                count++;
            }
        }return count;
    }
}
