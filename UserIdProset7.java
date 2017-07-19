import java.io.*;
import java.util.*;
public class UserIdProset7 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        String r ="",re = "";
        String fn = br.readLine();
        for(int i=0;i<fn.length();i++)
        {
        	if(Character.isUpperCase(fn.charAt(i)))
        		r += Character.toLowerCase(fn.charAt(i)); 
        	else
        		r += Character.toUpperCase(fn.charAt(i));
        }
        	String ln  = br.readLine();
        	 for(int i=0;i<ln.length();i++)
             {
             	if(Character.isUpperCase(ln.charAt(i)))
             		re += Character.toLowerCase(ln.charAt(i)); 
             	else
             		re += Character.toUpperCase(ln.charAt(i));
             }
        	
        String pin = br.readLine();
        StringBuffer sb = new StringBuffer(pin);
        sb.reverse();
        String pinn = sb.toString();
        Integer n = Integer.parseInt(br.readLine());
        if(r.length()>re.length())
        System.out.println(r.charAt(0)+re+pin.charAt(n-1)+pinn.charAt(n-1));
        else
        	System.out.println(r.charAt(0)+re+pin.charAt(n-1)+pinn.charAt(n-1));
}}
