package ProgrammersLv0;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ComparingArrays {


    class Solution {
        public int solution(String[] s1, String[] s2) {
//            return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();







//            return (int)Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(a -> a).count();
            return (int)Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).count();

        }
    }

//    class Solution {
//        public int solution(String[] s1, String[] s2) {
//            int answer = 0;
//
//            List<String> list1 = Arrays.asList(s1);
//            List<String> list2 = Arrays.asList(s2);
//
//            list1 = list1.stream().filter()
//
//
//
//
//
//            return answer;
//        }
//    }

}
