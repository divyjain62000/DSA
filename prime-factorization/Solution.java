import java.util.*;

class Solution
{
public static void printPrimeFactorizations(int n)
{
for(int div=2;div*div<=n;div++)
{
while(n%div==0) 
{
System.out.print(div+" ");
n=n/div;
}
}
if(n!=1)
{
System.out.print(n);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPrimeFactorizations(n);
}
}