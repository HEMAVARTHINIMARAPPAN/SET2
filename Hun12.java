import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Hun12 {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer arr[] = new Integer[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Kth tallest height");
		Integer k = Integer.parseInt(br.readLine());
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[k-1]+"cm");
	}

}
