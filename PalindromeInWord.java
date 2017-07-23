import java.io.*;
import java.util.*;
public class PalindromeInWord{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer flag=0,max=0,p=0;
		String s = br.readLine();
		String ss = "",sss ="",word="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
		if(s.charAt(i)==s.charAt(j))
		    ss =(s.substring(i,j+1));
		sss = (new StringBuffer(ss).reverse().toString());
		if(ss.equals(sss))
		{
			max=sss.length();
			if(max>p)
			{
				p=max;
				word=sss;
			}
		}
			}
			}
		System.out.println(word);	
		
	}
}
