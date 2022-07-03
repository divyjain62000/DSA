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
int c=0;
int i=n1-1;
int j=n2-1;
int k=n2+n1-1;
int res[]=new int[n2+n1];
System.out.println("-----------");
while(i>=0 || j>=0 || c>0)
{
int d1=0;
int d2=0;
if(i>=0) d1=arr1[i];
if(j>=0) d2=arr2[j];
int sum=d1+d2+c;
res[k]=sum%10;
c=sum/10;
i--;
j--;
k--;
}

for(int e=k+1;e<n2+n1;e++) System.out.print(res[e]+"\t");


}
}