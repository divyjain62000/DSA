import java.util.*;

class Solution
{
public static void evaluation(String expression)
{
Stack<Integer> operandStack=new Stack<>();
Stack<Character> operatorStack=new Stack<>();
for(int e=0;e<expression.length();e++)
{
char ch=expression.charAt(e);
if(ch=='(') operatorStack.push(ch);
else if(Character.isDigit(ch)) 
{
operandStack.push(ch-'0');
}
else if(ch==')')
{
while(operatorStack.peek()!='(')
{
char optor=operatorStack.pop();
int v2=operandStack.pop();
int v1=operandStack.pop();
int opv=operation(v1,v2,optor);
operandStack.push(opv);
}
operatorStack.pop();
}
else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
{
while(!operatorStack.isEmpty() && operatorStack.peek()!='(' && precedence(ch)<=precedence(operatorStack.peek()))
{
char optor=operatorStack.peek();
int v2=operandStack.pop();
int v1=operandStack.pop();
int opv=operation(v1,v2,optor);
operandStack.push(opv);
}
operatorStack.push(ch);
}
}
while(operatorStack.size()!=0)
{
char optor=operatorStack.pop();
int v2=operandStack.pop();
int v1=operandStack.pop();
int opv=operation(v1,v2,optor);
operandStack.push(opv);
}
System.out.println(operandStack.peek());
}

public static int precedence(char operator)
{
if(operator=='+') return 1;
else if(operator=='-') return 1;
else if(operator=='*') return 2;
else if(operator=='/') return 2;
return 0;
}

public static int operation(int v1,int v2,char operator)
{
if(operator=='+') return v1+v2;
else if(operator=='-') return v1-v2;
else if(operator=='*') return v1*v2;
else if(operator=='/') return v1/v2;
return 0;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String expression=sc.nextLine();
System.out.println();
}
}