public class Person {
    protected String name;
    protected int tickets;

    public Person(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public boolean availabilityTickets() {
        return tickets > 0;
    }

    public void useTicket() {
        tickets--;
    }

    public String getName() {
        return name;
    }

    public int getTickets() {
        return tickets;
    }
}
