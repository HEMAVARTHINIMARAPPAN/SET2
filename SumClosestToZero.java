import java.io.*;
import java.util.*;
public class SumClosestToZero {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,a,n,j,k;
		n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			a = Integer.parseInt(br.readLine());
			list.add(a);
		}
		//System.out.println(list);
		for(j=0;j<n;j++)
		{
			for(k=j;k<n-1;k++)
			{
			list1.add(Math.abs(list.get(j)+list.get(k+1)));
			}
		}
		//System.out.println(list1);
		for(j=0;j<n;j++)
		{
			for(k=j;k<n-1;k++)
			{
			if((list.get(j)+list.get(k+1)) == (Collections.min(list1))){
				System.out.println(list.get(j)+" and "+list.get(k+1)+" are the elements whose sum is closest to zero");
				break;
			}
		}
		}}}
