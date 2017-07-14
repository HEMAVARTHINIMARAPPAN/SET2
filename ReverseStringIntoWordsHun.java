import java.io.*;
import java.util.*;
public class ReverseStringIntoWordsHun {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String newstr = "";
		Integer flag =0;
		String s = br.readLine();
		for(String newarr : s.split(" "))
		{
				StringBuilder sb = new StringBuilder(newarr);
				sb.reverse();
				System.out.print(sb+" ");
				}
		}
	}
