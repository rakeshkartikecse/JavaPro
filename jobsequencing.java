import java.util.*;
import java.lang.*;
import java.io.*;

class jobsequencing
{
public static void printMaxActivity(int s[],int f[],int n)
{
int i,j;
System.out.print("Following are activities");

i=0;
System.out.print(i+" ");
for(j=1;j<n;j++)
{
if(s[j]>=f[i])
{
System.out.print(j+"");
i=j;
}

}
}
public static void main(String[] agrs)
{
int s[]={1,3,0,5,8,5};
int f[]={2,4,6,7,9,9};
int n=s.length;
printMaxActivity(s,f,n);
}
}
