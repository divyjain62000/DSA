import java.util.*;
class Pair implements Comparable<Pair> 
{
public int start;
public int end;
public Pair(int start,int end)
{
this.start=start;
this.end=end;
}
public int compareTo(Pair o)
{
return this.start-o.start;
}
}


class Solution
{
public static int[][] mergeIntervals(int[][] intervals)
{
int n=intervals.length;
Pair arr[]=new Pair[n];
for(int e=0;e<n;e++)
{
Pair p=new Pair(intervals[e][0],intervals[e][1]);
arr[e]=p;
}

Arrays.sort(arr);
Stack<Pair> stack=new Stack<>();
int start=arr[0].start;
int end=arr[0].end;
for(int e=1;e<n;e++)
{
if(arr[e].start<=end)
{
end=end<arr[e].end?arr[e].end:end;
}
else 
{
Pair p=new Pair(start,end);
start=arr[e].start;
end=arr[e].end;
stack.push(p);
}
}
Pair p1=new Pair(start,end);
stack.push(p1);

int res[][]=new int[stack.size()][2];
int e=stack.size()-1;
while(!stack.isEmpty())
{
Pair p=stack.peek();
res[e][0]=p.start;
res[e][1]=p.end;
e--;
stack.pop();
}
return res;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int intervals[][]=new int[n][2];
sc.nextLine();
for(int e=0;e<n;e++)
{
String pair=sc.nextLine();
String p[]=pair.split(" ");
intervals[e][0]=Integer.parseInt(p[0]);
intervals[e][1]=Integer.parseInt(p[1]);
}

int res[][]=mergeIntervals(intervals);
for(int e=0;e<res.length;e++)
{
System.out.println(res[e][0]+"\t"+res[e][1]);
}

}
}