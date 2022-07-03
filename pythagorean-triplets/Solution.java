import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
a=a*a;
b=b*b;
c=c*c;
boolean flag=false;
if(a+b==c) flag=true;
else if(a+c==b) flag=true;
else if(b+c==a) flag=true;
if(flag) System.out.print("Pythagorean Triple");
else System.out.print("Not a Pythagorean Triple");


}
}