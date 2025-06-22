package pkg_1251;
// 실버 5지만 체감상 생각할게 되게 많았던 문제
// 문자열을 총 3번 순회하면서 사전상 가장 앞에 오는 문자를 찾고 그 문자의 인덱스를 기억해서 출력 리스트에 담는 것으로 문제를 해결함
// 근데 만약 가장 앞에 오는 문자가 여러개 있으면 어차피 나중에 뒤집어야하니 그 문자 전의 문자, 그 전의 문자도 같으면 그 전전의 문자를 비교해서
// 더 작은 전의 문자를 가지는 문자를 인덱스로 가져옴
// 근데 또 여기서 만약 제일 작은 문자가 문자열의 첫 문자면(생각해보니 안해도 될거 같은데... 째뜬 함) 뒤에 동일한 문자가 나와도 이 첫 문자를 인덱스로 함
// 어차피 근데 이렇게 안해도 결과가 비슷할 것 같긴함 ㅋㅋ

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        String word = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add((int)word.charAt(i));
        }

        List<String> r = new ArrayList<>();
        int prv_idx = -1;
        int idx = -1;
        int cnt = 2;
        int front_idx = 0;

        for (int j = 0; j < 3; j++) {
            int min = 9999;
            int temp_idx1 = 0;
            int temp_idx2 = 0;
            for (int i = idx + 1; i < list.size() - cnt; i++) {
                if (list.get(i) <= min) {
                    if (list.get(i) == min) {
                        if (idx == front_idx) continue;
                        temp_idx1 = i - 1;
                        temp_idx2 = idx - 1;
                        while (list.get(temp_idx1) == list.get(temp_idx2)) {
                            temp_idx1--;
                            temp_idx2--;
                        }
                        if (list.get(temp_idx1) < list.get(temp_idx2)) {
                            min = list.get(i);
                            idx = i;
                        } else {
                            min = list.get(i);
                        }
                        temp_idx1 = 0;
                        temp_idx2 = 0;
                    } else {
                        min = list.get(i);
                        idx = i;
                    }
                }
            }
            
            if (cnt >= 1) {
                for (int i = idx; i > prv_idx; i--) {
                    r.add(word.charAt(i) + "");
                }
            } else {
                for (int i = list.size() - 1; i > prv_idx; i--) {
                    r.add(word.charAt(i) + "");
                }
            }

            prv_idx = idx;
            front_idx = idx;
            cnt--;    

            }
            for (String s : r) System.out.print(s);


        sc.close();

    }
}

