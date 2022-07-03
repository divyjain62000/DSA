import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int k=sc.nextInt();
int u=1;
int res=0;
while(num!=0)
{
res=res+(num%k)*u;
num=num/k;
u=u*10;
}
System.out.print(res);
}
}