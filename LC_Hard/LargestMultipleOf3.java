package LC_Hard;
/*This package has all the hard level problems of LeetCodeis*/

import java.util.*;
public class LargestMultipleOf3 
{
	//This class returns the largest multiple of 3 that can be formed from the given array of digits
	public static String largestMultipleOfThree1(int[] digit) 
    {
		int[] digits=Arrays.copyOfRange(digit,0,digit.length);
		//Approach 1 to solve
        int l=digits.length;
        Arrays.sort(digits);
        if(digits[l-1]==0)
            return "0";
        
        //Divisibility rule of 3 states that a number is divisible by 3 if the sum of all the digits of it are also divisible by 3

        //We will firstly create a number by considering all the digits given to us
        //If the number thus formed is not divisible by 3, we will check out other combinations by removing certain digits.

        int sum=0;
        for(int i:digits) 
            sum+=i;

        //When dividing a number by 3 there can be three cases--
        //(a) Remainder will be 0
        //(b) Remainder will be 1 - In which case we need to remove either 1 digit with remainder equal to 1 or by removing 2 digits wil remainder equal to 2 
        //(c) Remainder will be 2 - In which case we need to remove either 1 digit with remainder equal to 2 or by removing 2 digits wil remainder equal to 1

        if(sum%3==0)
        {//Checking if the number formed by all the digits taken into consideration is a multiple of 3
            StringBuilder sb=new StringBuilder("");
            for(int i=l-1;i>=0;i--)
                sb.append(digits[i]);
            return sb.toString();
        }

        else if(sum%3==1)
        {//Checking if remainder comes out to be 1
            int rem=-1;
            for(int i=0;i<l;i++)
            {
                if(digits[i]%3==1)
                {
                    rem=i;
                    break;
                }
            }

            if(rem==-1)
            {
                int[] id=new int[2];
                Arrays.fill(id,-1);

                for(int i=0;i<l;i++)
                {
                    if(digits[i]%3==2)
                    {
                        if(id[0]==-1)
                            id[0]=i;
                        else if(id[0]!=-1)
                        {
                            id[1]=i;
                            break;
                        }
                    }
                }
                digits[id[0]]=-1; //By removing two digits with remainder 2
                digits[id[1]]=-1;
            }
            else
                digits[rem]=-1; //By removing a single digit that gives a remainder as 1
        }

        else
        {//Checking if remainder comes out to be 2
            int rem=-1;
            for(int i=0;i<l;i++)
            {
                if(digits[i]%3==2)
                {
                    rem=i;
                    break;
                }
            }

            if(rem==-1)
            {
                int[] id=new int[2];
                Arrays.fill(id,-1);

                for(int i=0;i<l;i++)
                {
                    if(digits[i]%3==1)
                    {
                        if(id[0]==-1)
                            id[0]=i;
                        else if(id[0]!=-1)
                        {
                            id[1]=i;
                            break;
                        }
                    }
                }
                digits[id[0]]=-1; //By removing two digits with remainder 1
                digits[id[1]]=-1;
            }
            else
                digits[rem]=-1; //By removing a single digit that gives a remainder as 2

        }

        StringBuilder sb=new StringBuilder("");
        for(int i=l-1;i>=0;i--)
        {
            if(digits[i]!=-1)
                sb.append(digits[i]);
        }

        if(sb.length()>0 && sb.toString().charAt(0)=='0')
            return "0";
        
        return sb.toString();

        
    }
	
	
	public static String largestMultipleOfThree2(int[] digits)
	{
		int[] D=new int[10]; //To create an array to store the frequency of each digit
		int sum=0;
		for(int i:digits)
		{
			D[i]=D[i]+1;
			sum+=i;
		}
		int N=digits.length;
		int mod=sum%3;
		while(sum%3!=0)
		{
			if(mod==1)
			{
				if(D[1]>0)
				{
					D[1]--;
					sum-=1;
				}
				else if(D[4]>0)
				{
					D[4]--;
					sum-=4;
				}
				else if(D[7]>0)
				{
					D[7]--;
					sum-=7;
				}
				else if(D[2]>0)
				{
					D[2]--;
					sum-=2;
				}
				else if(D[5]>0)
				{
					D[5]--;
					sum-=5;
				}
				else if(D[8]>0)
				{
					D[8]--;
					sum-=8;
				}
				else
					return "";					
			}
			else if(mod==2)
			{
				if(D[2]>0)
				{
					D[2]--;
					sum-=2;
				}
				else if(D[5]>0)
				{
					D[5]--;
					sum-=5;
				}
				else if(D[8]>0)
				{
					D[8]--;
					sum-=8;
				}
				else if(D[1]>0)
				{
					D[1]--;
					sum-=1;
				}
				else if(D[4]>0)
				{
					D[4]--;
					sum-=4;
				}
				else if(D[7]>0)
				{
					D[7]--;
					sum-=7;
				}
				else
					return "";
			}
			N--;
		}
		if(sum==0)
		{
			return D[0]!=0?"0":"";
		}
		StringBuilder sb=new StringBuilder();
		for(int i=9;i>=0;i--)
		{
			for(int j=1;j<=D[i];j++)
				sb.append(i);
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {8,6,7,1,0};
		//System.out.println(Arrays.toString(arr));
		System.out.println("By Approach 1:"+largestMultipleOfThree1(arr));
		System.out.println("By Approach 2:"+largestMultipleOfThree2(arr));
		
	}

}
