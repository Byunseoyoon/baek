package java_src;

import java.io.*;

public class S5_14916_거스름돈 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int five = n/5;
        int two = 0;
        while(five>=0){
            int left =n-five*5;
            if(left%2==0){
                two = left/2;
                break;
            }else five--;
        }
        System.out.println(five + two);
    }
}
