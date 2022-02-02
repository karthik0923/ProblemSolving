ADD ONE TO NUMBER
------------------

Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, following are some good questions to ask :

Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints

1 <= size of the array <= 1000000



Input Format

First argument is an array of digits.



Output Format

Return the array of digits after adding one.



Example Input

Input 1:

[1, 2, 3]


Example Output

Output 1:

[1, 2, 4]


Example Explanation

Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.


  Solution
  ----------
  
  public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int length=A.size();
        int flag=0;
        if(A.get(length-1)<9){
            int num=A.get(length-1)+1;
            A.set(length-1,num);
        }
        else{
        for(int i=length-1;i>=0;i--){
            if(A.get(i)!=9){
                int nums=A.get(i)+1;
                flag=1;
                A.set(i,nums);
                break;
            }else
            A.set(i,0);
        }
        if(flag!=1){
        A.add(0,1);
        for(int i=1;i<A.size();i++){
            A.set(i,0);
        }
        }
    }
    int index=0;
        while(A.get(index)==0){
            //System.out.println("INSIDE"+A.get(index));
            A.remove(index);
        }
    return A;
    }
}
