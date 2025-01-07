package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_10814_나이순정렬 {
    static class Person{
        Integer age;
        String name;

        public Person(Integer age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> persons = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        persons.sort(Comparator.comparingInt(p -> p.age));
        for(Person p: persons){
            System.out.println(p.age + " " + p.name);
        }
    }
}
