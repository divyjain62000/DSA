import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int space=0;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=space;f++) System.out.print("\t");
System.out.println("*");
space++;
}
}
}