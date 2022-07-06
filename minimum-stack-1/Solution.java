import java.util.*;

class CustomStack
{
private Stack<Integer> normalStack;
private Stack<Integer> minimumStack;

public CustomStack()
{
normalStack=new Stack<>();
minimumStack=new Stack<>();
}

public void push(int data)
{
if(normalStack.size()==0)
{
normalStack.push(data);
minimumStack.push(data);
}
else
{
normalStack.push(data);
if(data<minimumStack.peek()) minimumStack.push(data);
}
}

public int pop()
{
if(normalStack.size()==0)
{
System.out.println("Stack Underflow");
return -1;
}
int data=normalStack.pop();
if(data==minimumStack.peek()) minimumStack.pop();
return data;
}

public int top()
{
if(normalStack.size()==0) 
{
System.out.println("Stack Underflow");
return -1;
}
return normalStack.peek();
}

public int getMinimum()
{
if(normalStack.size()==0) 
{
System.out.println("Stack Underflow");
return -1;
}
return minimumStack.peek();
}

public int getSize()
{
return normalStack.size();
}

public void display()
{
List<Integer> l=new ArrayList<>();
while(!normalStack.isEmpty())
{
int data=normalStack.pop();
l.add(data);
System.out.print(data+"\t");
}

for(int e=l.size()-1;e>=0;e--) normalStack.add(l.get(e));

}



}

class Solution
{
public static void main(String args[])
{
CustomStack stack=new CustomStack();
Scanner sc=new Scanner(System.in);
int choice;
while(true)
{
System.out.println("---------------------------");
System.out.println("           Menu            ");
System.out.println("---------------------------");
System.out.println("1. Push data");
System.out.println("2. Pop data");
System.out.println("3. Get minimum data");
System.out.println("4. Get size");
System.out.println("5. Display data");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
choice=sc.nextInt();
if(choice==1)
{
System.out.println("Enter data: ");
int data=sc.nextInt();
stack.push(data);
}
else if(choice==2)
{
System.out.println(stack.pop());
}
else if(choice==3)
{
System.out.println(stack.getMinimum());
}
else if(choice==4)
{
System.out.println(stack.getSize());
}
else if(choice==5)
{
stack.display();
}
else if(choice==6) break;
}


}
}