import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int os=1;
int ins=n/2;
int star=3;
for(int e=1;e<=n;e++)
{
if(e<=n/2+1)
{
if(e==1) for(int f=1;f<=n;f++) System.out.print("*\t");
else
{
for(int f=1;f<os;f++) System.out.print("\t");
System.out.print("*");
for(int f=1;f<=ins;f++) System.out.print("\t");
}
if(e!=n/2+1) 
{
System.out.print("*");
os++;
}
ins-=2;
}
else
{
os--;
for(int f=1;f<=os;f++) System.out.print("\t");
for(int f=1;f<=star;f++) System.out.print("*\t");
star+=2;
}
System.out.println();
}



}
}