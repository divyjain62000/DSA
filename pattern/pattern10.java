import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int os1=n/2;
int os2=n/2;
int ins=1;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=os1;f++) System.out.print("\t");
System.out.print("*\t");
if(e!=1 && e!=n) 
{
for(int f=1;f<=ins;f++) System.out.print("\t");
System.out.print("*\t");
}
for(int f=1;f<=os2;f++) System.out.print("\t");

if(e<=n/2)
{
os1--;
os2--;
if(e!=1 && e!=n) ins+=2;
}
else
{
os1++;
os2++;
if(e!=1 && e!=n) ins-=2;
}
System.out.println();

}

}
}