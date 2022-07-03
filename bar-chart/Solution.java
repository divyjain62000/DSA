import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
int max=Integer.MIN_VALUE;
for(int e=0;e<n;e++) 
{
arr[e]=sc.nextInt();
if(max<arr[e]) max=arr[e];
}
for(int floor=max;floor>=1;floor--)
{
for(int e=0;e<n;e++)
{
if(arr[e]>=floor) System.out.print("*\t");
else System.out.print("\t");
}
System.out.println();
}

}
}