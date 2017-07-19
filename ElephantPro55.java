import java.io.*;
import java.util.*;
public class ElephantPro55 {
	public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer count=0,sum=0;
        System.out.println("No of Elephants: ");
        Integer m = Integer.parseInt(br.readLine());
        System.out.println("Withstanding capacity of web: ");
        Integer w = Integer.parseInt(br.readLine());
        System.out.println("Weight of m Elephants: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer arr[] = new Integer[m];
        for(int i=0;i<m;i++)
        {
        	Integer a = Integer.parseInt(br.readLine());
        	list.add(a);
        }
        Collections.sort(list);
        for(int i=0;i<m;i++)
        {
        		sum +=list.get(i);
        		if(sum<=w)
        		count++;
        		
        	}
        System.out.println(count);
}}
