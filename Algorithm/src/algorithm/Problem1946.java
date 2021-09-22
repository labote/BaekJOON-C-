package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Problem1946 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T>0) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			StringTokenizer st;
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			solved(arr);
			
			T-=1;
		}
	}
	
	public static void solved(int[][] arr) {
		
		Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));
		
		int temp = arr[0][1];
		int ans = 1;
		
		for(int i=1;i<arr.length;i++) {
			
			if(temp > arr[i][1]) {
				temp = arr[i][1];
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
