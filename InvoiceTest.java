import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices do you want to enter? ");
        int n = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Enter part number: ");
            String partNumber = input.nextLine();

            System.out.print("Enter part description: ");
            String partDescription = input.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            System.out.print("Enter price per item: ");
            double pricePerItem = input.nextDouble();
            input.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("\n\n[ Invoice TEST ] " + (i + 1));
            System.out.println("Part Number: " + invoices[i].getPartNumber());
            System.out.println("Description: " + invoices[i].getPartDescription());
            System.out.println("Quantity: " + invoices[i].getQuantity());
            System.out.println("Price per item: " + invoices[i].getPricePerItem());
            System.out.println("Total Amount: " + invoices[i].getInvoiceAmount());
        }

        input.close();
    }
}
