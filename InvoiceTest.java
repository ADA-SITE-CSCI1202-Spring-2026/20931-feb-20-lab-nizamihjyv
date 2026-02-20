import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StringBuilder inputLog = new StringBuilder();
        StringBuilder output = new StringBuilder();

        System.out.print("How many invoices do you want to enter? ");
        int n = input.nextInt();
        input.nextLine();

        inputLog.append("Number of invoices: ").append(n).append("\n");

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Enter part number: ");
            String partNumber = input.nextLine();
            inputLog.append("Invoice ").append(i + 1)
                    .append(" part number: ").append(partNumber).append("\n");

            System.out.print("Enter part description: ");
            String partDescription = input.nextLine();
            inputLog.append("Description: ").append(partDescription).append("\n");

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            inputLog.append("Quantity: ").append(quantity).append("\n");

            System.out.print("Enter price per item: ");
            double pricePerItem = input.nextDouble();
            input.nextLine();
            inputLog.append("Price per item: ").append(pricePerItem).append("\n");

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        for (int i = 0; i < invoices.length; i++) {
            output.append("\n\n[ Invoice ] ").append(i + 1).append("\n");
            output.append("Part Number: ").append(invoices[i].getPartNumber()).append("\n");
            output.append("Description: ").append(invoices[i].getPartDescription()).append("\n");
            output.append("Quantity: ").append(invoices[i].getQuantity()).append("\n");
            output.append("Price per item: ").append(invoices[i].getPricePerItem()).append("\n");
            output.append("Total Amount: ").append(invoices[i].getInvoiceAmount()).append("\n");
        }

        System.out.println(output.toString());

        input.close();
    }
}
