import java.util.*;

class Solution
{
public static int getDigitCount(int number)
{
if(number==0) return 1;
int count=0;
while(number!=0)
{
count++;
number/=10;
}
return count;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.print(getDigitCount(number));
}
}