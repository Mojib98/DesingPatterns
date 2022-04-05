package factory;

import factory.creator.ButtonCreator;
import factory.product.WindowsButton;

public class f {
    public static void main(String[] args) {
        ButtonCreator buttonCreator= WindowsButton::new;
        buttonCreator.createButton();
    }
}
