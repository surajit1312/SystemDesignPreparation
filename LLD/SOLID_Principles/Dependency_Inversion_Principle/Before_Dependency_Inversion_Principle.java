package LLD.SOLID_Principles.Dependency_Inversion_Principle;

public class Before_Dependency_Inversion_Principle {

    class WiredKeyboard {
        public void pressKeys() {
            // press keys
        }
    }

    class WiredMouse {
        public void clickButtons() {
            // click mouse buttons
        }
    }

    class Macbook {
        private final WiredKeyboard keyboard;
        private final WiredMouse mouse;

        public Macbook() {
            keyboard = new WiredKeyboard();
            mouse = new WiredMouse();
        }

        public WiredKeyboard getKeyboard() {
            return this.keyboard;
        }

        public WiredMouse getMouse() {
            return this.mouse;
        }
    }
}
