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
	        // 0�±�����������Ϊ�ڱ�  
	        int[] array = { 0, 49, 38, 65, 97, 76, 13, 27 };  
	        binaryInsertSort(array);  
	        for (int i = 1; i < array.length; i++) {  
	            System.out.print(array[i] + " ");  
	        }  
	    }  
	  
	    public static void binaryInsertSort(int[] array) {
	        int low, high, mid;  
	        for (int i = 2; i < array.length; i++) {  
//	          �ڱ�λ  
	            array[0] = array[i];  
//	          Ҫ����iλ����ǰi-1��������  
	            low = 1;  
	            high = i - 1;  
//	          �۰����  
	            while (low <= high) {  
	                mid = (low + high) / 2;  
	                System.out.println("low " + low + " high " +high + " mid " + mid);  
	                if (array[0] < array[mid]) {  
	                    high = mid - 1;  
	                } else {  
	                    low = mid + 1;  
	                }  
	            }  
//	          Ҫ����high+1λ�ã���Ҫ��high+1����i-1λ���ϵ��������κ���һλ  
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
