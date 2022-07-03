import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String expression=sc.nextLine();
Stack<Character> stack=new Stack<>();
boolean flag=true;
for(int e=0;e<expression.length();e++)
{
char ch=expression.charAt(e);
if(ch=='(') stack.add(ch);
else if(ch=='[') stack.add(ch);
else if(ch=='{') stack.add(ch);

if(ch==')' && !stack.isEmpty() && stack.peek()=='(') stack.pop();
else if(ch==')' &&( stack.isEmpty() || (!stack.isEmpty() && stack.peek()!='(')))
{
flag=false;
break;
}

if(ch==']' && !stack.isEmpty() && stack.peek()=='[') stack.pop();
else if(ch==']' &&( stack.isEmpty() || (!stack.isEmpty() && stack.peek()!='[')))
{
flag=false;
break;
}

if(ch=='}' && !stack.isEmpty() && stack.peek()=='{') stack.pop();
else if(ch=='}' &&( stack.isEmpty() || (!stack.isEmpty() && stack.peek()!='{')))
{
flag=false;
break;
}

}
if(!stack.isEmpty()) flag=false;
System.out.print(flag);

}
}