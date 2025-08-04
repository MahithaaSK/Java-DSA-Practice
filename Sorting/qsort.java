
public class qsort {
     static void swap(int []arr, int ind1, int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
    
    static void qsort(int []arr,int left_ind,int right_ind)
    {
        if(left_ind>=right_ind) return;
        
        int pivot_ind = right_ind;
        int start =left_ind;
        int end = right_ind-1;
        while(start<=end)
        {
            while(start<=end && arr[start]<arr[pivot_ind]) start++;
            while(start<=end && arr[end]>arr[pivot_ind]) end--;
            if(start<end)
            swap(arr,start,end);
        }
        swap(arr,start,pivot_ind);
        qsort(arr,0,start-1);
        qsort(arr,start+1,right_ind);
    }
    static void arr_printer(int []arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    
	public static void main(String[] args) {
		int [] arr={2,50,63,74,5,36,1,4,9,30};
        arr_printer(arr);
        qsort(arr,0,arr.length-1);
        arr_printer(arr);
	}
    
}
