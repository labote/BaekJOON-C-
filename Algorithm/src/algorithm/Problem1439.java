package algorithm;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Problem1439{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String arry = br.readLine();
        String temp = "";
        int answer = 0;
        
        char a = arry.charAt(0);
        temp += a;
        
        for(int i=1;i<arry.length();i++) {
            
            if(a != arry.charAt(i)) {
                temp+=arry.charAt(i);
                a=arry.charAt(i);
            }
        }
        
        int x=0,y=0;
        
        for(int i=0;i<temp.length();i++) {
            if(temp.charAt(i)=='0') {
                x++;
            }
            
            if(temp.charAt(i)=='1') {
                y++;
            }
        }
        
        answer = Math.min(x,y);
        
        System.out.println(answer);
        
    }
}