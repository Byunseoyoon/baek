package java_src;

import java.io.*;
import java.util.*;
public class S5_1181_단어정렬 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //Set<String> set = new HashSet<>();

        TreeSet<String> tree = new TreeSet<>((s1, s2)->{
            if(s1.length()!=s2.length()) return Integer.compare(s1.length(), s2.length());
            else return s1.compareTo(s2);
        });
        for(int i=0; i<n; i++){
            //set.add(br.readLine());
            tree.add(br.readLine());
        }

       // List<String> list = new ArrayList<>(set);
        // 주어진 정렬 기준(Comparator) 사용: 문자열 길이 기준 정렬 + 알파벳순
        // String::length == s->s.length() 와 같은 람다 표현식
        //list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));

        //for(String word: list){
        for(String word: tree){
            System.out.println(word);
        }

    }
}
