package InsertionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] test = {83,65,47,23,22,89,7};
		insertionSort(test);
		
		System.out.println("insertion sort");
		System.out.println(Arrays.toString(test));
	}
	
	public static void insertionSort(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(a[j]<a[j-1]) swap(a, j, j-1);
				else break;
			}
		}
	}
	
	private static void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
