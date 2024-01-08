package LLD.SOLID_Principles.Open_Closed_Principle;

public class After_Open_Closed_Principle {
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

    interface InvoiceDAO {
        public void save(Invoice invoice);
    }

    class InvoiceDatabaseDAO implements InvoiceDAO {
        private Invoice invoice;

        @Override
        public void save(Invoice invoice) {
            this.invoice = invoice;
            // save data into DB
            System.out.println(this.invoice);
        }
    }

    class InvoiceFileDAO implements InvoiceDAO {
        private Invoice invoice;

        @Override
        public void save(Invoice invoice) {
            this.invoice = invoice;
            // write data into File
            System.out.println(this.invoice);
        }
    }
}
