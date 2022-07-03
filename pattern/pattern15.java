import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int space=n/2;
int k=1;
int i=1;
for(int e=1;e<=n;e++)
{
for(int f=1;f<=space;f++) System.out.print("\t");
int c=k;
for(int f=1;f<=i;f++)
{
System.out.print(c+"\t");
if(f<=i/2) c++;
else c--;
}
if(e<=n/2) 
{
space--;
i+=2;
k++;
}
else
{
space++;
i-=2;
k--;
}
System.out.println();
}

}
}