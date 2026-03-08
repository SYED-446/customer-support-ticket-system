public class Ticket {
     private int ticketId;
    private String customerName;
    private String issue;
    private String status;
    private String priority;

    public Ticket(int ticketId, String customerName, String issue, String status, String priority) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issue = issue;
        this.status = status;
        this.priority = priority;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssue() {
        return issue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public String toString() {
        return "Ticket ID: " + ticketId +
                " | Name: " + customerName +
                " | Issue: " + issue +
                " | Status: " + status +
                " | Priority: " + priority;
    }
}
