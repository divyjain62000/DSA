import java.util.*;

class Solution
{
public static int maxArea(int arr[],int n)
{
int rb[]=new int[n];
Stack<Integer> stack=new Stack<>();
rb[arr.length-1]=n;
stack.push(arr.length-1);
for(int e=n-2;e>=0;e--)
{
while(!stack.isEmpty() && arr[e]<=arr[stack.peek()]) stack.pop();
if(stack.isEmpty()) rb[e]=n;
else rb[e]=stack.peek();
stack.push(e);
}
stack=new Stack<>();
int lb[]=new int[n];
lb[0]=-1;
stack.push(0);
for(int e=1;e<n;e++)
{
while(!stack.isEmpty() && arr[e]<=arr[stack.peek()]) stack.pop();
if(stack.isEmpty()) lb[e]=-1;
else lb[e]=stack.peek();
stack.push(e);
}
int maxArea=0;
for(int e=0;e<n;e++) {
int width=rb[e]-lb[e]-1;
int area=arr[e]*width;
maxArea=Math.max(area,maxArea);
}
return maxArea;	
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int e=0;e<n;e++) arr[e]=sc.nextInt();
System.out.println(maxArea(arr,n));
}
}