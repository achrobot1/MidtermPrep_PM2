package QuickSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] test = {4,65,47,23,22,89,7};
		quickSort(test);
		
		System.out.println("quick sort");
		System.out.println(Arrays.toString(test));

	}
	
	public static void quickSort(int[] a)
	{
		quickSort(a, 0, a.length-1);
	}
	
	private static void quickSort(int[] a, int lo, int hi)
	{
		if(hi <= lo) return;
		int j = partition(a, lo, hi);
		quickSort(a, lo, j-1);
		quickSort(a, j+1, hi);
	}
	
	private static int partition(int[] a, int lo, int hi)
	{
		int i=lo, j=hi+1;
		int pivot = a[lo];
		
		while(true)
		{
			while(pivot>a[++i])
			{
				if(i == hi) break;
			}
			
			
			while(pivot<a[--j])
			{
				if(j == lo) break;
			}
			
			if(i >= j) break;
			swap(a, i, j);
			
		}
		
		swap(a,lo, j);
		return j;
	}
	
	private static void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
