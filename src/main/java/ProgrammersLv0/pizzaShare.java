package ProgrammersLv0;

public class pizzaShare {

    class Solution {
        public int solution(int n) {
            Integer answer = 0;
            if(n % 7 == 0) {
                answer = n /7;
            } else if (n % 7 != 0) {
                answer = n / 7 + 1;
            }




            return answer;
        }
    }

}
