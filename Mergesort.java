
public class Mergesort {  
	    public static void main(String[] args) {
	        int[] array = {7,3,4,2,1,9,5,8,6};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        mergeSort(array);
	        
	        System.out.println("\nSorted array:");
	        printArray(array);
	    }
	    
	    public static void mergeSort(int[] array) {
	        int length = array.length;
	        
	        if (length < 2) {
	            return;
	        }
	        
	        int mid = length / 2;
	        int[] leftArray = new int[mid];
	        int[] rightArray = new int[length - mid];
	        
	        System.arraycopy(array, 0, leftArray, 0, mid);
	        System.arraycopy(array, mid, rightArray, 0, length - mid);
	        
	        mergeSort(leftArray);
	        mergeSort(rightArray);
	        
	        merge(array, leftArray, rightArray);
	    }
	    
	    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
	        int leftLength = leftArray.length;
	        int rightLength = rightArray.length;
	        int i = 0, j = 0, k = 0;
	        
	        while (i < leftLength && j < rightLength) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k++] = leftArray[i++];
	            } else {
	                array[k++] = rightArray[j++];
	            }
	        }
	        
	        while (i < leftLength) {
	            array[k++] = leftArray[i++];
	        }
	        
	        while (j < rightLength) {
	            array[k++] = rightArray[j++];
	        }
	    }
	    
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


