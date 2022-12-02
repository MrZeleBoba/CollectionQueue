import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();

        List<Person> clients = generatePerson();
        for (Person client : clients) {
            queue.offer(client);

        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Клиент " + person.getName() + " посетил атракцион");
            person.useTicket();
            if (person.availabilityTickets()) {
                queue.offer(person);
            }
        }


    }

    public static List<Person> generatePerson() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Pasha", 2));
        people.add(new Person("Aleksey", 4));
        people.add(new Person("Olya", 1));
        people.add(new Person("Tanya", 3));
        people.add(new Person("Volandemort", 5));
        return people;

    }
}
