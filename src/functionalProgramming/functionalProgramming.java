import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.*;

public class functionalProgramming {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("qq", Gender.FEMALE),
            new Person("ww", Gender.MALE),
            new Person("ee", Gender.FEMALE),
            new Person("rr", Gender.FEMALE),
            new Person("tt", Gender.MALE),
            new Person("yy", Gender.FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : females){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        // Declarative approach
        List<Person> people2 = people.stream()
            .filter(person -> Gender.FEMALE.equals(person.gender))
            .collect(Collectors.toList());
        people2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        
        public String toString(){
            return "Person{"+
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
