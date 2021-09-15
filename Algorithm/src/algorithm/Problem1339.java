package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1339 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String [] arr = new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();
		}
		
		solved(N, arr);
	}
	
	static void solved(int N, String[] arr) {
		int[] arrNum = new int[26];
		int answer = 0;
		int index = 9;
		
		for(int i=0;i<N;i++) {
			int size = arr[i].length();
			for(int j=0;j<arr[i].length();j++, size--) {
				arrNum[arr[i].charAt(j)-65] += Math.pow(10, size-1);
			}
		}
		
		Arrays.sort(arrNum);
		
		for (int i = 25; i >= 0; i--, index--) {
			if (arrNum[i] == 0) {
				break;
			}
			answer += arrNum[i] * index;
		}

		System.out.println(answer);

	}
}