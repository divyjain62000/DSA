import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int space=n/2;
int star=1;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=space;f++) System.out.print("\t");
for(int f=1;f<=star;f++) System.out.print("*\t");
if(e<=n/2)
{
space--;
star+=2;
}
else
{
space++;
star-=2;
}
System.out.println();
}
}
}