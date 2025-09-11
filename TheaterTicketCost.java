import java.util.Scanner;

public class TheaterTicketCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of tickets
        System.out.print("Enter the no of ticket:");
        int tickets = sc.nextInt();

        // Validate ticket count
        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        // Input refreshment
        System.out.print("Do you want refreshment:");
        char refreshment = sc.next().toLowerCase().charAt(0);

        // Input coupon code
        System.out.print("Do you have coupon code:");
        char coupon = sc.next().toLowerCase().charAt(0);

        // Input circle type
        System.out.print("Enter the circle:");
        char circle = sc.next().toLowerCase().charAt(0);

        double ticketCost = 0;

        // Validate circle type
        if (circle == 'k') {
            ticketCost = 75;
        } else if (circle == 'q') {
            ticketCost = 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        // Calculate base cost
        double totalCost = tickets * ticketCost;

        // Apply 10% discount for more than 20 tickets
        if (tickets > 20) {
            totalCost = totalCost - (totalCost * 0.10);
        }

        // Apply 2% discount if coupon code is available
        if (coupon == 'y') {
            totalCost = totalCost - (totalCost * 0.02);
        }

        // Add refreshment cost if selected
        if (refreshment == 'y') {
            totalCost += tickets * 50;
        }

        // Print final cost
        System.out.printf("Ticket cost:%.2f", totalCost);

        sc.close();
    }
}
