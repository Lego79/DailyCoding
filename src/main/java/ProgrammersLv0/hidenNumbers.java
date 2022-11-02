package ProgrammersLv0;

public class hidenNumbers {

    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            for(int i = 0; i < my_string.length(); i ++) {
                if(Character.isDigit(i)) answer += i;
            }

            return answer;
        }
    }

}
