import java.util.*;

class Solution
{
public static int digitCount(int number)
{
int count=0;
while(number!=0)
{
count++;
number/=10;
}
return count;
}
public static int inverse(int number)
{
int digitCount=digitCount(number);
int res[]=new int[digitCount];
int pos=1;
while(number!=0)
{
res[digitCount-number%10]=pos;
pos++;
number/=10;
}

int num=0;
for(int e=0;e<res.length;e++)
{
num=num*10+res[e];
}

return num;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println(inverse(number));
}
}