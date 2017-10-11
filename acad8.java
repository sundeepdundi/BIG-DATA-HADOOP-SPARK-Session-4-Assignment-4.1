package assignment;

//Assignment 4.1
//8) Write a program in java using Arrays, that sorts the element in descending order.–

public class acad8 {
	static void printArrayContents(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	static void sortArrayContents(int array[], int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int midIndex = (endIndex + startIndex) / 2;
			sortArrayContents(array, startIndex, midIndex);
			sortArrayContents(array, midIndex + 1, endIndex);
			mergeArrayContents(array, startIndex, midIndex, endIndex);
		}
	}

	static void mergeArrayContents(int array[], int startIndex, int midIndex, int endIndex) {
		// Find sizes of two subarrays to be merged
		int sizeOfLeftArray = midIndex - startIndex + 1;
		int sizeOfRightArray = endIndex - midIndex;
		/* Create temp arrays */
		int leftArray[] = new int[sizeOfLeftArray];
		int rightArray[] = new int[sizeOfRightArray];

		/* Copy data to temp arrays */
		for (int i = 0; i < sizeOfLeftArray; ++i)
			leftArray[i] = array[startIndex + i];
		for (int j = 0; j < sizeOfRightArray; ++j)
			rightArray[j] = array[midIndex + 1 + j];
		
		 /* Merge the temp arrays */
		 
        // Initial indexes of first and second subarrays
        int leftCounter = 0, rightCounter = 0;
 
        // Initial index of merged subarry array
        int mergedArrayIndex = startIndex;
        while (leftCounter < sizeOfLeftArray && rightCounter < sizeOfRightArray)
        {
            if (leftArray[leftCounter] >= rightArray[rightCounter])
            {
                array[mergedArrayIndex] = leftArray[leftCounter];
                leftCounter++;
            }
            else
            {
                array[mergedArrayIndex] = rightArray[rightCounter];
                rightCounter++;
            }
            mergedArrayIndex++;
        }
 
        /* Copy remaining elements of leftArray[] if any */
        while (leftCounter < sizeOfLeftArray)
        {
            array[mergedArrayIndex] = leftArray[leftCounter];
            leftCounter++;
            mergedArrayIndex++;
        }
 
        /* Copy remaining elements of rightArray[] if any */
        while (rightCounter < sizeOfRightArray)
        {
            array[mergedArrayIndex] = rightArray[rightCounter];
            rightCounter++;
            mergedArrayIndex++;
        }		
		
		

	}

	public static void main(String[] args) {
		int array[] = { 12, 23, 5, 9, 3, 16, 15, 14, 21, 23, 18 };
		System.out.println("Intial array");
		printArrayContents(array);
		System.out.println();
		sortArrayContents(array, 0, array.length-1);
		System.out.println("Sorted array");
		printArrayContents(array);
	}
}
