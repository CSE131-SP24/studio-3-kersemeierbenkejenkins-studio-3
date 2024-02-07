package studio3;
import java.util.Scanner;
public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How big do you want your array to be?:");
		int n = in.nextInt();
		boolean arraySize[] = new boolean[n+1];
		for(int i=2; i<n; i++) {
			arraySize[i]=true;
		}
		for(int i=2; i<Math.sqrt(n); i++) {
			if(arraySize[i]==true) {
				
			}
		}
		
	}

}
