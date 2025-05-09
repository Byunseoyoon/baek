package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Long.parseLong;

public class S5_25206_너의평점은 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total =0;
        double sum=0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double point = Double.parseDouble(st.nextToken());

            String score = st.nextToken();
            if(score.equals("P")) continue;

            double grade = 0.0;
            switch (score) {
                case "A+" :grade= 4.5; break;
                case "A0" :grade= 4.0; break;
                case "B+" :grade= 3.5; break;
                case "B0" :grade= 3.0; break;
                case "C+" :grade= 2.5; break;
                case "C0" :grade= 2.0; break;
                case "D+" :grade= 1.5; break;
                case "D0" :grade= 1.0; break;
            };
            sum =sum+ grade*point;
            total+=point;
        }

        System.out.println(sum/total);


    }
}
