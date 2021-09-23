package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem1715 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i=0;i<N;i++) {
			priorityQueue.add(Integer.parseInt(br.readLine()));
		}
		
		/*
		 * while(!priorityQueue.isEmpty()) { int x = priorityQueue.poll(); }
		 */
		solved(priorityQueue);
	}
	
	public static void solved(PriorityQueue<Integer> priorityQueue) {
		
		int sum=0;

		while(!priorityQueue.isEmpty()) {
			
			if(priorityQueue.size()>1) {
				int x = priorityQueue.poll();
				int y = priorityQueue.poll();

				sum+=(x+y);

				if(!priorityQueue.isEmpty()) {
					priorityQueue.add(x+y);
				}
			}
			else {
				break;
			}
		}
		
		System.out.println(sum);
	}

}
