import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int col=2*n-1;
int space=col-2;

for(int e=1;e<=n;e++)
{
int k=e;
for(int f=1;f<=e;f++) System.out.print(f+"\t");
for(int f=1;f<=space;f++) System.out.print("\t");
if(e==n) k=e-1;
for(int f=k;f>=1;f--) System.out.print(f+"\t");
space-=2;
System.out.println();
}

}
}