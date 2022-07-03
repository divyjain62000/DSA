import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int star=n/2+1;
int space=1;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=star;f++) System.out.print("*\t");
for(int f=1;f<=space;f++) System.out.print("\t");
for(int f=1;f<=star;f++) System.out.print("*\t");
if(e<=n/2)
{
star--;
space+=2;
}
else
{
star++;
space-=2;
}
System.out.println();
}
}
}