package Study;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {

        List<streamStudy.People> femaleList = streamStudy.People.getPeopleList().stream().filter(people -> people.getGender() == 1).collect(Collectors.toList());

    }
}
