import java.util.*;

class Solution
{
public static String printMinimumNumberForPattern(String s)
{
int number=1;
String res="";
Stack<Integer> stack=new Stack<>();
for(int e=0;e<s.length();e++)
{
char ch=s.charAt(e);
if(ch=='D')
{
stack.push(number);
number++;
}
else if(ch=='I')
{
stack.push(number);
number++;
while(!stack.isEmpty())
{
res=res+stack.pop();
}
}
}
stack.push(number);
while(!stack.isEmpty())
{
res=res+stack.pop();
}
return res;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.print(printMinimumNumberForPattern(s));
}
}