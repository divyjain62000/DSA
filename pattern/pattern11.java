import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=1;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=e;f++) 
{
System.out.print(k+"\t");
k++;
}
System.out.println();
}

}
}