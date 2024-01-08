package LLD.SOLID_Principles.Interface_Segregation_Principle;

public class After_Interface_Segregation_Principle {

    interface WaiterInterface {
        void serveCustomers();
    }

    interface ChefInterface {
        void cookFood();

        void decideMenu();
    }

    interface HelperInterface {
        void washDishes();
    }

    class Waiter implements WaiterInterface {
        @Override
        public void serveCustomers() {
            System.out.println("Serving customers and taking orders");
        }
    }
}
