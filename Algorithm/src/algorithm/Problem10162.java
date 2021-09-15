package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Problem10162 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        solved(N);
    }
 
    static void solved(int N) {
 
        int A = 0 ,B = 0,C = 0;
        
        while(N>=10) {
            if(N>=300) {
                A = N/300;
                N %= 300;
            } else if(N>=60) {
                B = N/60;
                N %= 60;
            } else {
                C = N/10;
                N %= 10;
            }
        }
        if(N!=0) {
            System.out.println(-1);
        } else {
            System.out.println(A + " " + B + " " + C);
        }
    }
}
