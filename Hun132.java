import java.io.*;
import java.util.*;
public class Hun132 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String str[] = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
}}
