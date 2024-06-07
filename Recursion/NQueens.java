package Recursion;
import java.util.*;
public class NQueens {
	public static void print(String[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println();
	}
	public static int nQueens(String[][] a,int r)
	{
		if(r==a.length)
		{
			print(a);
			return 1;
		}
		int count=0;
		//placing the queen and checking for every row and column
		for(int c=0;c<a[0].length;c++)
		{//place the queen if it is safe
			if(isSafe(a,r,c))
			{
				a[r][c]="Q";
				count+=nQueens(a,r+1);
				a[r][c]="X";
			}
		}
		return count;
	}
	public static boolean isSafe(String[][] a,int r,int c)
	{
		//Check for vertical row
		for(int i=0;i<r;i++)
		{
			if(a[i][c].equals("Q"))
				return false;
		}
		//Check for diagonal left
		int maxLeft=Math.min(r, c);
		for(int j=1;j<=maxLeft;j++)
		{
			if(a[r-j][c-j].equals("Q"))
				return false;
		}
		
		//Check for diagonal right
				int maxRight=Math.min(r, a.length-1-c);
				for(int j=1;j<=maxRight;j++)
				{
					if(a[r-j][c+j].equals("Q"))
						return false;
				}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[][] a=new String[N][N];
		for(int i=0;i<N;i++)
			Arrays.fill(a[i], "X");
			
		
		System.out.println(nQueens(a,0));
	}

}
