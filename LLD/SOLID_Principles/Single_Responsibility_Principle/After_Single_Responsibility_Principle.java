package LLD.SOLID_Principles.Single_Responsibility_Principle;

public class After_Single_Responsibility_Principle {
    class Marker {
        String name;
        String color;
        int year;
        int price;

        public Marker(String name, String color, int year, int price) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

    class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            return marker.price * this.quantity;
        }
    }

    class InvoicePrinter {
        private Invoice invoice;

        public InvoicePrinter(Invoice invoice) {
            this.invoice = invoice;
        }

        public void printInvoice() {
            // print the invoice
            System.out.println(invoice);
        }
    }

    class InvoiceDAO {
        private Invoice invoice;

        public InvoiceDAO(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // save data into DB
            System.out.println(invoice);
        }
    }
}
