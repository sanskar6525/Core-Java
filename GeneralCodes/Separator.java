package GeneralCodes;

public class Separator {
	public static String Separate(String s)
	{
		String res="";
		int pos1=(s.contains("-"))?s.indexOf("-"):Integer.MAX_VALUE;
		int pos2=(s.contains("_"))?s.indexOf("_"):Integer.MAX_VALUE;
		if((pos1>0)||(pos2>0))
		{
			res=s.substring(0,Math.min(pos1, pos2));
		}
		else
			res=s;
		return res;
	}
	public static void main(String[] args) {
		String samp="6385POA_ro-WJHGDD";
		System.out.println(Separate(samp));
	}

 
}
