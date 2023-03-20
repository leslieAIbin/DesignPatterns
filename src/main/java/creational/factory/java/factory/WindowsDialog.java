package creational.factory.java.factory;

import creational.factory.java.buttons.Button;
import creational.factory.java.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

