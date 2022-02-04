Problem Description

You are given a binary string A(i.e. with characters 0 and 1) consisting of characters A1, A2, …, AN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, …, AR. By flipping, we mean change character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints

1 <= size of string <= 100000



Input Format

First and only argument is a string A.



Output Format

Return an array of integers denoting the answer.



Example Input

Input 1:

A = "010"
Input 2:

A = "111"


Example Output

Output 1:

[1, 1]
Output 2:

[]


Example Explanation

Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].
  
  Solution:

public class Solution {
    public int[] flip(String A) {
        int [] nums=new int[2];
        int start=0,end=0,sum=0,max=0,startTemp=0,flag=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
               sum--;
            }
            if(A.charAt(i)=='0'){
               sum++;
            }//System.out.println(sum);
            if(max<sum){
                max=sum;
                end=i;
                flag=1;
                start=startTemp;
            }if(sum<0){
                sum=0;
                startTemp=i+1;
            }
        }
        if(flag==0){
              return new int[0];
       }
         nums[0]=start+1;
        nums[1]=end+1;
      
        return nums;
    }
}
