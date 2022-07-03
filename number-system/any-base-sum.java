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
while(n1>0 ||n2>0 || c>0)
{
int d1=n1%10;
int d2=n2%10;
int d=d1+d2+c;
c=d/base;
d=d%base;
n1=n1/10;
n2=n2/10;
res=res+d*u;
u=u*10;
}
System.out.print(res);

}
}