import java.util.*;

class Solution
{
public static long[] nextGreaterElement(long[] arr,int n)
{
long res[]=new long[n];
Stack<Long> stack=new Stack<>();
for(int e=n-1;e>=0;e--)
{
while(!stack.isEmpty() && stack.peek()<=arr[e]) stack.pop();
if(stack.isEmpty()) res[e]=-1;
else res[e]=stack.peek();
stack.push(arr[e]);
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