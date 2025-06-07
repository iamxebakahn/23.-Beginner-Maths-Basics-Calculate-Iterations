/*Problem Description

Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.



Problem Constraints

1 <= A,B <= 100000



Input Format

First line will contain 2 integers A and B



Output Format

An integer which is the HCF of A & B.



Example Input

Input 1:

15 105 
Input 2:

24 36 


Example Output

Output 1:

15
Output 2:

12 */
import java.lang.*;
import java.util.*;

public class Q1_Beginner_Maths_Basics_&_Calculate_Iterations {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int max_range=Math.min(A,B);
        int ans=0;

        /*
        for(int i=1;i<=max_range;i++)
        {
            if(A%i==0 && B%i==0)
                ans=i;
        }

        */
        


        for(int i=max_range;i>=1;i--)
        {
            if(A%i==0 && B%i==0)
               {
                ans=i;
                break;
               } 
        }

        System.out.print(ans);
    }
}