package com.delete;

public class Delete1 {
	// Function to rotate array
	//	static void Rotate(int arr[], int d, int n)
	//	{
	//	    // Storing rotated version of array
	//	    int temp[] = new int[n];
	//	 
	//	    // Keeping track of the current index
	//	    // of temp[]
	//	    int k = 0;
	//	 
	//	    // Storing the n - d elements of
	//	    // array arr[] to the front of temp[]
	//	    for (int i = d; i < n; i++) {
	//	        temp[k] = arr[i];
	//	        k++;
	//	    }
	//	 
	//	    // Storing the first d elements of array arr[]
	//	    //  into temp
	//	    for (int i = 0; i < d; i++) {
	//	        temp[k] = arr[i];
	//	        k++;
	//	    }
	//	 
	//	    // Copying the elements of temp[] in arr[]
	//	    // to get the final rotated array
	//	    for (int i = 0; i < n; i++) {
	//	        arr[i] = temp[i];
	//	    }
	//	}
	//	 
	//	// Function to print elements of array
	//	static void PrintTheArray(int arr[], int n)
	//	{
	//	    for (int i = 0; i < n; i++) {
	//	        System.out.print(arr[i]+" ");
	//	    }
	//	}
	public static void main (String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int n = arr.length;
		int d = 2;

		//	        // Function calling
		//	        Rotate(arr, d, N);
		//	        PrintTheArray(arr, N);
		//	        int temp[] = new int[n];
		//	        int k = 0;
		//	        for (int i = d; i < n; i++) {
		//		        temp[k] = arr[i];
		//		        k++;
		//		    }
		//	        for (int i = 0; i < n; i++) {
		//		        arr[i] = temp[i];
		//		    }
		//	        for (int i = 0; i < n; i++) {
		//		        System.out.print(arr[i]+" ");
		//		    }

		int p = 1;
		while (p <= d) {
			int last = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = last;
			p++;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
