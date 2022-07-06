import java.util.*;

class Solution
{
public static int[] slidingWindowMax(int n,int arr[],int k)
{
int nge[]=new int[n];
nge[n-1]=n;
Stack<Integer> stack=new Stack<>();
stack.push(n-1);
for(int e=n-2;e>=0;e--)
{
while(!stack.isEmpty() && arr[stack.peek()]<=arr[e]) stack.pop();
if(stack.isEmpty()) nge[e]=n;
else nge[e]=stack.peek();
stack.push(e);
}
int res[]=new int[n];
int j=0;
for(int e=0;e<=n-k;e++)
{
if(j<e) j=e;
while(nge[j]<e+k) j=nge[j];
res[e]=arr[j];
}
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int e=0;e<n;e++) arr[e]=sc.nextInt();
int k=sc.nextInt();
int res[]=slidingWindowMax(n,arr,k);
for(int e=0;e<=n-k;e++) System.out.print(res[e]+"\t");
}
}