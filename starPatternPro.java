import java.io.*;
public class starPatternPro {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer i,j;
		Integer n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i == 1 || i == n || j == 1 || j==n)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		}}
