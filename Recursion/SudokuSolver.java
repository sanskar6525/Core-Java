package Recursion;

import java.util.Arrays;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
		if(solve(grid))
			display(grid);
	

	}
	
	static boolean solve(int[][] board)
	{
		int n=board.length;
		int row=-1;
		int col=-1;
		boolean emptyLeft=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(board[i][j]==0)
				{
					row=i;
					col=j;
					emptyLeft=false;
					break;
				}
			}
			if(emptyLeft==false)
				break;
		}
		if(emptyLeft==true)
			return true;
		
		for(int num=1;num<=9;num++)
		{
			if(isSafe(board,row,col,num)); {
			board[row][col]=num;
			if(solve(board))
			{
				
				return true;
			}
			else
				board[row][col]=0;
				
			}
		}
		return false;
		
	}
	
	public static void display(int[][] b)
	{
		for(int[] a:b)
		{
			System.out.println(Arrays.toString(a));
		}
	}
			
	static boolean isSafe(int[][] b,int row,int col,int num)
	{
		//Check for row clearance
		for(int i=0;i<b.length;i++)
		{
			if(b[i][col]==num)
				return false;
		}
		
		//Check for column clearance
		for(int i=0;i<b[0].length;i++)
		{
			if(b[row][i]==num)
				return false;
		}
		
		int sqrt=(int) Math.sqrt(b.length);
		int rstart=0+(sqrt*(row/sqrt));
		int cstart=col-(col%sqrt);
		
		//Check for box clearance
		for(int i=rstart;i<rstart+sqrt;i++)
		{
			for(int j=cstart;j<cstart+sqrt;j++)
			{
				if(b[i][j]==num)
					return false;
			}
		}
		return true;
	}

}
