package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem2217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		Integer[] arr = new Integer[N];

		for(int i=0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int answer = arr[0];
		
		for(int i=1;i<N;i++) {
			if(arr[i]*(i+1)>answer) {
				answer = arr[i]*(i+1);
			}
		}
		
		in.close();
		System.out.println(answer);
	}
}