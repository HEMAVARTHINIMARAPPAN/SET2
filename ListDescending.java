import java.io.*;
import java.util.*;
public class ListDescending {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			Integer a = Integer.parseInt(br.readLine());
			arr.add(a);
		}
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
}}
