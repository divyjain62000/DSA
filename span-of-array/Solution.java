import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int e=0;e<n;e++)
{
arr[e]=sc.nextInt();
}
int max=arr[0];
int min=arr[0];
for(int e=1;e<n;e++)
{
if(arr[e]>max) max=arr[e];
if(arr[e]<min) min=arr[e];
}
System.out.print(max-min);
}
}