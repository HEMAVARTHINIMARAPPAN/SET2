import java.io.*;
import java.util.*;
public class AnnaBrianPro66 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Float sum=(float)0;
		System.out.println("No of items ordered:");
		Integer items = Integer.parseInt(br.readLine());
		System.out.println("Item that Anna or Brian decline to eat:");
		Integer allergic_item = Integer.parseInt(br.readLine());
        ArrayList<Float> cost = new ArrayList<Float>();		
        ArrayList<Float> share = new ArrayList<Float>();
        System.out.println("Cost of each item:");
        for(int i=0;i<items;i++)
		{
        	Float a = Float.parseFloat(br.readLine());
			cost.add(a);
			share.add(a/2);	
		}
        share.remove(share.get(allergic_item));
        for(int i=0;i<share.size();i++)
        {
        sum += share.get(i);
        }
        System.out.println("Amount paid by the one who declined to eat:");
        Float anna_paid = Float.parseFloat(br.readLine());
        if(anna_paid == sum)
        	System.out.println("Bon Appetit");
        else if(anna_paid >sum)
        	System.out.println("Amount refund to Anna: "+Math.round(anna_paid-sum));
        else
        	System.out.println("Amount refund to Brian: "+Math.round(sum-anna_paid));   

}}
