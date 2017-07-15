import java.io.*;
import java.util.*;
public class SubsetArrayHun {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,a,a1,n,n1,j,k,count = 0,flag = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("List1");
		n = Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			a = Integer.parseInt(br.readLine());
			list.add(a);
		}
		System.out.println("List2");
		n1 = Integer.parseInt(br.readLine());
		for(i=0;i<n1;i++)
		{
			a1 = Integer.parseInt(br.readLine());
			list1.add(a1);
		}
		if(list.size() < list1.size())
		{
			for(i=0;i<list.size();i++)
			{
				for(j=0;j<list1.size();j++)
				{
					if(list.get(i) == list1.get(j))
					{
						count++;
					//	System.out.println(count);
					}
					if(count == n)
						flag = 1;
				}
			}
			if(flag == 1)
				System.out.println("List1 is a subset of List2");
			else
				System.out.println("List1 is not a subset of List2");
		}
		if(list1.size() < list.size())
		{
			for(i=0;i<list1.size();i++)
			{
				for(j=0;j<list.size();j++)
				{
					if(list1.get(i) == list.get(j))
					{
						count++;
					}
					if(count == n1)
						flag = 1;
				}
			}
			if(flag == 1)
				System.out.println("List2 is a subset of List1");
			else
				System.out.println("List2 is not a subset of List1");
		}
}}
