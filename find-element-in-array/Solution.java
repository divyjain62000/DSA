import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int e=0;e<n;e++)
{
arr[e]=sc.nextInt();
}
int target=sc.nextInt();
int index=-1;
for(int e=0;e<n;e++)
{
if(target==arr[e])
{
index=e;
break;
}
}
System.out.print(index);

}
}