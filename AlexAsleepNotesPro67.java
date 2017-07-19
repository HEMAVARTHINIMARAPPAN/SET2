import java.io.*;
import java.util.*;
public class AlexAsleepNotesPro67 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = 0;
		System.out.println("Class strength");
		Integer c = Integer.parseInt(br.readLine());
		System.out.println("Friends count");
		Integer fcount = Integer.parseInt(br.readLine());
		System.out.println("ID of total students in class");
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<c;i++)
		{
		Integer id = Integer.parseInt(br.readLine());
		list.add(id);
		}
		System.out.println("ID of friends");
		for(int i=0;i<fcount;i++)
		{
		Integer f = Integer.parseInt(br.readLine());
		list1.add(f);
		}
		for(Integer mm : list1)
		{
		if(list.get(mm-1) == 0)
			count++;
		}
		if(count == 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
