import java.util.*;
class CustomStack
{
private int data[];
private int size;
private int top;
public CustomStack(int size)
{
this.size=0;
this.top=-1;
this.data=new int[size];
}

public void push(int data)
{
if(top==this.data.length)
{
System.out.println("Stack overflow");
return;
}
this.top++;
this.data[this.top]=data;
this.size++;
}

public void pop()
{
this.top--;
this.size--;
}

public int getSize()
{
return this.size;
}

public void display()
{
if(this.top<0)
{
System.out.println("Stack underflow");
return;
}
for(int e=top;e>=0;e--)
{
System.out.print(data[e]+"\t");
}
System.out.println();
}



}

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
CustomStack stack=new CustomStack(10);
int choice;
while(true)
{
System.out.println("-----------------------");
System.out.println("          Menu         ");
System.out.println("-----------------------");
System.out.println("1. Push Data");
System.out.println("2. Pop Data");
System.out.println("3. Get Size");
System.out.println("4. Display Data");
System.out.println("5. Exit");
choice=sc.nextInt();
if(choice==1)
{
System.out.print("Enter a number: ");
int data=sc.nextInt();
stack.push(data);
}
else if(choice==2)
{
stack.pop();
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