import java.util.*;

class Solution
{
public static long[] nextGreaterElement(long[] arr,int n)
{
long res[]=new long[n];
Stack<Integer> stack=new Stack<>();
stack.push(0);
for(int e=1;e<n;e++)
{
while(!stack.isEmpty() && arr[e]>arr[stack.peek()]) 
{
int pos=stack.peek();
res[pos]=arr[e];
stack.pop();
}
stack.push(e);
}
while(!stack.isEmpty()) 
{
int pos=stack.peek();
res[pos]=-1;
stack.pop();
}
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long arr[]=new long[n];
for(int e=0;e<n;e++) arr[e]=sc.nextLong();
long res[]=nextGreaterElement(arr,n);
for(int e=0;e<n;e++) System.out.print(res[e]+"\t");
}
}