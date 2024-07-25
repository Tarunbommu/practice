package day4;

public class Main {

	public static void main(String[] args) {
		int[] arr= {20, 35, -15, 7, 55, 1, -22};
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		mergeSort(arr, 0, arr.length );
	}
public static void mergeSort(int[] arr, int start, int end) {
	if((end -start)<2) {
		return;
	}
	int mid = (start + end)/2;
	mergeSort(arr, start, mid);
	mergeSort(arr, mid+1, end);
	merge(arr, start, mid, end);
}

public static void merge(int[] arr, int start, int mid, int end) {
	if(arr[mid-1]<=arr[mid]) {
		return;
	}
	int i=start;
	int j=end;
	int tempIndex=0;
	
	int[] temp=new int[end-start];
	while(i<mid && j<end) {
		temp[tempIndex++]= arr[i]<=arr[j]?arr[i++]: arr[j++];
	}
	
	System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
	System.arraycopy(temp, 0, arr, start, tempIndex);
}
}
