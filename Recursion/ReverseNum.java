package Recursion;

public class ReverseNum {
	public static int rev(int n, int sum)
	{
		if(n/10==0)
			return sum*10+n;
		sum=sum*10+(n%10);
		return rev(n/10,sum);
	}
	public static void main(String[] args) {
		System.out.println(rev(898101222,0));
	}
}
