package ProgrammersLv0;

import java.util.List;
import java.util.ArrayList;

public class Array {


    class Solution {
        public int[] solution(int n) {
            List<Integer> answer = new ArrayList<>();
            for(int i=1; i<=n; i++){
                if(n % i == 0){
                    answer.add(i);
                }
            }
            return answer.stream().mapToInt(x -> x).toArray();
        }
    }

}