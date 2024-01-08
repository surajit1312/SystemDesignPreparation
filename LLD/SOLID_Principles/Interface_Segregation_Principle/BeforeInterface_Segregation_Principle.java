package LLD.SOLID_Principles.Interface_Segregation_Principle;

public class BeforeInterface_Segregation_Principle {

    interface RestaurantEmployee {
        void washDishes();

        void serveCustomers();

        void cookFood();

        void decideMenu();
    }

    class Waiter implements RestaurantEmployee {

        @Override
        public void washDishes() {
            // not my job (not intended task)
        }

        @Override
        public void serveCustomers() {
            System.out.println("Serving customers and taking orders");
        }

        @Override
        public void cookFood() {
            // not my job (not intended task)
        }

        @Override
        public void decideMenu() {
            // not my job (not intended task)
        }

    }
}
