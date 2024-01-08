package LLD.SOLID_Principles.Dependency_Inversion_Principle;

public class After_Dependency_Inversion_Principle {

    interface Keyboard {
        public void pressKeys();
    }

    interface Mouse {
        public void clickButtons();
    }

    class WiredKeyboard implements Keyboard {
        @Override
        public void pressKeys() {
            System.out.println("Press keys");
        }
    }

    class BluetoothKeyboard implements Keyboard {
        @Override
        public void pressKeys() {
            System.out.println("Press keys");
        }
    }

    class WiredMouse implements Mouse {
        @Override
        public void clickButtons() {
            System.out.println("Click buttons");
        }
    }

    class BluetoothMouse implements Mouse {
        @Override
        public void clickButtons() {
            System.out.println("Click buttons");
        }
    }

    class Macbook {
        private final Keyboard keyboard;
        private final Mouse mouse;

        public Macbook(Keyboard keyboard, Mouse mouse) {
            this.keyboard = keyboard;
            this.mouse = mouse;
        }

        public Keyboard getKeyboard() {
            return this.keyboard;
        }

        public Mouse getMouse() {
            return this.mouse;
        }
    }
}
