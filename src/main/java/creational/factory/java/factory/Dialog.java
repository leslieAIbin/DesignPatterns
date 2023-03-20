package creational.factory.java.factory;


import creational.factory.java.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
