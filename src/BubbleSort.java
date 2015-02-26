
public class BubbleSort {
	
	/*public static void main(String[] args){
		int[] arr = {67, 69, 75, 87, 89, 90, 99, 100};
		for(int i = 0;i<arr.length-1;i++){
			int temp=0;
			for(int j = i+1;j<arr.length-i-1;j++){
				if(arr[i]>arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
	}*/
	public static void main(String[] args){
		int[] arr={67, 69, 75, 87, 89, 90, 99, 100};
		for(int i = 0;i<arr.length;i++){
			int temp =0;
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j+1]>arr[j]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
				
			}
			
		}
		
		for(int a : arr){
			System.out.print(a+" ");
		}
	}
}
