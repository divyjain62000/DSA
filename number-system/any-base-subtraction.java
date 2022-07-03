import java.util.*;
class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int base=sc.nextInt();
int c=0;
int res=0;
int u=1;
while(n2>0)
{
int d1=n1%10;
int d2=n2%10+c;
int d;
if(d2>=d1)
{
d=d2-d1;
c=0;
}
else
{
d=d2-d1+base;
c=-1;
}
res=res+d*u;
u=u*10;
n1=n1/10;
n2=n2/10;
}
System.out.println(res);
}
}