import java.util.*;

class Solution
{
public static int getProduct(int n1,int n2,int base)
{
int res=0;
int u=1;
while(n2>0)
{
int d2=n2%10;
n2=n2/10;
int sprd=getProductWithSingleDigit(n1,d2,base);
res=getSum(base,res,sprd*u);
u=u*10;
}
return res;
}
public static int getProductWithSingleDigit(int n1,int d2,int base)
{
int res=0;
int c=0;
int u=1;
while(n1>0 ||  c>0)
{
int d1=n1%10;
n1=n1/10;
int d=d1*d2+c;
c=d/base;
d=d%base;
res=res+d*u;
u=u*10;
}

return res;
}
public static int getSum(int base,int n1,int n2)
{
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
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int base=sc.nextInt();
int res=getProduct(n1,n2,base);
System.out.print(res);
}
}