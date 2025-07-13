package java_src;

import java.io.*;
import java.util.*;


public class S4_1620_나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] numToName = new String[N+1];
        Map< String, Integer> nameToNum = new HashMap<>();

        for(int i=1; i<=N; i++){
            String name = br.readLine();
            numToName[i]= name;
            nameToNum.put(name, i);
        }

        while(M-->0){
            String query = br.readLine();
            if(query.matches("\\d+")){
                bw.write(numToName[Integer.parseInt(query)]+"\n");
            }else{
                bw.write(nameToNum.get(query)+"\n");
            }
        }
        bw.flush();

    }
}
