package Recursion;

public class ArrayExample extends SortingCheck {
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        //System.out.println("\n\n");
    }

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,76,89,200};
		int[] arr2= {12,1,2,0,10,9};
		
		System.out.println(checkSort(arr1,0)+"\n");
		
		System.out.println(checkSort(arr2,0)+"\n");
	
	}

}
