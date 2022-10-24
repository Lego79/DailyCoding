package ProgrammersLv0;

import java.util.ArrayList;

public class multipleOfN {



    class Solution {
        public ArrayList solution(int n, int[] numlist) {

            ArrayList<Integer> answer = new ArrayList<>();

            for(int num : numlist){
                if(num % n == 0){
                    answer.add(num);
                }
            }

            return answer;
        }
    }

}
