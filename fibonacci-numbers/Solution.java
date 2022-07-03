import java.util.*;

class Solution
{

public static void fibonacci(int n)
{
int x=0;
int y=1;
int z;
for(int i=0;i<n;i++)
{
System.out.print(x+"\t");
z=x+y;
x=y;
y=z;
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fibonacci(n);
}
}