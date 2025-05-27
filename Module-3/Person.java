import java.util.List;

public record Person(String name, int age) {

public class RecordsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Carol", 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people = List.of(p1, p2, p3);

        System.out.println("Adults:");
        people.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}
}

