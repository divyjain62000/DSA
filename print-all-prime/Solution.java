import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int low=sc.nextInt();
int high=sc.nextInt();
for(int num=low;num<=high;num++)
{
boolean flag=false;
for(int e=2;e*e<=num;e++)
{
if(num%e==0)
{
flag=true;
break;
}
}
if(!flag) System.out.println(num);
}
}
}