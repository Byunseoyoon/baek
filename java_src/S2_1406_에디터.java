package java_src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2_1406_에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();       // 초기 입력되어 있는 문자열
        List<Character> list = new LinkedList<>();

        for(int i =0 ; i<input.length(); i++){
            list.add(input.charAt(i));
        }

        ListIterator<Character> listIterator = list.listIterator(list.size());
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char order = st.nextToken().charAt(0);
            switch(order){
                case 'L':
                    if(listIterator.hasPrevious()) listIterator.previous();
                    break;
                case 'D':
                    if(listIterator.hasNext()) listIterator.next();
                    break;
                case 'B':
                    if(listIterator.hasPrevious()){
                        // 방향키가 최근 리턴한 노트 가리키고있기 때문에 앞 쪽 이동 후 삭제
                        listIterator.previous();
                        listIterator.remove();
                    }
                    break;
                case 'P':
                    listIterator.add(st.nextToken().charAt(0));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: list){
            sb.append(c);
        }

        System.out.println(sb);

    }
}
