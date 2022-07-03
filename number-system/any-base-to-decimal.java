import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int k=sc.nextInt();
int u=1;
int ans=0;
while(num!=0)
{
int rem=num%10;
ans=ans+rem*u;
num=num/10;
u=u*k;
}
System.out.println(ans);
}
}