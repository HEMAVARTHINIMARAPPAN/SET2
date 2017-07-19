import java.io.*;
import java.util.*;
public class SumofLargestAndSmallestProset7 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Integer sum=0,summ=1,kk,ad=0,adt=0,f=0,ff=0,xx,yy,v=0,vv=0,bb,tt;
        String ss = "";
        String str= br.readLine();
for(int i=0;i<str.length();i++)
{
    if(str.charAt(i) == '0' ||str.charAt(i) == '1' ||str.charAt(i) == '2' ||str.charAt(i) == '3' ||str.charAt(i) == '4' || str.charAt(i) == '5' ||str.charAt(i) == '6' ||str.charAt(i) == '7' ||str.charAt(i) == '8' ||str.charAt(i) == '9')
        ss += str.charAt(i);
}
Integer nn = Integer.parseInt(ss);
while(nn>0)
{
	int pp = nn%10;
	nn = nn/10;
	//System.out.println(pp);
	list1.add(pp);
}
Collections.sort(list1,Collections.reverseOrder());
//System.out.println(list1);
for(int j=0;j<list1.size();j++)
{
	sum +=(Math.abs(list1.get(0)*list1.get(j)));

}
//System.out.println(sum);
Collections.sort(list1);
//System.out.println(list1);
for(int j=0;j<list1.size();j++)
{
	summ = summ*(Math.abs(list1.get(0)+list1.get(j)));
}
//System.out.println(summ);
while (summ>0 || sum>0)
{
	xx = summ%10;
	summ = summ/10;
	adt += xx;
	yy = sum%10;
	sum = sum/10;
	ad += yy;
}
if(ad<10)
{
	//System.out.println(ad);
	bb = ad;
}
else
{
	while(ad>0){
	f=ad%10;
	ad = ad/10;
	v += f;	
	}
	//System.out.println(v);	
    bb = v;
}
if(adt<10)
{
	//System.out.println(adt);
	tt = adt;
}
else
{
	while(adt>0){
	ff=adt%10;
	adt = adt/10;
	vv+=ff;
	}
	//System.out.println(vv);
	tt = vv;
}
if(bb<tt)
	System.out.println(bb*bb);
else
	System.out.println(tt*tt);
}}
