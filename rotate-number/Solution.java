import java.util.*;

class Solution
{
public static void rotate(long number,int k)
{

long right=0;
for(int i=1;i<=k;i++)
{
right=right*10+(number%10);
number/=10;
}

int count=0;
long left=0;
while(number!=0)
{
left=left*10+(number%10);
count++;
number/=10;
}

number=left*(long)Math.pow(10,k)+right;
long reverse=0;

while(number!=0)
{
reverse=reverse*10+number%10;
number/=10;
}

System.out.println(reverse);

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long number=sc.nextLong();
int k=sc.nextInt();
rotate(number,k);
}
}