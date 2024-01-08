package LLD.SOLID_Principles.Single_Responsibility_Principle;

/**
 * Before_Single_Responsibility_Principle
 */
public class Before_Single_Responsibility_Principle {

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

        public void printInvoice() {
            // print the invoice
        }

        public void saveToDB() {
            // save data into DB
        }
    }
}
