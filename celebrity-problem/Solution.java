class Solution
{ 
int celebrity(int M[][], int n)
{
Stack<Integer> stack=new Stack<>();
for(int e=0;e<n;e++) stack.push(e);
while(stack.size()>=2) 
{
int i=stack.pop();
int j=stack.pop();

if(M[i][j]==0) 
{
stack.push(i);
}
else
{
stack.push(j);
}

}
int f=stack.peek();
for(int e=0;e<n;e++) 
{
if(e!=f) {
if(M[f][e]==1 || M[e][f]==0) {
return -1;
}
}
}
return f;
}
}