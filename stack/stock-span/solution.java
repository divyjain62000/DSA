import java.util.*;

class Solution
{
public static int[] stockSpan(int []arr,int n)
{
int res[]=new int[n];
Stack<Integer> stack=new Stack<>();
for(int e=0;e<n;e++)
{
while(!stack.isEmpty() && arr[stack.peek()]<=arr[e]) stack.pop();
if(stack.isEmpty()) res[e]=e+1;
else res[e]=e-stack.peek();
stack.push(e);
}
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int e=0;e<n;e++) arr[e]=sc.nextInt();
int []res=stockSpan(arr,n);
for(int e=0;e<n;e++) System.out.print(res[e]+"\t");
}
}