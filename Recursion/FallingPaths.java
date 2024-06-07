package Recursion;

public class FallingPaths {
	
	public static int minimum=Integer.MAX_VALUE;
    
    public int minFallingPathSum(int[][] matrix) 
    {
        
        if(matrix.length==1 && matrix[0].length==1)
            return matrix[0][0];
        for(int i=0;i<matrix[0].length;i++)
        {
            minSum(matrix[0][i],0,i,matrix);
        }
        return minimum;
    }
    public static void minSum(int m,int r,int c,int[][] ma)
    {
        if(r==ma.length-1)
        {
            System.out.print(m);
            minimum=Math.min(minimum,m);
            System.out.println("\t\t\t"+minimum);
            return;
        }
        if(c<ma[0].length-1)
        {
            minSum(m+ma[r+1][c+1],r+1,c+1,ma);
        }
        
        minSum(m+ma[r+1][c],r+1,c,ma);
        if(c>0)
        {
            minSum(m+ma[r+1][c-1],r+1,c-1,ma);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{17,82},{1,-44}};
		FallingPaths f=new FallingPaths();
		System.out.println(f.minFallingPathSum(arr));
	}

}
