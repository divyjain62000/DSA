import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String expression=sc.nextLine();
Stack<Integer> stack=new Stack<>();
int k=expression.length();
boolean flag=false;
for(int e=0;e<expression.length();e++)
{
char ch=expression.charAt(e);
if(ch=='(') stack.add(e);
else if(ch==')')
{
int peek=stack.peek();
stack.pop();
if(peek==k-1) 
{
flag=true;
break;
}
else k=peek;
}
else continue;
}
System.out.print(flag);

}
}