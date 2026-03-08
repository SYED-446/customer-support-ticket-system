import java.util.ArrayList;
import java.util.List;

public class TicketService {
    List<Ticket> tickets = new ArrayList<>();

    public void createTicket(Ticket t) {
        tickets.add(t);
        System.out.println("Ticket Created Successfully!");
    }

    public void viewTickets() {
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }

    public Ticket searchTicket(int id) throws TicketNotFoundException {

        for (Ticket t : tickets) {
            if (t.getTicketId() == id) {
                return t;
            }
        }

        throw new TicketNotFoundException("Ticket ID Not Found!");
    }

    public void updateStatus(int id, String status) throws TicketNotFoundException {

        Ticket t = searchTicket(id);
        t.setStatus(status);
        System.out.println("Ticket Status Updated!");
    }

    public void deleteTicket(int id) throws TicketNotFoundException {

        Ticket t = searchTicket(id);
        tickets.remove(t);
        System.out.println("Ticket Deleted!");
    }
}
