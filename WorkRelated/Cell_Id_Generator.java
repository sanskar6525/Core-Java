package WorkRelated;
public class Cell_Id_Generator {
	
	public static String Separate(String s)
	{
		String res="";
		int pos1=s.indexOf("-");
		int pos2=s.indexOf("_");
		if((pos1!=-1)&&(pos2!=-1))
			res=s.substring(0,Math.min(pos1, pos2));
		else if((pos1!=-1)&&(pos2==-1))
			res=s.substring(0,pos1);
		else if((pos1==-1)&&(pos2!=-1))
			res=s.substring(0,pos2);
		else
			res=s;
		return res;
	}
	public static void main(String[] args) 
	{
		String samp1="6385POA_ro_rdx";
		System.out.println(Separate(samp1)+"\n");
		
		String samp2="6385POB-ro_rdx";
		System.out.println(Separate(samp2)+"\n");
		
		String samp3="6385POC";
		System.out.println(Separate(samp3)+"\n");
	}
}
