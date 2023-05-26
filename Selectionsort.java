
public class Selectionsort {
	
	    public static void main(String[] args) {
	        int[] array = {4,7,9,2,6,1,3,5};
	        
	        System.out.println("Original array is given as");
	        printArray(array);
	        
	        selectionSort(array);
	        
	        System.out.println("\nSorted array is given as:");
	        printArray(array);
	    }
	    
	    public static void selectionSort(int[] array) {
	        int length = array.length;
	        
	        for (int i = 0; i < length - 1; i++) {
	            int minIndex = i;
	            
	            for (int j = i + 1; j < length; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            swap(array, i, minIndex);
	        }
	    }
	    
	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

