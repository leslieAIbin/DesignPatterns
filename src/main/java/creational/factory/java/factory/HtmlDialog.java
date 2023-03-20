package creational.factory.java.factory;

import creational.factory.java.buttons.Button;
import creational.factory.java.buttons.HtmlButton;


/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
