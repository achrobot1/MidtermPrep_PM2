package MergeSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] test = {4,65,47,23,22,89,7};
		mergeSort(test);
		
		System.out.println("merge sort");
		System.out.println(Arrays.toString(test));

	}
	
	public static void mergeSort(int[] a)
	{
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length-1);
	}
	
	private static void mergeSort(int[] a, int[] aux, int lo, int hi)
	{
		if(hi <= lo) return;
		
		int mid = lo + (hi-lo)/2;
		
		mergeSort(a, aux, lo, mid);
		mergeSort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	private static void merge(int[] a, int[] aux, int lo, int mid, int hi)
	{
		if(a[mid] < a[mid+1]) return;
		
		int i=lo,j=mid+1;
		
		for(int k=lo; k<=hi; k++)
		{
			aux[k] = a[k];
		}
		
		for(int k=lo; k<=hi; k++)
		{
			if(i>mid)			a[k] = aux[j++];
			else if(j>hi)		a[k] = aux[i++];
			else if(a[i]<a[j])	a[k] =aux[i++];
			else				a[k] = aux[j++];
		}
	}

}
