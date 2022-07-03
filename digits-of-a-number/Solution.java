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

public static void printDigits(int number)
{
int count=getDigitCount(number);
int e=(int)Math.pow(10,count-1);
int f=1;
while(f<=count)
{
System.out.println(number/e);
number=(int)(number%e);
e=e/10;
f++;
}

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
printDigits(number);
}
}