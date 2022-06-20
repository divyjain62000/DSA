import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
for(int i=1;i<=T;i++)
{
int n=sc.nextInt();
boolean flag=false;
for(int e=2;e*e<=n;e++)
{
if(n%e==0)
{
flag=true;
break;
}
}
if(flag) System.out.println("Not Prime");
else System.out.println("Prime");
}
}
}