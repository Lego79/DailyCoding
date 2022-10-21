package ProgrammersLv0;

public class iceAmericano {



    class Solution {
        public int[] solution(int money) {

            int[] answer = new int[2];


            answer[0] = money / 5500;
            answer[1] = money % 5500;

            return answer;

        }
    }

// 아아 = 5500;
// money = 머쓱이가 가지고 있는돈
// 구매가능 아아 갯수 , 잔돈,

}
