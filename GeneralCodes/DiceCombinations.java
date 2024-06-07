package GeneralCodes;

public class DiceCombinations{
	public static void dices(String s,int target)
	{
		if(target==0)
			System.out.println(s);
		else {
			for(int i=1;i<=target;i++)
			{ 
				dices(s+i,target-i);
			}
			
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dices("",4);
	}
}
