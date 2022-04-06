package africa.semicolon.chapterSeventeen.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Dee", "Deji", 20),
                new Person("Lota", "Onwuka", 40),
                new Person("Jaycintha", "Esther", 12),
                new Person("Ruth", "Bae", 20)
        );

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);
//        printLastNameOfPeopleBeginningWithC
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
