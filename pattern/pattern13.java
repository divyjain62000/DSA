import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int e=0;e<n;e++)
{
int ecf=1;
for(int f=0;f<=e;f++)
{
System.out.print(ecf+"\t");
int ecfp1=ecf*(e-f)/(f+1);
ecf=ecfp1;
}
System.out.println();
}
}
}