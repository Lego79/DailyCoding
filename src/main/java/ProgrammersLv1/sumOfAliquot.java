package ProgrammersLv1;

import java.util.stream.IntStream;

public class sumOfAliquot {

    class Solution {
        public int solution(int n) {
            return (int) IntStream.rangeClosed(1, n).filter(i->n % i ==0).sum();
        }
    }

}
