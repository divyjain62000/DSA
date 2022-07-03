import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int os1=0;
int os2=0;
int ins=n-2;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=os1;f++) System.out.print("\t");
System.out.print("*\t");
for(int f=1;f<=ins;f++) System.out.print("\t");
if(e!=n/2+1) System.out.print("*\t");
for(int f=1;f<=os2;f++) System.out.print("\t");
if(e<n/2+1)
{
os1++;
os2++;
ins-=2;
}
else
{
os1--;
os2--;
ins+=2;
}
System.out.println();
}

}
}