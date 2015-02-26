
public class Choicesort {
 
	
	public static void main(String[] args){
		int[] arr = {5,4,8,3,2,0};
		for(int i= 0;i<arr.length;i++){
			int temp = 0;
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		
			
		
	}
}
  

	

