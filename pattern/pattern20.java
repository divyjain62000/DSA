import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ins=0;
int os=n/2-1;
for(int e=1;e<=n;e++)
{
if(e<=n/2 || e==n)
{
System.out.print("*\t");
for(int f=1;f<=n-2;f++) System.out.print("\t");
System.out.print("*\t");
}
else if(e==n/2+1)
{
System.out.print("*\t");
for(int f=1;f<=os;f++) System.out.print("\t");
System.out.print("*\t");
for(int f=1;f<=os;f++) System.out.print("\t");
System.out.print("*\t");
os--;
ins++;
}
else
{
System.out.print("*\t");
for(int f=1;f<=os;f++) System.out.print("\t");
System.out.print("*\t");
for(int f=1;f<=ins;f++) System.out.print("\t");
System.out.print("*\t");
for(int f=1;f<=os;f++) System.out.print("\t");
System.out.print("*\t");
os--;
ins+=2;
}



System.out.println();
}



}
}