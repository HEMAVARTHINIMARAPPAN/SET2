import java.io.*;
import java.util.*;
public class MatrixHunter {
	public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Integer i,j=0;
	int mat[][] = new int[3][3];
	for( i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			mat[i][j] = Integer.parseInt(br.readLine());
			//System.out.print(mat[i][j]+" ");
		}
		//System.out.println();
	}
	for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            System.out.print(mat[i][j]+ " ");
        }
        System.out.println();
    }
	for(i=0;i<=4;i++)
	{
		//for(j=0; j<=3; j++)
		//{
			if((mat[i][i] + mat[i][i+1]) == mat[i][i+2])
			{
				System.out.println();
				System.out.println("The elements are:");
                System.out.println(mat[i][i]+" "+ mat[i][i+1]+" "+mat[i][i+2]);
			    break;
		    }
		//}
	}
}
}
