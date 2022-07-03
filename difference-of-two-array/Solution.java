import java.util.*;

class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int arr1[]=new int[n1];
for(int e=0;e<n1;e++) arr1[e]=sc.nextInt();
int n2=sc.nextInt();
int arr2[]=new int[n2];
for(int e=0;e<n2;e++) arr2[e]=sc.nextInt();
int res[]=new int[n2];
int c=0;
int i=n1-1;
int j=n2-1;
int k=n2-1;
while(i>=0 || j>=0)
{
int d1=0;
int d2=0;
int ans=0;
if(i>=0) d1=arr1[i];
if(j>=0) d2=arr2[j]+c;
int diff=0;
if(i>=0 && j>=0 && d2>=d1)
{
diff=d2-d1;
}
else if(i>=0 && j>=0 && d2<d1)
{
c=-1;
diff=(10+d2-d1);
}
else if(j>=0 && i<0) {
diff=d2;
c=0;
}

res[k]=diff;
k--;
i--;
j--;
}
for(k=0;k<n2;k++) System.out.print(res[k]+"\t");

}
}