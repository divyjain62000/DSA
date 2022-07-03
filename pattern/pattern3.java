import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int e=1;e<=n;e++)
{
int space=n-e;
for(int f=1;f<=space;f++) System.out.print("\t");
for(int f=1;f<=e;f++) System.out.print("*\t");
System.out.println();
}
}
}