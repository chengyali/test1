public class ErFenSort {
	/* public static void main(String[] args) {  
	        int []a={4,2,1,6,3,6,0,-5,1,1};  
	        int i,j;  
	        int low,high,mid;  
	        int temp;  
	        for(i=1;i<10;i++){  
	            temp=a[i];  
	            low=0;  
	            high=i-1;  
	            while(low<=high){  
	                mid=(low+high)/2;  
	                if(a[mid]>temp)  
	                    high=mid-1;  
	                else  
	                    low=mid+1;  
	                  
	            }  
	            for(j=i-1;j>high;j--)  
	                a[j+1]=a[j];  
	            a[high+1]=temp;  
	        }  
	        for(i=0;i<10;i++){  
	            System.out.print(a[i]+" ");  
	        }  
	    }  */
	
	
	/* public static void main(String[] args) {  
	        // 0下标数据用来作为哨兵  
	        int[] array = { 0, 49, 38, 65, 97, 76, 13, 27 };  
	        binaryInsertSort(array);  
	        for (int i = 1; i < array.length; i++) {  
	            System.out.print(array[i] + " ");  
	        }  
	    }  
	  
	    public static void binaryInsertSort(int[] array) {
	        int low, high, mid;  
	        for (int i = 2; i < array.length; i++) {  
//	          哨兵位  
	            array[0] = array[i];  
//	          要将第i位插入前i-1有序序列  
	            low = 1;  
	            high = i - 1;  
//	          折半查找  
	            while (low <= high) {  
	                mid = (low + high) / 2;  
	                System.out.println("low " + low + " high " +high + " mid " + mid);  
	                if (array[0] < array[mid]) {  
	                    high = mid - 1;  
	                } else {  
	                    low = mid + 1;  
	                }  
	            }  
//	          要插入high+1位置，需要把high+1——i-1位置上的数据依次后移一位  
	            for (int j = i - 1; j >= high + 1; j--) {  
	                array[j + 1] = array[j];  
	            }  
	            array[high + 1] = array[0];  
	        }  
	    }*/
	
	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 6, 3, 6, 0, -6, 8, 9 };
		int i, j;
		int low, high, mid;
		int temp;
		for (i = 1; i < 10; i++) {
			temp = a[i];
			low = 0;
			high = i - 1;
			while (low <= high) {
				mid = (low + high) / 2;
				if (a[mid] > temp) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			for (j = i - 1; j > high; j--) {
				a[j + 1] = a[j];
			}
			a[high + 1] = temp;
		}
		for (i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
