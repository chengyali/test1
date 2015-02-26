import java.util.Scanner;


public class Feibonaqie {
	
	public static void main(String[] args){
		int i = 1 , j = 1;
		for(int n = 1;n<=6;n++){
			System.out.print(" "+i+" "+j);
			i = i+j;
			j = i+j;
		}
	}
}
