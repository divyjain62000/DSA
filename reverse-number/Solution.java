import java.util.*;

class Solution
{
public static void printReverse(int number)
{
if(number==0)
{
System.out.println(0);
return;
}
while(number!=0)
{
System.out.println(number%10);
number=number/10;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
printReverse(number);
} 
}