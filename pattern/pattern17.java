import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int space=n/2;
int star=0;
for(int e=1;e<=n;e++)
{
if(e<=n/2+1) star++;
else star--;
if(e!=n/2+1)
{
for(int f=1;f<=space;f++) System.out.print("\t");
}
else
{
for(int f=1;f<=space;f++) System.out.print("*\t");
}
for(int f=1;f<=star;f++) System.out.print("*\t");
System.out.println();
}
}
}