import java.util.*;

class CustomStackNode
{
public int data;
public CustomStackNode next;
public CustomStackNode(int data)
{
this.data=data;
this.next=null;
}
}

class CustomStack
{
private CustomStackNode top;
private int size;

public CustomStack()
{
this.top=null;
this.size=0;
}

public void push(int data)
{
CustomStackNode node=new CustomStackNode(data);
if(top==null)
{
top=node;
}
else
{
node.next=top;
top=node;
}
this.size++;
}

public int pop()
{
int data=-1;
if(this.top==null)
{
return data;
}
else
{
data=this.top.data;
top=this.top.next;
}
this.size--;
return data;
}

public void display()
{
CustomStackNode t=top;
while(t!=null)
{
System.out.print(t.data+"\t");
t=t.next;
}
System.out.println();
}

public int getSize()
{
return this.size;
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
System.out.println("--------------------------");
System.out.println("          Menu            ");
System.out.println("--------------------------");
System.out.println("1. Push data");
System.out.println("2. Pop data");
System.out.println("3. Get size");
System.out.println("4. Display data");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice=sc.nextInt();

if(choice==1)
{
System.out.print("Enter data: ");
int data=sc.nextInt();
stack.push(data);
}
else if(choice==2)
{
System.out.println(stack.pop());
}
else if(choice==3)
{
System.out.println(stack.getSize());
}
else if(choice==4)
{
stack.display();
}
else if(choice==5) break;


}
}
}