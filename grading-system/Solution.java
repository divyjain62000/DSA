import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();

if(marks>90) System.out.print("Excellent");
else if(marks>80 && marks<=90) System.out.print("Good");
else if(marks>70 && marks<=80) System.out.print("Fair");
else if(marks>60 && marks<=70) System.out.print("Meet Expectations");
else if(marks<=60) System.out.print("Below par");
}
}