import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=0;
int y=1;
int z=0;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=e;f++)
{
System.out.print(z+"\t");
x=y;
y=z;
z=x+y;
}
System.out.println();
}

}
}