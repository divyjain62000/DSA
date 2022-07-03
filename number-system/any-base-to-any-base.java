import java.util.*;

class Solution
{
public static int anyBaseToDecimal(int num,int k)
{
int u=1;
int ans=0;
while(num!=0)
{
int rem=num%10;
ans=ans+rem*u;
num=num/10;
u=u*k;
}
return ans;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int base1=sc.nextInt();
int base2=sc.nextInt();
num=anyBaseToDecimal(num,base1);
int u=1;
int res=0;
while(num!=0)
{
res=res+(num%base2)*u;
num=num/base2;
u=u*10;
}
System.out.print(res);




}
}
