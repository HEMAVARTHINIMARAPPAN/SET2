import java.io.*;
import java.util.*;
public class SumOfDigitsOfPrimeNumberPro{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Integer> lis = new ArrayList<Integer>();
Integer arr[] = new Integer[100];
TreeSet ts = new TreeSet();
Integer u,z,sum,count=0,i,n;
for ( i = 1; i <= 100; i++)         
{
	int q=Prime(i);
	if(q==0)
   list.add(i);
}
for(int k=0;k<list.size();k++)      
{
	  sum=0;
	  u = list.get(k);
		z = u%10;
		u=u/10;
		sum=sum+z+u;
		lis.add(sum);
}
for(Integer mm:lis)                 
{
 int a=Prime(mm);
 if(a==0)                           
 {
 ts.add(mm);
}
}
System.out.println(ts);
}
public static int Prime(int mm){
	int flag=0;
	if(mm == 1)
		flag=1;
	for(int n =2; n<=mm/2;n++)
 		 if((mm%n==0))
 		 flag=1;
 		 return flag;
}
}
