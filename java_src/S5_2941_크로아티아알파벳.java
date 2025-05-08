package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_2941_크로아티아알파벳 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt=0;
        for(int i=0; i<str.length();i++){
            cnt++;
            if(i + 1 >= str.length()) continue;
            switch(str.charAt(i)){
                case 'c':
                    if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-') i++;
                    break;
                case 'd':
                    if(str.charAt(i+1)=='-' ) i++;
                    else if(i + 2 < str.length() && str.charAt(i+1)=='z' &&str.charAt(i+2)=='=') i+=2;
                    break;
                case 'l':
                    if(str.charAt(i+1)=='j') i++;
                    break;
                case  'n':
                    if(str.charAt(i+1)=='j') i++;
                    break;
                case 's':
                    if(str.charAt(i+1)=='=') i++;
                    break;
                case 'z':
                    if(str.charAt(i+1)=='=') i++;
                    break;
            }
        }

        System.out.println(cnt);

    }
}
