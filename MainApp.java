import java.util.Scanner;

public class MainApp {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketService service = new TicketService();

        while (true) {

            System.out.println("\n--- Customer Support Ticket System ---");
            System.out.println("1 Create Ticket");
            System.out.println("2 View Tickets");
            System.out.println("3 Search Ticket");
            System.out.println("4 Update Ticket Status");
            System.out.println("5 Delete Ticket");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Ticket ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Customer Name: ");
                        String name = sc.nextLine();

                        System.out.print("Issue: ");
                        String issue = sc.nextLine();

                        System.out.print("Priority: ");
                        String priority = sc.nextLine();

                        Ticket t = new Ticket(id, name, issue, "Open", priority);
                        service.createTicket(t);

                        break;

                    case 2:
                        service.viewTickets();
                        break;

                    case 3:

                        System.out.print("Enter Ticket ID: ");
                        int searchId = sc.nextInt();

                        System.out.println(service.searchTicket(searchId));
                        break;

                    case 4:

                        System.out.print("Enter Ticket ID: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("New Status: ");
                        String status = sc.nextLine();

                        service.updateStatus(updateId, status);
                        break;

                    case 5:

                        System.out.print("Enter Ticket ID: ");
                        int deleteId = sc.nextInt();

                        service.deleteTicket(deleteId);
                        break;

                    case 6:
                        System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
