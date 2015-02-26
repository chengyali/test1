import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class YuesefuSort {
 
//	public static void main(String[] args) {
//		System.out.println("请输入总数：");
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		System.out.println("请输入要出圈的数：");
//		int n = sc.nextInt();
//		int[] a = new int[m];
//		int len = m;
//		for(int k = 0;k<a.length;k++){
//			a[k] = k+1;
//		}
//		int i = 0;
//		int j = 1;
//		while(len>0){
//			if(a[i % m]>0){
//				if(j % n == 0){
//					System.out.print(a[i % m]+"出圈");
//					a[i % m] = -1;
//					j = 1;
//					i++;
//					len--;
//				}else{
//					i++;
//					j++;
//				}
//			}
//			else{
//				i++;
//			}
//		}
//				
//	}
	
	public static void main(String[] args) {
		System.out.println("请输入总人数");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("请输入要除权的数");
		int n = sc.nextInt();
		int[] a=new int[m];
		int leng = m;
		for(int k = 0;k<a.length;k++){
			a[k] = k+1;
		}
		int i=0;
		int j = 1;
		while(leng>0){
			if(a[i%m]>0){
				if(j%n==0){
					System.out.print(a[i%m]+"出局");
					a[i%m]=-1;
					j = 1;
					i++;
					leng--;
				}else{
					i++;
					j++;
				}
		}else{
			i++;
		}
	}
}
	}
