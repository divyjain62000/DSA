import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int e=1;e<=n;e++)
{
if(e<=n/2+1)
{
if(e==1)
{
for(int f=1;f<=n/2+1;f++) System.out.print("*\t");
for(int f=1;f<=n/2-1;f++) System.out.print("\t");
System.out.print("*\t");
}
else if(e==n/2+1)
{
for(int f=1;f<=n;f++) System.out.print("*\t");
}
else
{
for(int f=1;f<=n/2;f++) System.out.print("\t");
System.out.print("*\t");
for(int f=1;f<=n/2-1;f++) System.out.print("\t");
System.out.print("*\t");
}
}
else
{
if(e!=n)
{
System.out.print("*\t");
for(int f=1;f<=n/2-1;f++) System.out.print("\t");
System.out.print("*\t");
}
else
{
System.out.print("*\t");
for(int f=1;f<=n/2-1;f++) System.out.print("\t");
for(int f=1;f<=n/2+1;f++) System.out.print("*\t");
}
}
System.out.println();
}



}
}

