package ThreeWayQuickSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] test = {0,2,0,1,0,1,2,0,1,2,0};
		
		quickSort(test);
		
		System.out.println(Arrays.toString(test));
	}
	
	public static void quickSort(int[] a)
	{
		quickSort(a, 0, a.length-1);
	}
	
	private static void quickSort(int[] a, int lo, int hi)
	{
		if(hi <= lo) return;
		
		int lt=lo, gt=hi;
		int pivot = a[lo];
		int i=lo+1;
		
		while(i<=gt)
		{
			if(pivot>a[i])	swap(a, i++, lt++);
			else if(pivot<a[i]) swap(a, i, gt--);
			else 	i++;
		}
		
		quickSort(a, lo, lt-1);
		quickSort(a, gt+1, hi);
		
	}
	
	private static void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
