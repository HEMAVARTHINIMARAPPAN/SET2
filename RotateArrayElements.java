import java.io.*;
import java.util.*;
public class RotateArrayElements {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,j,n,a,d,p,flag=0;
		n = Integer.parseInt(br.readLine());
		d = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			a = Integer.parseInt(br.readLine());
			list.add(a);
		}
		for(i=0;i<d;i++){
			j = n-i-1;
			p=0;
			while(p<=n)
			{
				if(j<n)
				{
					System.out.print(list.get(j));
					j++;
				}
				
				else
				{
					j=0;
				}
				p++;
			}
			
			System.out.println();
		}
		
		}
	}
