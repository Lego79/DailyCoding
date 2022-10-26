package ProgrammersLv0;

import java.util.Arrays;

public class sortingChar {

    class Solution {
        public String solution(String my_string) {
            String answer = "";

            my_string = my_string.toLowerCase();

            char[] charArr = my_string.toCharArray();



            Arrays.sort(charArr);

            return answer = String.valueOf(charArr);

        }
    }

}
