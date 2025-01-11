package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2439_별찍기2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        for(int i=0; i<x;i++){
            for(int j=0; j<x; j++){
                if(j<x-1-i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
