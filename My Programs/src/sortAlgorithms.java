import java.util.Arrays;


public class sortAlgorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {3,2,7,6, -1, 0, -102};
		//selectionSort(test);
		quickSort(test,0,test.length-1);
	}
	
	public static void swap(int[] array, int a, int b){
		int placeholder = array[a];
		array[a] = array[b];
		array[b] = placeholder;
	}
	
	public static void selectionSort(int[] array){
		
		for(int i = 0; i < array.length; i++){
			int indexOfTmpMin = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[indexOfTmpMin]){
					indexOfTmpMin = j;
					
				}
				
				swap(array, i,indexOfTmpMin);
				System.out.println(Arrays.toString(array));
			}
				
			
		}
		
	}
	
	public static void bubbleSort(int[] array){
		for(int i = 0; i < array.length; i ++){ //2
			for(int j = i + 1; j < array.length; j++){ //3
				if(array[i] > array[j]){ //1
					swap(array, i,j); //4
					
				}
			}
		} System.out.println(Arrays.toString(array));//1
	}
	
	
	
	
	
	
	public static int[] merge(int[] a, int[] b){
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[a.length + b.length];
		while(i<a.length && j<b.length){
			if(a[i] < b[i]){
				result[k] = a[i];
				i++;
			}
			else{
				result[k] = b[j];
				j++;
			}
			k++;
		}
		while(i<a.length){
			result[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length){
			result[k] = b[j];
			j++;
			k++;
		}
		return result;
	}
	
	public static int factorial(int n){
		if(n<2) return 1;
		return n*factorial(n-1);
	}
	
	
	public static int[] mergeSort(int[] array){
		if(array.length == 1) return array;
		
		int half = (array.length)/2;
				
		int[] half1 = new int[half];
		int[] half2 = new int[array.length - half];
	
		for(int i = 0; i < half1.length; i++){
			half1[i] = array[i];
		}
		
		for(int j = 0; j < half2.length; j++){
			half2[j] = array[j + half];
		}
		
		return merge(mergeSort(half1), mergeSort(half2));
	}
	
	
	static int count = 0;
	public static void quickSort(int[] array, int start, int end){
		
		if(start == end) return;
		int pivotIndex = (end-start)/2;
		int pivot = array[pivotIndex];
		System.out.println("Pivot is " + pivot);
		
		if(pivot == 1) return;
		
		int i = 0;
		int j = array.length-1;
		
		while(i<j){
			if(array[i]>=pivot && array[j]<=pivot){
				System.out.println("Swapping " + array[i] +" and " + array[j]);
				swap(array, i ,j);
				i++;
				j++;
			}
			if(array[i]<=pivot){
				i++;
			}
			if(array[j]>pivot){
				j--;
			}
		}
		quickSort(array, start, j);
		quickSort(array, j+1, end);
	}
	
	
	
	public static void quickSort1(int[] array, int first, int last){
		if(last==first) return;
		int pivotIndex = (first+last)/2;
		int pivot = array[pivotIndex];
		
		int i = first;
		int j = last;
		
		while(i<j){
			if(array[i] >= pivot && array[j] <= pivot){
				swap(array, i, j);
				i++;
				j--;
			}
			if(array[i]<=pivot){
				i++;
			}
			if(array[j]>pivot){
				j--;
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
