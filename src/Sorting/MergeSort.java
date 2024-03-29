package Sorting;

public class MergeSort {

	public static void sort(int[] ar, int l, int r) {
		System.out.println(l+" "+r);
		
		if(l < r) {
			int mid = (l+r)/2;
			sort(ar, l, mid);
			sort(ar, mid+1, r);
			merge(ar, l, mid, r);
		}
	}
	
	public static void merge(int[] ar, int l, int m, int r) {
		int[] left = new int[m - l +1];
		int[] right = new int[r-m];
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		for(int i = 0; i<n1; i++) {
			left[i] = ar[l+i];
		}
		
		for(int i = 0; i<n2; i++) {
			right[i] = ar[m+i+1];
		}
		
		n1 = 0;
		n2 = 0;
		int k = l;
		while(n1 < m-l+1 && n2 < r-m ) {
			if(left[n1] <= right[n2]) {
				ar[k] = left[n1];
				n1+=1;
			}else {
				ar[k] = right[n2];
				n2+=1;
			}
			k+=1;
		}
		
		while(n1 < m-l+1) {
			ar[k] = left[n1];
			n1+=1;
			k+=1;
		}
		
		while(n2 < r-m) {
			ar[k] = right[n2];
			n2+=1;
			k+=1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {6,2,-1,-2,8};
		sort(ar, 0, ar.length-1);
		for(int a: ar) {
			System.out.print(a+ " ");
		}
	}

}
