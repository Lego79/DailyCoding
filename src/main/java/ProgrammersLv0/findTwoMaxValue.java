package ProgrammersLv0;

import java.util.Arrays;

public class findTwoMaxValue {


    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;



            Arrays.sort(numbers);

            int maxValue = numbers[numbers.length - 1];

            int SecondMaxValue = numbers[numbers.length - 2];

            answer = maxValue * SecondMaxValue;


            return answer;
        }
    }

}
