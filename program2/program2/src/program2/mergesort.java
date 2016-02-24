package program2;

public class mergesort {
	 
	      static public void Merge(int [] numbers, int left, int mid, int right)
	      {
	        int [] recu = new int[25];
	        int i, left_end, num_elements, num ;
	    
	        left_end = (mid - 1);
	        num = left;
	        num_elements = (right - left + 1);
	    
	        while ((left <= left_end) && (mid <= right))
	        {
	            if (numbers[left] <= numbers[mid])
	                recu[num++] = numbers[left++];
	            else
	                recu[num++] = numbers[mid++];
	        }
	    
	        while (left <= left_end)
	            recu[num++] = numbers[left++];
	 
	        while (mid <= right)
	            recu[num++] = numbers[mid++];
	 
	        for (i = 0; i < num_elements; i++)
	        {
	            numbers[right] = recu[right];
	            right--;
	        }
	    }
	 
	    static public void MergeSort_Recursive(int [] numbers, int left, int right)
	    {
	      int mid;
	    
	      if (right > left)
	      {
	        mid = (right + left) / 2;
	        MergeSort_Recursive(numbers, left, mid);
	        MergeSort_Recursive(numbers, (mid + 1), right);
	    
	        Merge(numbers, left, (mid+1), right);
	      }
	    }
	 
	 
	    public static void main(String[] args)
	      {
	        int[] numbers = { 13, 8, 7, 25, 2, 1, 9, 36, 59};
	        int length = 9;
	 
	  
	 
	        MergeSort_Recursive(numbers, 0, length - 1);
	        for (int i = 0; i < 9; i++)
	            System.out.println(numbers[i]);
	       
	    }
	}
	        

	
  


	
