BALANCED PARANTHESIS
========================

Problem Description

Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints

1 <= |A| <= 100



Input Format

The first and the only argument of input contains the string A having the paranthesis sequence.



Output Format

Return 0, if the paranthesis sequence is not balanced.

Return 1, if the paranthesis sequence is balanced.



Example Input

Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[] 


Example Output

Output 1:

 1 
Output 2:

 0 
Output 3:

 1 


Example Explanation

You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.



SOLUTION
=========


public class Solution {
    public int solve(String A) {
Stack<Character> tempStack=new Stack<Character>();
if(A.charAt(0)==']') return 0;
if(A.charAt(0)=='}') return 0;
if(A.charAt(0)==')') return 0;
tempStack.push(A.charAt(0));
for(int i=1;i<A.length();i++){
char temp=A.charAt(i);
if(temp==']'&&tempStack.peek()=='[')
tempStack.pop();
else if(temp=='}'&&tempStack.peek()=='{')
tempStack.pop();
else if(temp==')'&&tempStack.peek()=='(')
tempStack.pop();
else
tempStack.push(temp);
}if(tempStack.isEmpty()) return 1;
else return 0;
    }
    }