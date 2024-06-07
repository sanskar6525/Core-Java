package GeneralCodes;

import java.util.ArrayList;
import java.util.List;

public class MaxXOR {

	public static String result(int max,String s)
	{
		int bits=s.length();
		int a=Integer.parseInt(s,2);
		List<String> L=new ArrayList<>();
		String t="";
		for(int i=0;i<bits;i++)
		{
			t=t+"0";
		}
		System.out.println(t);
		for(int c=bits-1;c>=0;)
		{
			char[] ch=t.toCharArray();
			for(int j=0;j<max;j++)
			{
				ch[c]='1';
				c--;
			}
			L.add(new String(ch));
		}
		
		System.out.println(L);
		int m=0;
		String res="";
		for(int i=0;i<L.size();i++)
		{
			int b=Integer.parseInt(L.get(i),2);
			int c=a^b;
			m=Math.max(c,m);
			if(m==c)
				res=L.get(i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=result(1,"1011");
		System.out.println(g);
	}

}
