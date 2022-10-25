package Study;

import java.util.List;
import java.util.Arrays;

public class streamStudy {

    public class People {
        public static List<People> getPeopleList;
        private String name;
        private int age;
        private static int gender;


        public People(String name, int age, int gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String toString() {
            return "People(name=" +name + ", age=" + age + ", gender =" + gender +")";
        }

        public static List<People> getPeopleList() {
            return Arrays.asList(
               new People("홍길동", 30, 1),
               new People("홍길명", 33, 1),
               new People("홍길순", 27, 2),
               new People("홍길자", 25, 2)
            );
        }

    }
}
